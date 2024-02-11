package org.example.codes.g53_ui;// Panel örneği (GridLayout eklenmesi )
import java.awt.*;
import javax.swing.*;

public class GUI_7 extends JFrame {
  public GUI_7() {
    //  p1 panelini oluştur. button ekle ve  GridLayout oluştur
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4, 3));

    // panel'e buton ekle
    for (int i = 1; i <= 9; i++) {
      p1.add(new JButton("" + i));
    }
   
    p1.add(new JButton("" + 0));
    p1.add(new JButton("Başla"));
    p1.add(new JButton("Bitir"));
    
    // p2 panelini oluştur. Üzerinde text alanı ve p1 paneli olsun 
    JPanel p2 = new JPanel(new BorderLayout());
    p2.add(new JTextField("Zaman burada gösterilecek"), BorderLayout.NORTH);
    p2.add(p1, BorderLayout.CENTER);

    // frame'e p2 panelini(EAST) ve buton ekle(CENTER)
    add(p2, BorderLayout.EAST);
    add(new JButton("Yiyecek buraya gelecek"), BorderLayout.CENTER);
  }
  public static void main(String[] args) {
    TestPanels frame = new TestPanels();
   
    frame.setTitle("Mikrodalga fırının ön yüzü");
    frame.setSize(400, 250);
    frame.setLocationRelativeTo(null); // frame'i merkeze al
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
    TestPanels frame2 = new TestPanels();
    
    frame2.setTitle("Mikrodalga fırının ön2 yüzü");
    frame2.setSize(400, 250);
    frame2.setLocationRelativeTo(null); // frame'i merkeze al
    frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    frame2.setVisible(true);
  }
}
