package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Namgu extends JFrame {
   Container contentPane;
   String[] gu = {"구동", "구소동", "노대동", "대지동", "도금동", "방림동", "백운동", 
		   "봉선동", "사동", "서동", "석정동", "송하동", "승촌동", 
		   "신장동", "압촌동", "양과동", "양림동", "양촌동", "원산동", "월산동", "월성동", "이장동", 
		   "임암동", "주월동", "지석동", "진월동", "칠석동", "행암동", "화장동",};
   
   String pathgoo = this.getClass().getResource("../namgu/goo.PNG").getPath();
   String pathgooso = this.getClass().getResource("../namgu/gooso.PNG").getPath();
   String pathnode = this.getClass().getResource("../namgu/node.PNG").getPath();
   String pathdeji = this.getClass().getResource("../namgu/deji.PNG").getPath();
   String pathdogum = this.getClass().getResource("../namgu/dogum.PNG").getPath();
   String pathbangrim = this.getClass().getResource("../namgu/bangrim.PNG").getPath();
   String pathbw = this.getClass().getResource("../namgu/bw.PNG").getPath();
   String pathbongs = this.getClass().getResource("../namgu/bongs.PNG").getPath();
   String pathsa = this.getClass().getResource("../namgu/sa.PNG").getPath();
   String pathgseo = this.getClass().getResource("../namgu/seo.PNG").getPath();
   String pathseckj = this.getClass().getResource("../namgu/seckj.PNG").getPath();
   String pathsongha = this.getClass().getResource("../namgu/songha.PNG").getPath();
   String pathsc = this.getClass().getResource("../namgu/sc.PNG").getPath();
   String pathsinjang = this.getClass().getResource("../namgu/sinjang.PNG").getPath();
   String pathabc = this.getClass().getResource("../namgu/abc.PNG").getPath();
   String pathyangg = this.getClass().getResource("../namgu/yangg.PNG").getPath();
   String pathyangrim = this.getClass().getResource("../namgu/yangrim.PNG").getPath();
   String pathyangc = this.getClass().getResource("../namgu/yangc.PNG").getPath();
   String pathwonsan = this.getClass().getResource("../namgu/wonsan.PNG").getPath();
   String pathwelsan = this.getClass().getResource("../namgu/welsan.PNG").getPath();
   String pathwelsung = this.getClass().getResource("../namgu/welsung.PNG").getPath();
   String pathejang = this.getClass().getResource("../namgu/ejang.PNG").getPath();
   String pathimmarm = this.getClass().getResource("../namgu/immarm.PNG").getPath();
   String pathjuwel = this.getClass().getResource("../namgu/juwel.PNG").getPath();
   String pathjisek = this.getClass().getResource("../namgu/jisek.PNG").getPath();
   String pathjinwel = this.getClass().getResource("../namgu/jinwel.PNG").getPath();
   String pathclrsek = this.getClass().getResource("../namgu/clrsek.PNG").getPath();
   String pathhangam = this.getClass().getResource("../namgu/hangam.PNG").getPath();
   String pathghj = this.getClass().getResource("../namgu/hj.PNG").getPath();
   
      
   
   ImageIcon[] images = { new ImageIcon(pathgoo),new ImageIcon(pathgooso),new ImageIcon(pathnode),
		   new ImageIcon(pathdeji),new ImageIcon(pathdogum),new ImageIcon(pathbangrim),new ImageIcon(pathbw),
		   new ImageIcon(pathbongs),new ImageIcon(pathsa),new ImageIcon(pathgseo),new ImageIcon(pathseckj),
		   new ImageIcon(pathsongha),new ImageIcon(pathsc),new ImageIcon(pathsinjang),new ImageIcon(pathabc),
		   new ImageIcon(pathyangg),new ImageIcon(pathyangrim),new ImageIcon(pathyangc),new ImageIcon(pathwonsan),
		   new ImageIcon(pathwelsan),new ImageIcon(pathwelsung),new ImageIcon(pathejang),new ImageIcon(pathimmarm),
		   new ImageIcon(pathjuwel),new ImageIcon(pathjisek),new ImageIcon(pathjinwel),new ImageIcon(pathclrsek),
		   new ImageIcon(pathhangam),new ImageIcon(pathghj)
          };

   JLabel imgLabel = new JLabel(images[0]);

   Namgu() {

      setTitle("ComboBox");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());

      JComboBox strCombo = new JComboBox(gu);

      strCombo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox) e.getSource();

            int index = cb.getSelectedIndex();

            imgLabel.setIcon(images[index]);
         }
      });

      contentPane.add(strCombo);
      contentPane.add(imgLabel);

      setSize(1017, 711);
      setVisible(true);

   }

   public static void main(String arg[]) {

      new Namgu();
   }
}