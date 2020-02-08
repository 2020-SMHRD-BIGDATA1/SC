package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.MemberDAO;
import model.MemberVO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class AdminMemberSelect {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
	
	JFrame frame;
	private int memberNum;
	private JLabel lblShowID;
	private String id;
	private String addr;
	private String name;
	private String phone;
	private MemberVO vo=null;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdminUserSelect window = new AdminUserSelect();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AdminMemberSelect(int memberNum) {
		initialize(memberNum);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int memberNum) {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		MemberDAO dao = new MemberDAO();
		MemberVO membervo = dao.getBoard(memberNum);
		System.out.println(membervo.getId()+"Àß³ª¿Ô´Ù."+membervo.getAddr());
		
		lblShowID = new JLabel("New label");
		lblShowID.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 12));
		lblShowID.setBackground(Color.WHITE);
		lblShowID.setBounds(153, 109, 139, 20);
		frame.getContentPane().add(lblShowID);
		
		lblShowID.setText(membervo.getId());
		
		JLabel lblShowAddr = new JLabel("New label");
		lblShowAddr.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 12));
		lblShowAddr.setBounds(153, 241, 323, 20);
		frame.getContentPane().add(lblShowAddr);
		
		lblShowAddr.setText(membervo.getAddr());
		
		JLabel lblShowName = new JLabel("");
		lblShowName.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 12));
		lblShowName.setBounds(153, 152, 142, 20);
		frame.getContentPane().add(lblShowName);
		String a = membervo.getId();
		lblShowName.setText(membervo.getName());
		
		JButton btnRemove = new JButton("\uD68C\uC6D0 \uC0AD\uC81C");
		btnRemove.setBackground(new Color(0, 0, 0));
		btnRemove.setForeground(new Color(175, 238, 238));
		btnRemove.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("¿©±â¾ß" + memberNum);
				
				int cnt = dao.remove(a, memberNum);
				
				if(cnt !=0 )
				{
					JOptionPane.showMessageDialog(frame, ("»èÁ¦ ¼º°ø!!!!"), "¸â¹ö »èÁ¦",
					JOptionPane.INFORMATION_MESSAGE);
					
					frame.dispose();
					AdminShowMemberMain adminShowMemberMain = new AdminShowMemberMain();
				}
					
				else
					JOptionPane.showMessageDialog(frame, ("»èÁ¦ ½ÇÆÐ...."), "¸â¹ö »èÁ¦",
							JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		btnRemove.setBounds(437, 16, 97, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnBack = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setForeground(new Color(175, 238, 238));
		btnBack.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				AdminShowMemberMain adminShowMemberMain = new AdminShowMemberMain();
			}
		});
		btnBack.setBounds(21, 13, 97, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblShowPhone = new JLabel("New label");
		lblShowPhone.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 12));
		lblShowPhone.setBounds(152, 196, 142, 20);
		frame.getContentPane().add(lblShowPhone);
		lblShowPhone.setText(membervo.getPhone());
		
		URL url = this.getClass().getResource("../GUI_Image/member_managing2.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		frame.getContentPane().add(login_background);
		login_background.setBounds(0, 0, 550, 350);		
		
	}
	private void getConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null)
				System.out.println("DB¿¬°á ¼º°ø!!!!");
				else
				System.out.println("DB¿¬°á ½ÇÆÐ....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void close()
	{
			try {
				if(rs != null)
					rs.close();
				if(pst != null)
					pst.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}
}
