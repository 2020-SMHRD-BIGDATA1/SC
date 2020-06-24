package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class MainGUIUser {

	private JFrame frame;
	private JButton btnCctv;
	private JButton btnBoard;


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
		frame.getContentPane().add(panel, "name_1072622920134699");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(243, 337, 715, 157);
		panel_1.setOpaque(false);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnCctv = new JButton("");
		btnCctv.setBounds(0, 0, 302, 157);
		btnCctv.setOpaque(false);
		btnCctv.setContentAreaFilled(false);
		btnCctv.setBorderPainted(false);
		panel_1.add(btnCctv);
		
		btnBoard = new JButton("");
		btnBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BoardShowMain bsm = new BoardShowMain();
			}
		});
		btnBoard.setBounds(416, 0, 297, 157);
		panel_1.add(btnBoard);
		btnBoard.setOpaque(false);
		btnBoard.setContentAreaFilled(false);
		btnBoard.setBorderPainted(false);
		
		URL url = this.getClass().getResource("../GUI_Image/user_main.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		panel.add(login_background);
	}
}
