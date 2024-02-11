package org.example.codes.g53_ui;// BorderLayout örneği (Component'lerin Doğu-Batı-Kuzey-Güney olarak yerleştirilmesi)
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;

public class Gui6 extends JFrame {
  public Gui6() {
    // BorderLayout'ta component'ler arasında yatay olarak 5 ve dikey olarak 10 piksel aralık bırak
    setLayout(new BorderLayout(5, 10));

    // frame'e butonlar ekle
    add(new JButton("Doğu"), BorderLayout.EAST);
    add(new JButton("Güney"), BorderLayout.SOUTH);
    add(new JButton("Batı"), BorderLayout.WEST);
    add(new JButton("Kuzey"), BorderLayout.NORTH);
    add(new JButton("Merkez"), BorderLayout.CENTER);
  }

  /** Main metot */
  public static void main(String[] args) {
    Gui6 frame = new Gui6();
    frame.setTitle("BorderLayout Örneği");
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
