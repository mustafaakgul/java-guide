import javax.swing.*;
import java.awt.*;
public class TestButton2 extends JFrame {
public TestButton2() {
ImageIcon icon = new ImageIcon("resim/grapes.gif");
JLabel etk= new JLabel(icon);
JRadioButton r1 = new JRadioButton("Karpuz");
JRadioButton r2 = new JRadioButton("Erik");
JRadioButton r3 = new JRadioButton("Çilek");
JRadioButton r4 = new JRadioButton("Üzüm");
add(etk);
ButtonGroup btg = new ButtonGroup();
btg.add(r1);
btg.add(r2);
btg.add(r3);
btg.add(r4);
add(r1);
add(r2);
add(r3);
add(r4);
}
public static void main(String[] args) {
JFrame frame = new TestButton2();
frame.setLayout(new GridLayout(6,1));
frame.setTitle("ButtonIcons");
frame.setSize(400, 400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

}