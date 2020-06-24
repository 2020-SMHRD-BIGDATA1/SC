package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Bukgu extends JFrame {
   Container contentPane;
   String[] gu = {"각화동", "금곡동", "누문동", "동림동", "두암동", "망월동", "매곡동", "문흥동", "본촌동", "북동", 
		   		  "삼각동", "생용동", "수곡동", "신안동", "신용동", "양산동", "연제동", "오룡동", "오치동", "용강동", 
		   		  "용두동", "용봉동", "우산동", "운암동", "운정동", "월출동", "유동", "일곡동", "임동", "장등동", "중흥동", 
		   		  "지야동", "청풍동", "충효동", "풍향동", "효령동"};
   
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
   
   
      
   
   ImageIcon[] images = { new ImageIcon(pathKH), new ImageIcon(pathgumg),
         new ImageIcon(pathnumoon),new ImageIcon(pathdongrim),new ImageIcon(pathdoarm),new ImageIcon(pathmangwel),
         new ImageIcon(pathmelg),new ImageIcon(pathmonH),new ImageIcon(pathbonC),new ImageIcon(pathbuk),
         new ImageIcon(pathsamK),new ImageIcon(pathssy),new ImageIcon(pathsuK),new ImageIcon(pathsinan),
         new ImageIcon(pathsiny),new ImageIcon(pathyangsan),new ImageIcon(pathejel),new ImageIcon(pathoR),
         new ImageIcon(pathoC),new ImageIcon(pathYgang),new ImageIcon(pathunj),new ImageIcon(pathwelC),
         new ImageIcon(pathusan),new ImageIcon(pathunarm),new ImageIcon(pathgumg),new ImageIcon(pathgumg),
         new ImageIcon(pathu),new ImageIcon(pathilK),new ImageIcon(pathimm),new ImageIcon(pathjangd),
         new ImageIcon(pathjungh),new ImageIcon(pathjiya),new ImageIcon(pathchangb),new ImageIcon(pathcunh),
         new ImageIcon(pathpungh),new ImageIcon(pathhrr)};

   JLabel imgLabel = new JLabel(images[0]);

   Bukgu() {

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

      new Bukgu();
   }
}