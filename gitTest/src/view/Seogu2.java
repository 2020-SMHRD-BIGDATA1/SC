package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.GwangjuMapMain2;


public class Seogu2 extends JFrame {
	Container contentPane;
	String[] gu = { "±¤Ãµµ¿", "±ÝÈ£µ¿", "³»¹æµ¿", "³ó¼ºµ¿", "´öÈïµ¿", "µ¿Ãµµ¿", "¸¶¸¤µ¿", "¸Å¿ùµ¿", "º®Áøµ¿", "¼­Ã¢µ¿", "¼¼ÇÏµ¿", "½ÖÃÌµ¿", "¾çµ¿", "¿ëµÎµ¿",
			"À¯ÃÌµ¿", "Ä¡Æòµ¿", "Ç³¾Ïµ¿", "È­Á¤µ¿" };

	String pathgc = this.getClass().getResource("../Seogu/gc.PNG").getPath();
	String pathgho = this.getClass().getResource("../Seogu/gho.PNG").getPath();
	String pathnb = this.getClass().getResource("../Seogu/nb.PNG").getPath();
	String pathns = this.getClass().getResource("../Seogu/ns.PNG").getPath();
	String pathdh = this.getClass().getResource("../Seogu/dh.PNG").getPath();
	String pathdc = this.getClass().getResource("../Seogu/dc.PNG").getPath();
	String pathmr = this.getClass().getResource("../Seogu/mr.PNG").getPath();
	String pathmelw = this.getClass().getResource("../Seogu/melw.PNG").getPath();
	String pathbj = this.getClass().getResource("../Seogu/bj.PNG").getPath();
	String pathsc = this.getClass().getResource("../Seogu/sc.PNG").getPath();
	String pathsha = this.getClass().getResource("../Seogu/sha.PNG").getPath();
	String pathssangc = this.getClass().getResource("../Seogu/ssangc.PNG").getPath();
	String pathyang = this.getClass().getResource("../Seogu/yang.PNG").getPath();
	String pathydo = this.getClass().getResource("../Seogu/ydo.PNG").getPath();
	String pathuch = this.getClass().getResource("../Seogu/uch.PNG").getPath();
	String pathcci = this.getClass().getResource("../Seogu/cci.PNG").getPath();
	String pathqa = this.getClass().getResource("../Seogu/qa.PNG").getPath();
	String pathhj = this.getClass().getResource("../Seogu/hj.PNG").getPath();

	ImageIcon[] images = { new ImageIcon(pathgc), new ImageIcon(pathgho), new ImageIcon(pathnb), new ImageIcon(pathns),
			new ImageIcon(pathdh), new ImageIcon(pathdc), new ImageIcon(pathmr), new ImageIcon(pathmelw),
			new ImageIcon(pathbj), new ImageIcon(pathsc), new ImageIcon(pathsha), new ImageIcon(pathssangc),
			new ImageIcon(pathyang), new ImageIcon(pathydo), new ImageIcon(pathuch), new ImageIcon(pathcci),
			new ImageIcon(pathqa), new ImageIcon(pathhj), };

	JLabel imgLabel = new JLabel(images[0]);

	Seogu2() {

		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		JComboBox strCombo = new JComboBox(gu);
		strCombo.setMaximumRowCount(15);
		strCombo.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		strCombo.setBounds(31, 206, 130, 30);

		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();

				int index = cb.getSelectedIndex();

				imgLabel.setIcon(images[index]);
			}
		});
		getContentPane().setLayout(null);

		contentPane.add(strCombo);
		imgLabel.setBounds(197, 153, 964, 581);
		contentPane.add(imgLabel);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1200, 800);
		getContentPane().add(panel);

		JButton btn_storage = new JButton("HOME");
		btn_storage.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainGUIManager mainManager = new MainGUIManager();				
			}
		});
		btn_storage.setForeground(new Color(0, 204, 153));
		btn_storage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_storage.setBackground(Color.BLACK);
		btn_storage.setBounds(31, 32, 113, 32);
		panel.add(btn_storage);
		
		JButton btn_storage_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btn_storage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GwangjuMapMain2 gwangjumap = new GwangjuMapMain2();
			}
		});
		btn_storage_1.setForeground(new Color(0, 204, 153));
		btn_storage_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_storage_1.setBackground(Color.BLACK);
		btn_storage_1.setBounds(31, 700, 113, 32);
		panel.add(btn_storage_1);
		
		URL url = this.getClass().getResource("../GUI_Image/seogu_map.jpg");
		panel.setLayout(null);
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 761);
		panel.add(login_background);
		
		

		setBounds(100, 100, 1210, 800);
		setVisible(true);

	}

	public static void main(String arg[]) {

		new Seogu2();
	}
}