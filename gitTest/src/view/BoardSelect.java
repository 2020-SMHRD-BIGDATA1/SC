package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.BoardDAO;
import model.BoardVO;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class BoardSelect {
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
	private JButton btn_back;
	private JButton btn_storage;
	
//	public BoardVO setBoardNum(int boardNum) {
//		//this.boardNum = boardNum;
//		System.out.println("ㅎㅇ");
//		System.out.println(boardNum);
//		
//		vo = dao.getBoard(boardNum);
//		String content = vo.getContent();
//		return vo;
//		
//	}
	
	
	/**
	 * Create the application.
	 */
	public BoardSelect(int boardNum) {
		initialize(boardNum);
		frame.setVisible(true);
	}

	
	/**
	 * Initialize the contents of the frame.
	 * @param boardNum 
	 */
	private void initialize(int boardNum) {
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 560, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoardDAO dao = new BoardDAO();
		BoardVO boardvo = dao.getBoard(boardNum);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 550, 800);
		frame.getContentPane().add(panel_1);
		
		btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BoardShowMain boardmain = new BoardShowMain();
			}
		});
		btn_back.setBounds(23, 740, 109, 29);
		btn_back.setBackground(Color.BLACK);
		btn_back.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btn_back.setForeground(Color.PINK);
		panel_1.add(btn_back);
		
		btn_storage = new JButton("HOME");
		btn_storage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUIUser mainuser = new MainGUIUser();
			}
		});	
		
		lblTitle = new JLabel("New label");
		lblTitle.setBackground(Color.WHITE);
		lblTitle.setBounds(91, 157, 424, 30);
		panel_1.add(lblTitle);
		
		lblTitle.setText(boardvo.getTitle());
		
		JLabel lblAddr = new JLabel("New label");
		lblAddr.setBackground(Color.WHITE);
		lblAddr.setBounds(94, 236, 188, 23);
		panel_1.add(lblAddr);
		
		lblAddr.setText(boardvo.getAddr());
		
		JLabel lblContent = new JLabel("New label");
		lblContent.setVerticalAlignment(SwingConstants.TOP);
		lblContent.setBounds(91, 290, 424, 415);
		panel_1.add(lblContent);
		
		lblContent.setText(boardvo.getContent());
		
		JLabel lblMemberID = new JLabel("New label");
		lblMemberID.setBackground(Color.WHITE);
		lblMemberID.setBounds(106, 197, 176, 29);
		panel_1.add(lblMemberID);
		
		lblMemberID.setText(boardvo.getId());
		
		URL url = this.getClass().getResource("../GUI_Image/board_check.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		panel_1.add(login_background);
		login_background.setBounds(0, 0, 550, 800);		
		
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
