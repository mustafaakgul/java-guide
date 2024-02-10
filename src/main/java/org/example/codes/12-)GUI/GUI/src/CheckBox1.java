import javax.swing.*;
import java.awt.*;
public class CheckBox1 extends JFrame {
public CheckBox1() {
ImageIcon icon = new ImageIcon("resim/grapes.gif");
JLabel etk= new JLabel(icon);
JCheckBox r1 = new JCheckBox("Karpuz");
JCheckBox r2 = new JCheckBox("Meyve");
JCheckBox r3 = new JCheckBox("Çilek");
JCheckBox r4 = new JCheckBox("Üzüm");
JButton b=new JButton("Enter");
add(etk);
add(r1);
add(r2);
add(r3);
add(r4);
add(b);
}
public static void main(String[] args) {
JFrame frame = new CheckBox1();
frame.setLayout(new GridLayout(6,1));
frame.setTitle("Check Boxlar");
frame.setSize(400, 400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

}
