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


public class Gwangsangu extends JFrame {
   Container contentPane;
   String[] gu = { "��浿", "���굿", "���굿", "���굿", "������", "���굿", "��õ��", "������", "���굿",
		   		"��ȣ��", "������", "���ӵ�", "��ȭ��", "��ȣ��", "���浿", "������", "��Ƶ�", "�긷��", "�����", 
		   		"�����", "������", "��ŵ�", "�ﵵ��", "����", "���ϵ�", "���̵�", "�۴뵿", "�ۻ굿", "������",
		   		"��ġ��", "���е�", "���ϵ�", "�Ű���", "�ŷ浿", "��â��", "���̵�", "�־ϵ�", "��û��", "��굿",
		   		"���굿", "���굿", "������", "����", "��", "�뵿", "��굿", "���", "�����", "���赿", 
		   		"���", "������", "�Ӱ", "�����", "��ϵ�", "�����", "���굿", "������", "����", 
		   		"���", "�ϳ���", "�ϻ굿", "�漮��"};
   
   String pathgoR = this.getClass().getResource("../gwangsangu/goR.PNG").getPath();
   String pathGwangsan = this.getClass().getResource("../gwangsangu/gwangsan.PNG").getPath();
   String pathnamsan = this.getClass().getResource("../gwangsangu/namsan.PNG").getPath();
   String pathnesan = this.getClass().getResource("../gwangsangu/nesan.PNG").getPath();
   String pathdoduck = this.getClass().getResource("../gwangsangu/doduck.PNG").getPath();
   String pathdosan = this.getClass().getResource("../gwangsangu/dosan.PNG").getPath();
   String pathdoC = this.getClass().getResource("../gwangsangu/doC.PNG").getPath();
   String pathdongrim = this.getClass().getResource("../gwangsangu/dongrim.PNG").getPath();
   String pathdongsan = this.getClass().getResource("../gwangsangu/dongsan.PNG").getPath();
   String pathdongho = this.getClass().getResource("../gwangsangu/dongho.PNG").getPath();
   String pathdoj = this.getClass().getResource("../gwangsangu/doj.PNG").getPath();
   String pathDimm = this.getClass().getResource("../gwangsangu/Dimm.PNG").getPath();
   String pathmh = this.getClass().getResource("../gwangsangu/mh.PNG").getPath();
   String pathpakho = this.getClass().getResource("../gwangsangu/pakho.PNG").getPath();
   String pathbokR = this.getClass().getResource("../gwangsangu/bokR.PNG").getPath();
   String pathbonduck = this.getClass().getResource("../gwangsangu/bonduck.PNG").getPath();
   String pathbiA = this.getClass().getResource("../gwangsangu/biA.PNG").getPath();
   String pathsanmark = this.getClass().getResource("../gwangsangu/sanmark.PNG").getPath();
   String pathsansu = this.getClass().getResource("../gwangsangu/sansu.PNG").getPath();
   String pathsanwel = this.getClass().getResource("../gwangsangu/sanwel.PNG").getPath();
   String pathsanj = this.getClass().getResource("../gwangsangu/sanj.PNG").getPath();
   String pathsamG = this.getClass().getResource("../gwangsangu/samG.PNG").getPath();
   String pathsamD = this.getClass().getResource("../gwangsangu/samD.PNG").getPath();
   String pathsun = this.getClass().getResource("../gwangsangu/sun.PNG").getPath();
//   String pathsun = this.getClass().getResource("../gwangsangu/sun.PNG").getPath();
   String pathsunarm = this.getClass().getResource("../gwangsangu/sunarm.PNG").getPath();
   String pathsoC = this.getClass().getResource("../gwangsangu/soC.PNG").getPath();
   String pathsongde = this.getClass().getResource("../gwangsangu/songde.PNG").getPath();
   String pathsongsan = this.getClass().getResource("../gwangsangu/songsan.PNG").getPath();
   String pathsongj = this.getClass().getResource("../gwangsangu/songj.PNG").getPath();
   String pathsongc = this.getClass().getResource("../gwangsangu/songc.PNG").getPath();
   String pathsongh = this.getClass().getResource("../gwangsangu/songh.PNG").getPath();
   String pathsuwan = this.getClass().getResource("../gwangsangu/suwan.PNG").getPath();
   String pathsinga = this.getClass().getResource("../gwangsangu/singa.PNG").getPath();
   String pathsinR = this.getClass().getResource("../gwangsangu/sinR.PNG").getPath();
   String pathsincang = this.getClass().getResource("../gwangsangu/sincang.PNG").getPath();
   String pathsinC = this.getClass().getResource("../gwangsangu/sinC.PNG").getPath();
   String pathssangarm = this.getClass().getResource("../gwangsangu/ssangarm.PNG").getPath();
   String pathanC = this.getClass().getResource("../gwangsangu/anC.PNG").getPath();
   String pathyangsan = this.getClass().getResource("../gwangsangu/yangsan.PNG").getPath();
   String pathyensan = this.getClass().getResource("../gwangsangu/yensan.PNG").getPath();
   String pathosan = this.getClass().getResource("../gwangsangu/osan.PNG").getPath();
   String pathosun = this.getClass().getResource("../gwangsangu/osun.PNG").getPath();
   String pathock = this.getClass().getResource("../gwangsangu/ock.PNG").getPath();
   String pathYK = this.getClass().getResource("../gwangsangu/YK.PNG").getPath();
   String pathY = this.getClass().getResource("../gwangsangu/Y.PNG").getPath();
   String pathusan = this.getClass().getResource("../gwangsangu/usan.PNG").getPath();
   String pathunarm = this.getClass().getResource("../gwangsangu/unarm.PNG").getPath();
   String pathunsu = this.getClass().getResource("../gwangsangu/unsu.PNG").getPath();
   String pathwelR = this.getClass().getResource("../gwangsangu/welR.PNG").getPath();
   String pathwelK = this.getClass().getResource("../gwangsangu/welK.PNG").getPath();
   String pathweljen = this.getClass().getResource("../gwangsangu/weljen.PNG").getPath();
   String pathimmK = this.getClass().getResource("../gwangsangu/immK.PNG").getPath();
   String pathjangduck = this.getClass().getResource("../gwangsangu/jangduck.PNG").getPath();
   String pathjangrock = this.getClass().getResource("../gwangsangu/jangrock.PNG").getPath();
   String pathjangsu = this.getClass().getResource("../gwangsangu/jangsu.PNG").getPath();
   String pathjisan = this.getClass().getResource("../gwangsangu/jisan.PNG").getPath();
   String pathjij = this.getClass().getResource("../gwangsangu/jij.PNG").getPath();
   String pathjip = this.getClass().getResource("../gwangsangu/jip.PNG").getPath();
   String pathjinK = this.getClass().getResource("../gwangsangu/jinK.PNG").getPath();
   String pathhanam = this.getClass().getResource("../gwangsangu/hanam.PNG").getPath();
   String pathhasan = this.getClass().getResource("../gwangsangu/hasan.PNG").getPath();
   String pathHHH = this.getClass().getResource("../gwangsangu/HHH.PNG").getPath();
      
   
   ImageIcon[] images = { new ImageIcon(pathgoR), new ImageIcon(pathGwangsan),
         new ImageIcon(pathnamsan),new ImageIcon(pathnesan),new ImageIcon(pathdoduck),new ImageIcon(pathdosan),
         new ImageIcon(pathdoC),new ImageIcon(pathdongrim),new ImageIcon(pathdongsan),new ImageIcon(pathdongho),
         new ImageIcon(pathdoj),new ImageIcon(pathDimm),new ImageIcon(pathmh),new ImageIcon(pathpakho),
         new ImageIcon(pathbokR),new ImageIcon(pathbonduck),new ImageIcon(pathbiA),new ImageIcon(pathsanmark),
         new ImageIcon(pathsansu),new ImageIcon(pathsanwel),new ImageIcon(pathsanj),new ImageIcon(pathsamG),
         new ImageIcon(pathsamD),
         new ImageIcon(pathsun),new ImageIcon(pathsunarm),new ImageIcon(pathsoC),new ImageIcon(pathsongde),
         new ImageIcon(pathsongsan),new ImageIcon(pathsongj),new ImageIcon(pathsongc),new ImageIcon(pathsongh),
         new ImageIcon(pathsuwan),new ImageIcon(pathsinga),new ImageIcon(pathsinR),new ImageIcon(pathsincang),
         new ImageIcon(pathsinC),new ImageIcon(pathssangarm),new ImageIcon(pathanC),new ImageIcon(pathyangsan),
         new ImageIcon(pathyensan),new ImageIcon(pathosan),new ImageIcon(pathosun),new ImageIcon(pathock),
         new ImageIcon(pathYK),new ImageIcon(pathY),new ImageIcon(pathusan),new ImageIcon(pathunarm),
         new ImageIcon(pathunsu),new ImageIcon(pathwelR),new ImageIcon(pathwelK),new ImageIcon(pathweljen),
         new ImageIcon(pathimmK),new ImageIcon(pathjangduck),new ImageIcon(pathjangrock),new ImageIcon(pathjangsu),
         new ImageIcon(pathjisan),new ImageIcon(pathjij),new ImageIcon(pathjip),new ImageIcon(pathjinK),
         new ImageIcon(pathhanam),new ImageIcon(pathhasan),new ImageIcon(pathHHH)};

   JLabel imgLabel = new JLabel(images[0]);

   Gwangsangu() {

      setTitle("ComboBox");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      contentPane = getContentPane();
      
      contentPane.setLayout(new FlowLayout());

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
		btn_storage.setFont(new Font("���� ���", Font.BOLD, 16));
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
		btn_storage_1.setFont(new Font("���� ���", Font.BOLD, 16));
		btn_storage_1.setBackground(Color.BLACK);
		btn_storage_1.setBounds(31, 700, 113, 32);
		panel.add(btn_storage_1);
		
		URL url = this.getClass().getResource("../GUI_Image/gwangsangu_map.jpg");
		panel.setLayout(null);
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 761);
		panel.add(login_background);
		
		setBounds(100, 100, 1210, 800);
		setVisible(true);
	}

   public static void main(String arg[]) {

      new Gwangsangu();
   }
}