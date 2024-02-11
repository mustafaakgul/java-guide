package org.example.codes.g53_ui;//Bu programda resim dosyalarından ikon üretiliyor. Resimler belirtilen klasörde bulunmalı (Bu program için projenin klasöründe bir alt klasör olan resim klasöründe kayıtlı olmalı.)
import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame {
private ImageIcon amerika = new ImageIcon("resim/us.gif");
private ImageIcon turk = new ImageIcon("resim/trBayrak1.jpg");
private ImageIcon fransız = new ImageIcon("resim/fr.gif");
private ImageIcon ingiliz = new ImageIcon("resim/uk.gif");

public TestImageIcon() {
setLayout(new GridLayout(1, 4, 5, 5));
JLabel etk1=new JLabel(amerika);
etk1.setToolTipText("Bu birinci etikettir.");
add(etk1);
JLabel etk2=new JLabel(turk);
etk2.setToolTipText("Bu ikinci etikettir.");
add(etk2);
JButton b1= new JButton(fransız);
b1.setToolTipText("Bu birinci butondur.");
add(b1);
JButton b2= new JButton(ingiliz);
b2.setToolTipText("Bu ikinci butondur.");
add(b2);
}

public static void main(String[] args) {
TestImageIcon frame = new TestImageIcon();
frame.setTitle("TestImageIcon");
frame.setSize(500, 125);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}