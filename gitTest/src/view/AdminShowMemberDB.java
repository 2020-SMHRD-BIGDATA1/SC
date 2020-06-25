package view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import model.MemberVO;

public class AdminShowMemberDB extends JPanel implements MouseListener{

	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private JTable table = null;
	Vector<String> colName = new Vector<String>();
	private ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public int getBoardNum(int row) {
		return list.get(row).getNumber();
	}
	
	public JTable getTable() {
		int number = 0;
		String id = null;
		String name = null;
		String addr = null;
		String phone = null;
		String[] inputStr = new String[5];
		getConnection();
	
		 list = new ArrayList<MemberVO>();
	
		 String sql = "select * from MEMBERS";
	
		 try 
			{
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				
					while(rs.next())
					{
						
						int memberNum = rs.getInt("memberNum");
						String memberID = rs.getString("memberID");;
						String memberName = rs.getString("MemberName");
						String memberAddr = rs.getString("memberAddr");
						String memberPhone = rs.getString("MemberPhone");
						MemberVO vo = new MemberVO(memberNum, memberID, memberName, memberAddr, memberPhone);
						//MemberVO vo = new MemberVO(memberID, memberName, memberAddr, memberPhone);
						list.add(vo);
					}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
	
		 Dimension dim = new Dimension(400,800);
		 
		String header[] = {"번호", "아이디", "이름", "주소", "전화"};
		// String header[] = {"아이디", "이름", "주소", "전화"};
			String[][] data = new String[list.size()][5];
			for(int i = 0; i < data.length; i++) {
					data[i][0] = list.get(i).getNumber()+""; 
					data[i][1] = list.get(i).getId(); 
					data[i][2] = list.get(i).getName(); 
					data[i][3] = list.get(i).getAddr();
					data[i][4] = list.get(i).getPhone();
			}
			DefaultTableModel model = new DefaultTableModel(data, header);
			JTable table = new JTable(model);
	
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.addMouseListener(this);
			
			return table;
	
}
private static void getConnection()
{
	
	
	//한번 실행 시켜보고
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		conn = DriverManager.getConnection(url, user, password);
		if(conn != null)
		System.out.println("DB연결 성공!!!!");
		else
		System.out.println("DB연결 실패....");

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//DB연결
	
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



@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
