import javax.swing.*;

public class TestButtonIcons extends JFrame {
public static void main(String[] args) {
JFrame frame = new TestButtonIcons();
frame.setTitle("ButtonIcons");
frame.setSize(200, 100);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
public TestButtonIcons() {
ImageIcon usIcon = new ImageIcon("resim/amerika.gif");
ImageIcon caIcon = new ImageIcon("resim/kanada.gif");
ImageIcon ukIcon = new ImageIcon("resim/ingiliz.gif");

JButton bt = new JButton("bayrak", usIcon);
bt.setPressedIcon(caIcon);
bt.setRolloverIcon(ukIcon);

add(bt);
}
}