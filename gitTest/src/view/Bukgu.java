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
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JButton;

public class Bukgu extends JFrame {
	Container contentPane;
	String[] gu = { "각화동", "금곡동", "누문동", "동림동", "두암동", "망월동", "매곡동", "문흥동", "본촌동", "북동", "삼각동", "생용동", "수곡동", "신안동",
			"신용동", "양산동", "연제동", "오룡동", "오치동", "용강동", "용두동", "용봉동", "우산동", "운암동", "운정동", "월출동", "유동", "일곡동", "임동",
			"장등동", "중흥동", "지야동", "청풍동", "충효동", "풍향동", "효령동" };

	String pathKH = this.getClass().getResource("../bukgu/KH.PNG").getPath();
	String pathgumg = this.getClass().getResource("../bukgu/gumg.PNG").getPath();
	String pathnumoon = this.getClass().getResource("../bukgu/numoon.PNG").getPath();
	String pathdongrim = this.getClass().getResource("../bukgu/dongrim.PNG").getPath();
	String pathdoarm = this.getClass().getResource("../bukgu/doarm.PNG").getPath();
	String pathmangwel = this.getClass().getResource("../bukgu/mangwel.PNG").getPath();
	String pathmelg = this.getClass().getResource("../bukgu/melg.PNG").getPath();
	String pathmonH = this.getClass().getResource("../bukgu/monH.PNG").getPath();
	String pathbonC = this.getClass().getResource("../bukgu/bonC.PNG").getPath();
	String pathbuk = this.getClass().getResource("../bukgu/buk.PNG").getPath();
	String pathsamK = this.getClass().getResource("../bukgu/samK.PNG").getPath();
	String pathssy = this.getClass().getResource("../bukgu/ssy.PNG").getPath();
	String pathsuK = this.getClass().getResource("../bukgu/suK.PNG").getPath();
	String pathsinan = this.getClass().getResource("../bukgu/sinan.PNG").getPath();
	String pathsiny = this.getClass().getResource("../bukgu/siny.PNG").getPath();
	String pathyangsan = this.getClass().getResource("../bukgu/yangsan.PNG").getPath();
	String pathejel = this.getClass().getResource("../bukgu/ejel.PNG").getPath();
	String pathoR = this.getClass().getResource("../bukgu/oR.PNG").getPath();
	String pathoC = this.getClass().getResource("../bukgu/oC.PNG").getPath();
	String pathYgang = this.getClass().getResource("../bukgu/Ygang.PNG").getPath();
	String pathYdo = this.getClass().getResource("../bukgu/Ydo.PNG").getPath();
	String pathYbong = this.getClass().getResource("../bukgu/Ybong.PNG").getPath();
	String pathusan = this.getClass().getResource("../bukgu/usan.PNG").getPath();
	String pathunarm = this.getClass().getResource("../bukgu/unarm.PNG").getPath();
	String pathunj = this.getClass().getResource("../bukgu/unj.PNG").getPath();
	String pathwelC = this.getClass().getResource("../bukgu/welC.PNG").getPath();
	String pathu = this.getClass().getResource("../bukgu/u.PNG").getPath();
	String pathilK = this.getClass().getResource("../bukgu/ilK.PNG").getPath();
	String pathimm = this.getClass().getResource("../bukgu/imm.PNG").getPath();
	String pathjangd = this.getClass().getResource("../bukgu/jangd.PNG").getPath();
	String pathjungh = this.getClass().getResource("../bukgu/jungh.PNG").getPath();
	String pathjiya = this.getClass().getResource("../bukgu/jiya.PNG").getPath();
	String pathchangb = this.getClass().getResource("../bukgu/changb.PNG").getPath();
	String pathcunh = this.getClass().getResource("../bukgu/cunh.PNG").getPath();
	String pathpungh = this.getClass().getResource("../bukgu/pungh.PNG").getPath();
	String pathhrr = this.getClass().getResource("../bukgu/hrr.PNG").getPath();

	ImageIcon[] images = { new ImageIcon(pathKH), new ImageIcon(pathgumg), new ImageIcon(pathnumoon),
			new ImageIcon(pathdongrim), new ImageIcon(pathdoarm), new ImageIcon(pathmangwel), new ImageIcon(pathmelg),
			new ImageIcon(pathmonH), new ImageIcon(pathbonC), new ImageIcon(pathbuk), new ImageIcon(pathsamK),
			new ImageIcon(pathssy), new ImageIcon(pathsuK), new ImageIcon(pathsinan), new ImageIcon(pathsiny),
			new ImageIcon(pathyangsan), new ImageIcon(pathejel), new ImageIcon(pathoR), new ImageIcon(pathoC),
			new ImageIcon(pathYgang), new ImageIcon(pathunj), new ImageIcon(pathwelC), new ImageIcon(pathusan),
			new ImageIcon(pathunarm), new ImageIcon(pathgumg), new ImageIcon(pathgumg), new ImageIcon(pathu),
			new ImageIcon(pathilK), new ImageIcon(pathimm), new ImageIcon(pathjangd), new ImageIcon(pathjungh),
			new ImageIcon(pathjiya), new ImageIcon(pathchangb), new ImageIcon(pathcunh), new ImageIcon(pathpungh),
			new ImageIcon(pathhrr) };

	JLabel imgLabel = new JLabel(images[0]);

	Bukgu() {

		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		JComboBox strCombo = new JComboBox(gu);
		strCombo.setMaximumRowCount(15);
		strCombo.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
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
				MainGUIUser mainuser = new MainGUIUser();				
			}
		});
		btn_storage.setForeground(new Color(0, 204, 153));
		btn_storage.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btn_storage.setBackground(Color.BLACK);
		btn_storage.setBounds(31, 32, 113, 32);
		panel.add(btn_storage);
		
		JButton btn_storage_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btn_storage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GwangjuMapMain gwangjumap = new GwangjuMapMain();
			}
		});
		btn_storage_1.setForeground(new Color(0, 204, 153));
		btn_storage_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btn_storage_1.setBackground(Color.BLACK);
		btn_storage_1.setBounds(31, 700, 113, 32);
		panel.add(btn_storage_1);
		
		URL url = this.getClass().getResource("../GUI_Image/bukgu_map.jpg");
		panel.setLayout(null);
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 761);
		panel.add(login_background);
		
		setBounds(100, 100, 1210, 800);
		setVisible(true);
	}

	public static void main(String arg[]) {

		new Bukgu();
	}
}