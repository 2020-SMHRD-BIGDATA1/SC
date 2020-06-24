package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Donggu extends JFrame {
   Container contentPane;
   String[] gu = {"궁동","금남로3가","금남로4가","금남로5가","금동", 
		   "남동","내남동","대인동","동명동","불로동","산수동","서석동", 
		   "선교동", "소태동", "수기동", "용산동", "용연동", "운림동","월남동","장동","지산동",
		   "충장로2가","충장로4가","충장로5가","학동","호남동","황금동" };
   
   String pathgong = this.getClass().getResource("../donggu/gong.PNG").getPath();
   String pathgumnam3 = this.getClass().getResource("../donggu/gumnam3.PNG").getPath();
   String pathgumnam4 = this.getClass().getResource("../donggu/gumnam4.PNG").getPath();
   String pathgumnam5 = this.getClass().getResource("../donggu/gumnam5.PNG").getPath();
   String pathgum = this.getClass().getResource("../donggu/gum.PNG").getPath();
   String pathnam = this.getClass().getResource("../donggu/nam.PNG").getPath();
   String pathnenam = this.getClass().getResource("../donggu/nenam.PNG").getPath();
   String pathdein = this.getClass().getResource("../donggu/dein.PNG").getPath();
   String pathdongmeong = this.getClass().getResource("../donggu/dongmeong.PNG").getPath();
   String pathbulro = this.getClass().getResource("../donggu/bulro.PNG").getPath();
   String pathgsansu = this.getClass().getResource("../donggu/sansu.PNG").getPath();
   String pathseoseok = this.getClass().getResource("../donggu/seoseok.PNG").getPath();
   String pathsunkou = this.getClass().getResource("../donggu/sunkou.PNG").getPath();
   String pathsotel = this.getClass().getResource("../donggu/sotel.PNG").getPath();
   String pathsugi = this.getClass().getResource("../donggu/sugi.PNG").getPath();
   String pathyoungsan = this.getClass().getResource("../donggu/youngsan.PNG").getPath();
   String pathyoungyun = this.getClass().getResource("../donggu/youngyun.PNG").getPath();
   String pathunrim = this.getClass().getResource("../donggu/unrim.PNG").getPath();
   String pathwelnam = this.getClass().getResource("../donggu/welnam.PNG").getPath();
   String pathjang = this.getClass().getResource("../donggu/jang.PNG").getPath();
   String pathjisan = this.getClass().getResource("../donggu/jisan.PNG").getPath();
   String pathcung2 = this.getClass().getResource("../donggu/cung2.PNG").getPath();
   String pathcung4 = this.getClass().getResource("../donggu/cung4.PNG").getPath();
   String pathcung5 = this.getClass().getResource("../donggu/cung5.PNG").getPath();
   String pathhak = this.getClass().getResource("../donggu/hak.PNG").getPath();
   String pathhonam = this.getClass().getResource("../donggu/honam.PNG").getPath();
   String pathhwunggum = this.getClass().getResource("../donggu/hwunggum.PNG").getPath();
         // ?
   ImageIcon[] images = { new ImageIcon(pathgong),new ImageIcon(pathgumnam3), new ImageIcon(pathgumnam4),
         new ImageIcon(pathgumnam5),new ImageIcon(pathgum),new ImageIcon(pathnam)
         ,new ImageIcon(pathnenam),new ImageIcon(pathdein),new ImageIcon(pathdongmeong)
         ,new ImageIcon(pathbulro),new ImageIcon(pathgsansu),new ImageIcon(pathseoseok)
         ,new ImageIcon(pathsunkou),new ImageIcon(pathsotel),new ImageIcon(pathsugi)
         ,new ImageIcon(pathyoungsan),new ImageIcon(pathyoungyun),new ImageIcon(pathunrim)
         ,new ImageIcon(pathwelnam),new ImageIcon(pathjang),new ImageIcon(pathjisan)
         ,new ImageIcon(pathcung2),new ImageIcon(pathcung4),new ImageIcon(pathcung5)
         ,new ImageIcon(pathhak),new ImageIcon(pathhonam),new ImageIcon(pathhwunggum)};

   JLabel imgLabel = new JLabel(images[0]);

   Donggu() {
	   System.out.println(pathgumnam3);

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

      setSize(1245, 721);
      setVisible(true);

   }

   public static void main(String arg[]) {

      new Donggu();
   }
}