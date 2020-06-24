package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.MemberMS;
import model.MemberVO;

public class LoginGUI {

	private JFrame frame;
	private JTextField inputID;
	private JPasswordField inputPW;
	public static MemberMS controller = new MemberMS();
	public static MemberVO loginUser;

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
		frame.setBounds(100, 100, 1210, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_956705960385400");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1200, 800);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		inputID = new JTextField();
		inputID.setHorizontalAlignment(SwingConstants.CENTER);
		inputID.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		inputID.setBounds(448, 449, 307, 48);
		panel_1.add(inputID);
		inputID.setColumns(10);
		
		inputPW = new JPasswordField();
		inputPW.setHorizontalAlignment(SwingConstants.CENTER);
		inputPW.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		inputPW.setBounds(448, 514, 307, 48);
		panel_1.add(inputPW);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnLogin.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				

				String id = inputID.getText();
				String pw = String.valueOf(inputPW.getPassword());
				System.out.println(id + pw);

				MemberVO user = new MemberVO(id, pw);
				
				loginUser = controller.login(user);
				
				if (loginUser == null) {
					
					JOptionPane.showMessageDialog(frame, "¾ÆÀÌµð ¶Ç´Â ºñ¹Ð¹øÈ£¸¦ ´Ù½Ã È®ÀÎÇØÁÖ¼¼¿ä.", "·Î±×ÀÎ",
							JOptionPane.INFORMATION_MESSAGE);
										
				} else {
					JOptionPane.showMessageDialog(frame, (loginUser.getName() + " ´Ô ¹Ý°©½À´Ï´Ù."), "·Î±×ÀÎ",
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
		btnLogin.setBounds(431, 590, 154, 46);
		panel_1.add(btnLogin);
		
		JButton btnJoin = new JButton("Join");
		btnJoin.setForeground(new Color(255, 255, 255));
		btnJoin.setBackground(new Color(0, 0, 0));
		btnJoin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JoinGUI join = new JoinGUI();
			}
		});
		btnJoin.setBounds(622, 590, 154, 46);
		panel_1.add(btnJoin);

		URL url = this.getClass().getResource("../GUI_Image/login_main.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		panel_1.add(login_background);
		
	}
}
