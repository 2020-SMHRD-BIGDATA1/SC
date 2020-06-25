package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.BoardDAO;
import model.BoardVO;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

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
	private BoardVO vo = null;

	public AdminSelect(int boardNum) {
		initialize(boardNum);
		frame.setVisible(true);
	}

	private void initialize(int boardNum) {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 560, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BoardDAO dao = new BoardDAO();
		BoardVO boardvo = dao.getBoard(boardNum);

		lblTitle = new JLabel("New label");
		lblTitle.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lblTitle.setBounds(94, 158, 422, 28);
		frame.getContentPane().add(lblTitle);

		lblTitle.setText(boardvo.getTitle());

		JLabel lblAddr = new JLabel("New label");
		lblAddr.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lblAddr.setBounds(94, 236, 188, 25);
		frame.getContentPane().add(lblAddr);

		lblAddr.setText(boardvo.getAddr());

		JLabel lblContent = new JLabel("New label");
		lblContent.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lblContent.setVerticalAlignment(SwingConstants.TOP);
		lblContent.setBounds(94, 289, 422, 415);
		frame.getContentPane().add(lblContent);

		lblContent.setText(boardvo.getContent());

		JLabel lblMemberID = new JLabel("New label");
		lblMemberID.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lblMemberID.setBounds(105, 197, 175, 25);
		frame.getContentPane().add(lblMemberID);
		String a = boardvo.getId();
//		lblMemberID.setText(Membervo.getId());
		lblMemberID.setText(a);

		JButton btnRemove = new JButton("\uAE00 \uC0AD\uC81C");
		btnRemove.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		btnRemove.setForeground(Color.PINK);
		btnRemove.setBackground(Color.BLACK);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int cnt = dao.remove(boardNum);

				if (cnt != 0) {
					JOptionPane.showMessageDialog(frame, ("»èÁ¦ ¼º°ø!!!!"), "È¸¿ø »èÁ¦", JOptionPane.INFORMATION_MESSAGE);

					frame.dispose();
					AdminShowMain adminShowMain = new AdminShowMain();
				}

				else
					JOptionPane.showMessageDialog(frame, ("»èÁ¦ ½ÇÆÐ...."), "È¸¿ø »èÁ¦", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		btnRemove.setBounds(406, 740, 109, 29);
		frame.getContentPane().add(btnRemove);

		
		
		JButton btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminShowMain adminShowMain = new AdminShowMain();
			}
		});
		btn_back.setForeground(Color.PINK);
		btn_back.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		btn_back.setBackground(Color.BLACK);
		btn_back.setBounds(23, 740, 109, 29);
		frame.getContentPane().add(btn_back);

		URL url = this.getClass().getResource("../GUI_Image/board_check.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		frame.getContentPane().add(login_background);
		login_background.setBounds(0, 0, 550, 800);
	}

	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null)
				System.out.println("DB¿¬°á ¼º°ø!!!!");
			else
				System.out.println("DB¿¬°á ½ÇÆÐ....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
