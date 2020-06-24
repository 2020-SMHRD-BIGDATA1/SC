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
//		System.out.println("¤¾¤·");
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
		frame.setBounds(100, 100, 1210, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		BoardDAO dao = new BoardDAO();
		BoardVO boardvo = dao.getBoard(boardNum);
		System.out.println(boardvo.getTitle()+"Àß³ª¿Ô´Ù."+boardvo.getAddr());
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_957250320363000");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1200, 800);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BoardShowMain boardmain = new BoardShowMain();
			}
		});
		btn_back.setBounds(28, 703, 107, 29);
		btn_back.setBackground(Color.BLACK);
		btn_back.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_back.setForeground(new Color(0, 204, 153));
		panel_1.add(btn_back);
		
		btn_storage = new JButton("HOME");
		btn_storage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUIUser mainuser = new MainGUIUser();
			}
		});
		btn_storage.setBounds(22, 25, 113, 32);
		btn_storage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_storage.setForeground(new Color(0, 204, 153));
		btn_storage.setBackground(Color.BLACK);
		panel_1.add(btn_storage);	
		
		lblTitle = new JLabel("New label");
		lblTitle.setBackground(Color.WHITE);
		lblTitle.setBounds(154, 173, 415, 30);
		panel_1.add(lblTitle);
		
		lblTitle.setText(boardvo.getTitle());
		
		JLabel lblAddr = new JLabel("New label");
		lblAddr.setBackground(Color.WHITE);
		lblAddr.setBounds(153, 270, 416, 30);
		panel_1.add(lblAddr);
		
		lblAddr.setText(boardvo.getAddr());
		
		JLabel lblContent = new JLabel("New label");
		lblContent.setVerticalAlignment(SwingConstants.TOP);
		lblContent.setBounds(151, 358, 418, 393);
		panel_1.add(lblContent);
		
		lblContent.setText(boardvo.getContent());
		
		JLabel lblMemberID = new JLabel("New label");
		lblMemberID.setBackground(Color.WHITE);
		lblMemberID.setBounds(153, 222, 416, 30);
		panel_1.add(lblMemberID);
		
		lblMemberID.setText(boardvo.getId());
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\board_view.jpg";
		JLabel login_background = new JLabel(new ImageIcon(path));
		login_background.setBounds(0, 0, 1200, 800);
		panel_1.add(login_background);
		
		
		
		
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
