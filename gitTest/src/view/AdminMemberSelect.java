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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminMemberSelect {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
	
	JFrame frame;
	private int memberNum;
	private JLabel lblTitle;
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
		frame.setBounds(100, 100, 574, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		MemberDAO dao = new MemberDAO();
		MemberVO membervo = dao.getBoard(memberNum);
		System.out.println(membervo.getId()+"�߳��Դ�."+membervo.getAddr());
		
		
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setBounds(12, 10, 145, 48);
		frame.getContentPane().add(lblNewLabel);
		
		lblTitle = new JLabel("New label");
		lblTitle.setBounds(169, 10, 377, 48);
		frame.getContentPane().add(lblTitle);
		
		lblTitle.setText(membervo.getAddr());
		
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(12, 127, 145, 48);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblAddr = new JLabel("New label");
		lblAddr.setBounds(169, 127, 377, 48);
		frame.getContentPane().add(lblAddr);
		
		lblAddr.setText(membervo.getAddr());
		
		JLabel lblContent = new JLabel("New label");
		lblContent.setBounds(12, 228, 534, 178);
		frame.getContentPane().add(lblContent);
		
		lblContent.setText(membervo.getName());
		
	
	
//	
//		String content = vo.getContent();
//		
//		lblContent.setText(content);
		
		   
		
		JLabel lblNewLabel_1 = new JLabel("\uC791\uC131\uC790");
		lblNewLabel_1.setBounds(0, 68, 157, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMemberID = new JLabel("New label");
		lblMemberID.setBounds(169, 68, 377, 48);
		frame.getContentPane().add(lblMemberID);
		String a = membervo.getId();
		lblMemberID.setText(a);
		
		JButton btnRemove = new JButton("\uAE00 \uC0AD\uC81C");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����" + memberNum);
				
				int cnt = dao.remove(a, memberNum);
				
				if(cnt !=0 )
				{
					JOptionPane.showMessageDialog(frame, ("���� ����!!!!"), "��� ����",
					JOptionPane.INFORMATION_MESSAGE);
					
					frame.dispose();
					AdminShowMemberMain adminShowMemberMain = new AdminShowMemberMain();
				}
					
				else
					JOptionPane.showMessageDialog(frame, ("���� ����...."), "��� ����",
							JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		btnRemove.setBounds(435, 447, 97, 23);
		frame.getContentPane().add(btnRemove);
		
		
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
				System.out.println("DB���� ����!!!!");
				else
				System.out.println("DB���� ����....");
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