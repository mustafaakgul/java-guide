package org.example.codes.Test53_GUI;

import javax.swing.*;
public class TestIcon extends JFrame {
public TestIcon() {
ImageIcon icon = new ImageIcon("resim/grapes.gif");
// Metinli, ikonlu ve ortaya yatay hizalandırılmış bir etiket oluştur
JLabel etk = new JLabel("Üzüm", icon, SwingConstants.CENTER);

//Etiketin metin hizalamasını ve metin-ikon arası boşluğu ayarla
etk.setHorizontalTextPosition(SwingConstants.LEFT);
etk.setVerticalTextPosition(SwingConstants.BOTTOM);
etk.setIconTextGap(5);
add(etk);
}
public static void main(String[] args) {
JFrame frame = new TestIcon();
frame.setTitle("Buton İkonlar");
frame.setSize(200, 200);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

}