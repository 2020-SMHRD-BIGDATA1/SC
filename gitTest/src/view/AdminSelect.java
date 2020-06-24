package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.BoardDAO;
import model.BoardVO;

public class AdminSelect {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JFrame frame;
	private int boardNum;
	private JLabel lblTitle;
	private String id;
	private String addr;
	private String content;
	private String title;
	private BoardVO vo=null;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdminSelect window = new AdminSelect();
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
	public AdminSelect(int boardNum) {
		initialize(boardNum);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int boardNum) {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		BoardDAO dao = new BoardDAO();
		BoardVO boardvo = dao.getBoard(boardNum);
		
		
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setBounds(12, 10, 145, 48);
		frame.getContentPane().add(lblNewLabel);
		
		lblTitle = new JLabel("New label");
		lblTitle.setBounds(169, 10, 377, 48);
		frame.getContentPane().add(lblTitle);
		
		lblTitle.setText(boardvo.getTitle());
		
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(12, 127, 145, 48);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblAddr = new JLabel("New label");
		lblAddr.setBounds(169, 127, 377, 48);
		frame.getContentPane().add(lblAddr);
		
		lblAddr.setText(boardvo.getAddr());
		
		JLabel lblContent = new JLabel("New label");
		lblContent.setBounds(12, 228, 534, 178);
		frame.getContentPane().add(lblContent);
		
		lblContent.setText(boardvo.getContent());
		
	
	
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
		String a = boardvo.getId();
//		lblMemberID.setText(Membervo.getId());
		lblMemberID.setText(a);
		
		JButton btnRemove = new JButton("\uAE00 \uC0AD\uC81C");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int cnt = dao.remove(boardNum);
				
				if(cnt !=0 )
				{
					JOptionPane.showMessageDialog(frame, ("삭제 성공!!!!"), "회원 삭제",
					JOptionPane.INFORMATION_MESSAGE);
					
					frame.dispose();
					AdminShowMain adminShowMain = new AdminShowMain();
				}
					
				else
					JOptionPane.showMessageDialog(frame, ("삭제 실패...."), "회원 삭제",
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
				System.out.println("DB연결 성공!!!!");
				else
				System.out.println("DB연결 실패....");
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
