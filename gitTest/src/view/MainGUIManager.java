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
import java.awt.Font;

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
		btnMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				AdminShowMemberMain adminShowMemberMain = new AdminShowMemberMain();
				
				
				
				
				
				
				
			}
		});
		btnMembers.setBounds(0, 0, 303, 156);
		btnMembers.setOpaque(false);
		btnMembers.setContentAreaFilled(false);
		btnMembers.setBorderPainted(false);
		panel_1.add(btnMembers);
		
		btnBoard = new JButton("");
		btnBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				AdminShowMain adminShowMain = new AdminShowMain();
				
				
				
			}
		});
		btnBoard.setBounds(0, 205, 303, 156);
		btnBoard.setOpaque(false);
		btnBoard.setContentAreaFilled(false);
		btnBoard.setBorderPainted(false);
		panel_1.add(btnBoard);
		
		btnGuitar = new JButton("");
		btnGuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				SelectChartData selectdata = new SelectChartData();
			}
		});
		btnGuitar.setBounds(412, 205, 303, 156);
		btnGuitar.setOpaque(false);
		btnGuitar.setContentAreaFilled(false);
		btnGuitar.setBorderPainted(false);
		panel_1.add(btnGuitar);
		
		btnCctv = new JButton("");
		btnCctv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				//GwangjuMapMain gwangjumap = new GwangjuMapMain();
				GwangjuMapMain2 gwangjumap = new GwangjuMapMain2();
			}
		});
		btnCctv.setBounds(412, 0, 303, 156);
		btnCctv.setOpaque(false);
		btnCctv.setContentAreaFilled(false);
		btnCctv.setBorderPainted(false);
		panel_1.add(btnCctv);
		
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				LoginGUI login = new LoginGUI();
			}
		});
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(1035, 32, 122, 36);
		panel.add(btnNewButton);
		
		URL url = this.getClass().getResource("../GUI_Image/manager_main.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		panel.add(login_background);
	}
}
