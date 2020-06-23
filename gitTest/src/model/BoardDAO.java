package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class BoardDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
	private void getConnection()
	{
		
		
		//�ѹ� ���� ���Ѻ���
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null)
			System.out.println("DB���� ����!!!!");
			else
			System.out.println("DB���� ����....");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DB����
		
	}
	private void close()
	{
		try
		{
			if(rs != null)
			{
				rs.close();
			}
			if(pst != null)
			{
				pst.close();
			}
			if(conn != null)
			{
				conn.close();
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public int insert(BoardVO board) {
		int row = 0;
		getConnection();
		
		try {
			String sql = "insert into BOARDS(boardNum, boardTitle, boardAddr, boardContent, memberID) "
					+ "values (BOARDS_Sequence.NEXTVAL, ?, ?, ?, ?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, board.getTitle());
			pst.setString(2, board.getAddr());
			pst.setString(3, board.getContent());
			pst.setString(4, "asjhklsd");//ȸ�����̺��� ������ id
			
			row = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return row;
	}
	public BoardVO getBoard(int boardNum) {
		
		BoardVO vo = null;
		getConnection();
		String sql = "select boardTitle, boardAddr, boardContent, memberID from BOARDS where boardNum = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, boardNum);
			rs = pst.executeQuery();
			
		if(rs.next()) {
			
			String boardTitle_g = rs.getString(1);
			String boardAddr_g = rs.getString(2);
			String boardContent_g = rs.getString(3);
			String memberID_g = rs.getString(4);
			
			vo = new BoardVO(boardTitle_g, boardAddr_g, boardContent_g, memberID_g);
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	
		
		
		return vo;
		
	}
	


}
