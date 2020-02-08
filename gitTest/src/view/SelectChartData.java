package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SelectChartData {

	private JFrame frame;
	private JButton panel_2;

	public SelectChartData() {
		initialize();
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(111, 151, 330, 63);
		panel.setOpaque(false);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 50, 0));
		
		JButton addr = new JButton("");
		addr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RequestMainGUI rmg = new RequestMainGUI();
			}
		});
		addr.setOpaque(false);
		addr.setContentAreaFilled(false);
		addr.setBorderPainted(false);
		panel.add(addr);
		
		JButton date = new JButton("");
		date.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RequestMain2GUI rm2g = new RequestMain2GUI();
			}
		});
		date.setOpaque(false);
		date.setContentAreaFilled(false);
		date.setBorderPainted(false);
		panel.add(date);
				
		JButton btnNewButton = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainGUIManager mainManager = new MainGUIManager();
			}
		});
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(12, 308, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		URL url = this.getClass().getResource("../GUI_Image/select_data.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 550, 350);
		frame.getContentPane().add(login_background);
		
	}
}
