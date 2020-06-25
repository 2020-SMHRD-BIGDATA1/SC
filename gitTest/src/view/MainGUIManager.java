package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 1210, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_973143151947800");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(244, 249, 715, 362);
		panel_1.setOpaque(false);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnMembers = new JButton("");
		btnMembers.setBounds(0, 0, 303, 156);
		btnMembers.setOpaque(false);
		btnMembers.setContentAreaFilled(false);
		btnMembers.setBorderPainted(false);
		panel_1.add(btnMembers);
		
		btnBoard = new JButton("");
		btnBoard.setBounds(0, 205, 303, 156);
		btnBoard.setOpaque(false);
		btnBoard.setContentAreaFilled(false);
		btnBoard.setBorderPainted(false);
		panel_1.add(btnBoard);
		
		btnGuitar = new JButton("");
		btnGuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				RequestMainGUI requestMain = new RequestMainGUI();
			}
		});
		btnGuitar.setBounds(412, 205, 303, 156);
		btnGuitar.setOpaque(false);
		btnGuitar.setContentAreaFilled(false);
		btnGuitar.setBorderPainted(false);
		panel_1.add(btnGuitar);
		
		btnCctv = new JButton("");
		btnCctv.setBounds(412, 0, 303, 156);
		btnCctv.setOpaque(false);
		btnCctv.setContentAreaFilled(false);
		btnCctv.setBorderPainted(false);
		panel_1.add(btnCctv);
		
		URL url = this.getClass().getResource("../GUI_Image/manager_main.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		panel.add(login_background);
	}

}
