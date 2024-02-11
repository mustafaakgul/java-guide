package org.example.codes.Test53_GUI;// Grid Layout örneği (Component'lerin Satır-Sütun belirleyerek tablo halinde yerleştirilmesi)
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Gui5  {
	 public static void main(String[] args) {
		JFrame pencere = new JFrame();
		  
    // GridLayout 3 satır, 2 sütun olacak ve
    // component'ler arasında  yatay olarak 5 pixel ve dikey olarak 4 pixel aralık bırakılacak
	  GridLayout t=new GridLayout(3, 2, 5, 4);
	  pencere.setLayout(t);

    // frame'e etiketler ve text alanları eklenecek
    pencere.add(new JLabel("İsim"));
    pencere.add(new JTextField(8));
    pencere.add(new JLabel("İsim2"));
    pencere.add(new JTextField(1));
    pencere.add(new JLabel("Soyad"));
    pencere.add(new JTextField(8));
 
    pencere.setTitle("GridLayout örneği");
    pencere.setSize(200, 125);
    pencere.setLocationRelativeTo(null); // frame'i merkeze al
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setVisible(true);
  }
}