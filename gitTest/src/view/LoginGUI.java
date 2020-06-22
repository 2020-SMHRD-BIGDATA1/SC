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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.MemberMS;
import model.MemberVO;

public class LoginGUI {

	private JFrame frame;
	private JTextField inputID;
	private JPasswordField inputPW;
	public static MemberMS controller = new MemberMS();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 719, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_956705960385400");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 679, 352);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(89, 120, 57, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setBounds(89, 173, 57, 15);
		panel_1.add(lblPw);
		
		inputID = new JTextField();
		inputID.setBounds(199, 117, 116, 21);
		panel_1.add(inputID);
		inputID.setColumns(10);
		
		inputPW = new JPasswordField();
		inputPW.setBounds(199, 173, 116, 21);
		panel_1.add(inputPW);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(300, 23, 57, 15);
		panel_1.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String id = inputID.getText();
				String pw = String.valueOf(inputPW.getPassword());
				System.out.println(id + pw);

				MemberVO user = new MemberVO(id, pw);
				
				MemberVO loginUser = controller.login(user);
				
				if (loginUser == null) {
					
					JOptionPane.showMessageDialog(frame, "아이디 또는 비밀번호를 다시 확인해주세요.", "로그인",
							JOptionPane.INFORMATION_MESSAGE);
										
				} else {
					JOptionPane.showMessageDialog(frame, (loginUser.getName() + " 님 반갑습니다."), "로그인",
							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					if (loginUser.getId().equals("admin")) {
						MainGUIManager mainGUIManager = new MainGUIManager();
					}else {
						MainGUIUser mainGUIUser = new MainGUIUser();
					}
					
				}
				inputID.setText("");
				inputPW.setText("");
			}
		});
		btnLogin.setBounds(136, 278, 97, 23);
		panel_1.add(btnLogin);
		
		JButton btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JoinGUI join = new JoinGUI();
			}
		});
		btnJoin.setBounds(289, 278, 97, 23);
		panel_1.add(btnJoin);
	}
}
