package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Seogu extends JFrame {
   Container contentPane;
   String[] gu = { "광천동", "금호동","내방동", "농성동", "덕흥동", "동천동", "마륵동", "매월동", 
		   "벽진동","서창동", "세하동", "쌍촌동", "양동", "용두동", 
		   "유촌동", "치평동", "풍암동", "화정동"};
   
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
      
   
   ImageIcon[] images = { new ImageIcon(pathgc), new ImageIcon(pathgho),
         new ImageIcon(pathnb), new ImageIcon(pathns), new ImageIcon(pathdh),
         new ImageIcon(pathdc), new ImageIcon(pathmr), new ImageIcon(pathmelw),
         new ImageIcon(pathbj), new ImageIcon(pathsc), new ImageIcon(pathsha),
         new ImageIcon(pathssangc), new ImageIcon(pathyang), new ImageIcon(pathydo),
         new ImageIcon(pathuch), new ImageIcon(pathcci), new ImageIcon(pathqa),
         new ImageIcon(pathhj),};

   JLabel imgLabel = new JLabel(images[0]);

   Seogu() {

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

      new Seogu();
   }
}