package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public MemberVO selectOne(MemberVO user) {
		MemberVO loginUser = null;
		
		getConnection();
		
		String sql = "select * from members where MemberID = ? and MemberPW = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			
			rs = pst.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("MemberID");
				String pw = rs.getString("MemberPW");
				String name = rs.getString("MemberName");
				
				loginUser = new MemberVO(id, pw, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		finally {
			close();
		}
		
		return loginUser;
	}

	public int insert(MemberVO joinUser) {
		
		int cnt = 0;
		getConnection();

		try {		
			String sql = "insert into members values(Members_Sequence.nextval, ?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, joinUser.getId());
			pst.setString(2, joinUser.getPw());
			pst.setString(3, joinUser.getName());
			pst.setString(4, joinUser.getAddr());
			pst.setString(5, joinUser.getPhone());
			pst.setString(6, joinUser.getCode());
			
			cnt = pst.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			close();
		}
				
		return cnt;
	}

	public MemberVO getBoard(int memberNum) {
		MemberVO vo = null;
		getConnection();
		//String sql = "select number, memberID, memberName, memberAddr, memberPhone from MEMBERS where boardNum = ?";
		String sql = "select * from MEMBERS where memberNum = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, memberNum);
			rs = pst.executeQuery();
			
		if(rs.next()) {
			
			int number = rs.getInt(1);
			String id = rs.getString(2);
			String name = rs.getString(4);
			String addr = rs.getString(5);
			String phone = rs.getString(6);
			
			vo = new MemberVO(number, id, name, addr, phone);
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	
		
		
		return vo;
	}

	public int remove(String a, int memberNum) {
		int cnt = 0;
		getConnection();
		
		try {
			String sql = "delete from BOARDS where memberID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, a);
		
			cnt = pst.executeUpdate();
			
			System.out.println("너는" + cnt);
			
			
			sql = "delete from MEMBERS where memberNum = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, memberNum);
			
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
	
		return cnt;
	}
	public int remove(int boardNum) {
		int cnt = 0;
		getConnection();
		
		try {
			String sql = "delete from BOARDS where boardNum = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, boardNum);
			
			cnt = pst.executeUpdate();
			
			System.out.println("너는" + cnt);
			
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return cnt;
	}

}
