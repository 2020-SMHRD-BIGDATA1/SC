package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Seogu extends JFrame {
	Container contentPane;
	String[] gu = { "��õ��", "��ȣ��", "���浿", "�󼺵�", "���ﵿ", "��õ��", "������", "�ſ���", "������", "��â��", "���ϵ�", "���̵�", "�絿", "��ε�",
			"���̵�", "ġ��", "ǳ�ϵ�", "ȭ����" };

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

	Seogu() {

		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		JComboBox strCombo = new JComboBox(gu);
		strCombo.setMaximumRowCount(15);
		strCombo.setFont(new Font("���� ���", Font.PLAIN, 16));
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
		panel.setBounds(0, 0, 1194, 761);
		getContentPane().add(panel);

		URL url = this.getClass().getResource("../GUI_Image/seogu_map.jpg");
		panel.setLayout(null);
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 761);
		panel.add(login_background);

		setSize(1210, 800);
		setVisible(true);

	}

	public static void main(String arg[]) {

		new Seogu();
	}
}