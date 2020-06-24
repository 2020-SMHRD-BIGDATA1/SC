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

public class GwangjuMapMain {

	private JFrame frame;
	private JButton donggu;
	private JButton seogu;
	private JButton namgu;
	private JButton bukgu;
	private JButton gwangsangu;
	private JButton btn_back;
	private JPanel panel_2;

	public GwangjuMapMain() {
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
		donggu.setOpaque(false);
		donggu.setContentAreaFilled(false);
		donggu.setBorderPainted(false);
		panel_1.add(donggu);
		
		seogu = new JButton("");
		seogu.setOpaque(false);
		seogu.setContentAreaFilled(false);
		seogu.setBorderPainted(false);
		panel_1.add(seogu);
		
		namgu = new JButton("");
		namgu.setOpaque(false);
		namgu.setContentAreaFilled(false);
		namgu.setBorderPainted(false);
		panel_1.add(namgu);
		
		bukgu = new JButton("");
		bukgu.setOpaque(false);
		bukgu.setContentAreaFilled(false);
		bukgu.setBorderPainted(false);
		panel_1.add(bukgu);
		
		gwangsangu = new JButton("");
		gwangsangu.setOpaque(false);
		gwangsangu.setContentAreaFilled(false);
		gwangsangu.setBorderPainted(false);
		panel_1.add(gwangsangu);
		
		
		panel_2 = new JPanel();
		panel_2.setBounds(33, 728, 107, 31);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		panel.add(panel_2);
		
		btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		panel_2.add(btn_back);
		btn_back.setForeground(new Color(0, 204, 153));
		btn_back.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_back.setBackground(Color.BLACK);
		
		URL url = this.getClass().getResource("../GUI_Image/gwangju_map.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		panel.add(login_background);
	}

}
