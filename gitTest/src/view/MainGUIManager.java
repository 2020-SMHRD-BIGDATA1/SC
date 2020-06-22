package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MainGUIManager {

	private JFrame frame;
	private JButton btnMembers;
	private JButton btnCctv;
	private JButton btnBoard;
	private JButton btnGuitar;


	/**
	 * Create the application.
	 */
	public MainGUIManager() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_973143151947800");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(57, 42, 543, 288);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 15, 15));
		
		btnMembers = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
		panel_1.add(btnMembers);
		
		btnCctv = new JButton("CCTV\uD604\uD669");
		panel_1.add(btnCctv);
		
		btnBoard = new JButton("\uCC38\uC5EC\uAC8C\uC2DC\uD310 \uAD00\uB9AC");
		panel_1.add(btnBoard);
		
		btnGuitar = new JButton("\uAE30\uD0C0\uCC38\uACE0?");
		panel_1.add(btnGuitar);
	}

}
