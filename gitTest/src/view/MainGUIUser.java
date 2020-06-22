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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 44, 531, 255);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 30, 0));
		
		JButton btnCctv = new JButton("cctv \uC870\uD68C");
		panel_1.add(btnCctv);
		
		JButton btnBoard = new JButton("\uCC38\uC5EC\uAC8C\uC2DC\uD310");
		panel_1.add(btnBoard);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\join_main.jpg";
		JLabel login_background = new JLabel(new ImageIcon(path));
		login_background.setBounds(0, 0, 1200, 800);
		panel_1.add(login_background);
	}

}
