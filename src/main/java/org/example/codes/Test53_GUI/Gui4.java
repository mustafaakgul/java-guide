package org.example.codes.Test53_GUI;// Etiket(Label) ve text alanı(textField) ekleme, başlık değiştirme

import javax.swing.*;
import java.awt.*;

public class Gui4  {

  public static void main(String[] args) {
    JFrame pencere=new JFrame("ÖRNEK");
    FlowLayout f=new FlowLayout(FlowLayout.LEFT, 10, 20);
	pencere.setLayout(f);
	JLabel j;

    // frame'e etiketler ve text alanları ekle
	pencere.add(new JLabel("İsim"));
	pencere.add(new JTextField(8));
	pencere.add(new JLabel("İkinci isim"));
	pencere.add(new JTextField(1));
	pencere.add(new JLabel("Soyad"));
	pencere.add(new JTextField(8));

    pencere.setTitle("FlowLayout örneği");
    pencere.setSize(400, 300);
    pencere.setLocationRelativeTo(null); // frame'i merkeze al
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setVisible(true);
  }
}
