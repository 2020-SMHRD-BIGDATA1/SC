package view;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MemberMS;
import model.MemberVO;

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
		frame.setBounds(100, 100, 686, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_957250320363000");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 646, 402);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setBounds(300, 10, 57, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setBounds(41, 54, 57, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1_1.setBounds(41, 84, 57, 15);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC774\uB984");
		lblNewLabel_1_2.setBounds(41, 121, 57, 15);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_1_3.setBounds(41, 155, 57, 15);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_1_4.setBounds(41, 188, 57, 15);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		lblNewLabel_1_5.setBounds(41, 226, 72, 15);
		panel_1.add(lblNewLabel_1_5);
		
		inputID = new JTextField();
		inputID.setBounds(142, 51, 116, 21);
		panel_1.add(inputID);
		inputID.setColumns(10);
		
		inputPW = new JTextField();
		inputPW.setColumns(10);
		inputPW.setBounds(142, 81, 116, 21);
		panel_1.add(inputPW);
		
		inputName = new JTextField();
		inputName.setColumns(10);
		inputName.setBounds(142, 118, 116, 21);
		panel_1.add(inputName);
		
		inputAddr = new JTextField();
		inputAddr.setColumns(10);
		inputAddr.setBounds(142, 152, 116, 21);
		panel_1.add(inputAddr);
		
		inputPhone = new JTextField();
		inputPhone.setColumns(10);
		inputPhone.setBounds(131, 185, 116, 21);
		panel_1.add(inputPhone);
		
		inputCode = new JTextField();
		inputCode.setColumns(10);
		inputCode.setBounds(142, 223, 116, 21);
		panel_1.add(inputCode);
		
		btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = inputID.getText();
				String pw = inputPW.getText();
				String name = inputName.getText();
				String addr = inputAddr.getText();
				String phone = inputPhone.getText();
				String code = inputCode.getText();
				
				if (id.equals("") || pw.equals("") || name.equals("") || addr.equals("") || phone.equals("") || code.equals("")) {
					JOptionPane.showMessageDialog(frame, "입력되지 않은 값이 있습니다.", "회원가입",
							JOptionPane.INFORMATION_MESSAGE);
					
				}else {
					MemberVO joinUser = new MemberVO (id, pw, name, addr, phone, code);				
					int cnt = controller.join(joinUser);
					if (cnt == 1) {
						JOptionPane.showMessageDialog(frame, "회원가입에 성공하셨습니다.", "회원가입",
								JOptionPane.INFORMATION_MESSAGE);
						frame.dispose();
					}
				}
			}
		});
		btnJoin.setBounds(187, 343, 97, 23);
		panel_1.add(btnJoin);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				LoginGUI login = new LoginGUI();
			}
		});
		btnCancel.setBounds(317, 343, 97, 23);
		panel_1.add(btnCancel);
	}

}
