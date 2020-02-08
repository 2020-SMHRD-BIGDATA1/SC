package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GwangjuMapMain2 {

	private JFrame frame;
	private JButton donggu;
	private JButton namgu;
	private JButton bukgu;
	private JButton gwangsangu;
	private JButton seogu_1;
	private JButton btn_back;
	private JPanel panel_2;

	public GwangjuMapMain2() {
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
		frame.getContentPane().add(panel, "name_1154730597535000");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 222, 93, 442);
		panel_1.setOpaque(false);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0, 0, 25));
		
		donggu = new JButton("");
		donggu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Donggu2 donggu = new Donggu2();
			}
		});
		donggu.setOpaque(false);
		donggu.setContentAreaFilled(false);
		donggu.setBorderPainted(false);
		panel_1.add(donggu);
		
		seogu_1 = new JButton("");
		seogu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Seogu2 seogu = new Seogu2();
			}
		});
		seogu_1.setOpaque(false);
		seogu_1.setContentAreaFilled(false);
		seogu_1.setBorderPainted(false);
		panel_1.add(seogu_1);
		
		namgu = new JButton("");
		namgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Namgu2 namgu = new Namgu2();
			}
		});
		namgu.setOpaque(false);
		namgu.setContentAreaFilled(false);
		namgu.setBorderPainted(false);
		panel_1.add(namgu);
		
		bukgu = new JButton("");
		bukgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Bukgu2 bukgu = new Bukgu2();
			}
		});
		bukgu.setOpaque(false);
		bukgu.setContentAreaFilled(false);
		bukgu.setBorderPainted(false);
		panel_1.add(bukgu);
		
		gwangsangu = new JButton("");
		gwangsangu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Gwangsangu2 gwangsangu = new Gwangsangu2();
			}
		});
		gwangsangu.setOpaque(false);
		gwangsangu.setContentAreaFilled(false);
		gwangsangu.setBorderPainted(false);
		panel_1.add(gwangsangu);
		
		
		panel_2 = new JPanel();
		panel_2.setBounds(33, 728, 107, 31);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		panel.add(panel_2);
		
		btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUIManager mainManager = new MainGUIManager();
			}
		});
		panel_2.add(btn_back);
		btn_back.setForeground(Color.PINK);
		btn_back.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_back.setBackground(Color.BLACK);
		
		URL url = this.getClass().getResource("../GUI_Image/gwangju_map.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		panel.add(login_background);
	}

}
