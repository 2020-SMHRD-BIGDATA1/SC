package view;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MemberMS;
import model.MemberVO;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class JoinGUI {

	private JFrame frame;
	private JTextField inputID;
	private JTextField inputPW;
	private JTextField inputName;
	private JTextField inputAddr;
	private JTextField inputPhone;
	private JTextField inputCode;
	private JButton btnCancel;
	private JButton btnJoin;
	private MemberMS controller = LoginGUI.controller;


	/**
	 * Create the application.
	 */
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1210, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_957250320363000");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1200, 800);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		inputID = new JTextField();
		inputID.setHorizontalAlignment(SwingConstants.CENTER);
		inputID.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		inputID.setBounds(288, 306, 239, 41);
		panel_1.add(inputID);
		inputID.setColumns(10);
		
		inputPW = new JTextField();
		inputPW.setHorizontalAlignment(SwingConstants.CENTER);
		inputPW.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		inputPW.setColumns(10);
		inputPW.setBounds(689, 306, 239, 41);
		panel_1.add(inputPW);
		
		inputName = new JTextField();
		inputName.setHorizontalAlignment(SwingConstants.CENTER);
		inputName.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		inputName.setColumns(10);
		inputName.setBounds(288, 377, 241, 41);
		panel_1.add(inputName);
		
		inputAddr = new JTextField();
		inputAddr.setHorizontalAlignment(SwingConstants.CENTER);
		inputAddr.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		inputAddr.setColumns(10);
		inputAddr.setBounds(288, 519, 640, 41);
		panel_1.add(inputAddr);
		
		inputPhone = new JTextField();
		inputPhone.setHorizontalAlignment(SwingConstants.CENTER);
		inputPhone.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		inputPhone.setColumns(10);
		inputPhone.setBounds(689, 377, 239, 41);
		panel_1.add(inputPhone);
		
		inputCode = new JTextField();
		inputCode.setHorizontalAlignment(SwingConstants.CENTER);
		inputCode.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		inputCode.setColumns(10);
		inputCode.setBounds(381, 449, 547, 41);
		panel_1.add(inputCode);
		
		btnJoin = new JButton("Check");
		btnJoin.setForeground(Color.WHITE);
		btnJoin.setBackground(Color.BLACK);
		btnJoin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = inputID.getText();
				String pw = inputPW.getText();
				String name = inputName.getText();
				String addr = inputAddr.getText();
				String phone = inputPhone.getText();
				String code = inputCode.getText();
				
				if (id.equals("") || pw.equals("") || name.equals("") || addr.equals("") || phone.equals("") || code.equals("")) {
					JOptionPane.showMessageDialog(frame, "ÀÔ·ÂµÇÁö ¾ÊÀº °ªÀÌ ÀÖ½À´Ï´Ù.", "È¸¿ø°¡ÀÔ",
							JOptionPane.INFORMATION_MESSAGE);
					
				}else {
					MemberVO joinUser = new MemberVO (id, pw, name, addr, phone, code);				
					int cnt = controller.join(joinUser);
					if (cnt == 1) {
						JOptionPane.showMessageDialog(frame, "È¸¿ø°¡ÀÔ¿¡ ¼º°øÇÏ¼Ì½À´Ï´Ù.", "È¸¿ø°¡ÀÔ",
								JOptionPane.INFORMATION_MESSAGE);
						frame.dispose();
					}
				}
			}
		});
		btnJoin.setBounds(351, 615, 154, 46);
		panel_1.add(btnJoin);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				LoginGUI login = new LoginGUI();
			}
		});
		btnCancel.setBounds(622, 615, 154, 46);
		panel_1.add(btnCancel);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\join_main.jpg";
		JLabel login_background = new JLabel(new ImageIcon(path));
		login_background.setBounds(0, 0, 1200, 800);
		panel_1.add(login_background);
	}

}
