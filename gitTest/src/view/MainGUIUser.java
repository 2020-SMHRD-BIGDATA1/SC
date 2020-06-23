package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;

public class MainGUIUser {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public MainGUIUser() {
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
		frame.getContentPane().add(panel, "name_959165121496500");
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1200, 800);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(219, 308, 763, 143);
		panel_1.setOpaque(false);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCctv = new JButton("");
		btnCctv.setBounds(0, 0, 322, 143);
		btnCctv.setOpaque(false);
		btnCctv.setContentAreaFilled(false);
		btnCctv.setBorderPainted(false);
		panel_1.add(btnCctv);
		
		JButton btnBoard = new JButton("");
		btnBoard.setBounds(440, 0, 322, 143);
		btnBoard.setOpaque(false);
		btnBoard.setContentAreaFilled(false);
		btnBoard.setBorderPainted(false);
		panel_1.add(btnBoard);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1200, 800);
		panel_2.add(panel_3);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\user_main.jpg";
		JLabel login_background = new JLabel(new ImageIcon(path));
		login_background.setBounds(0, 0, 1200, 800);
		panel_3.add(login_background);
	}
}
