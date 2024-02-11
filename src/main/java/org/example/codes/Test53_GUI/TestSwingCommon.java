package org.example.codes.Test53_GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class TestSwingCommon extends JFrame {
  public TestSwingCommon() {
    // Üç düğmeyi gruplayan bir panel oluşturmak
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
    JButton btL = new JButton("Sol");
    JButton btC = new JButton("Orta");
    JButton btR = new JButton("Sağ");
    btL.setBackground(Color.WHITE);
    btC.setBackground(Color.YELLOW);
    btC.setForeground(Color.GREEN);
    btR.setToolTipText("Bu Sağ düğmedir");
    p1.add(btL);
    p1.add(btC);
    p1.add(btR);
    p1.setBorder(new TitledBorder("Üç düğme"));

    // Bir font ve sınır çizgisi oluşturmak
    Font buyukFont = new Font("TimesRoman", Font.BOLD, 20);
    Border sınırCiz = new LineBorder(Color.GREEN, 3);

    // İki etiketi gruplayan bir panel oluşturmak
    JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
    JLabel etkRed = new JLabel("Kırmızı");
    JLabel etkOrange = new JLabel("Turuncu");
    etkRed.setForeground(Color.RED);
    etkOrange.setForeground(Color.ORANGE);
    etkRed.setFont(buyukFont);
    etkOrange.setFont(buyukFont);
    etkRed.setBorder(sınırCiz);
    etkOrange.setBorder(sınırCiz);
    p2.add(etkRed);
    p2.add(etkOrange);
    p2.setBorder(new TitledBorder("İki Etiket"));

    // frame'e iki paneli eklemek
    setLayout(new GridLayout(2, 1, 5, 5));
    add(p1);
    add(p2);
  }

  public static void main(String[] args) {
    
    JFrame frame = new TestSwingCommon();
    frame.setTitle("TestSwingCommonFeatures");
    frame.setSize(300, 150);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}