import java.awt.*;
import javax.swing.*;

public class TestTextField extends JFrame{

public TestTextField() {
ImageIcon icon = new ImageIcon("resim/grapes.gif");
// Metinli, ikonlu ve ortaya yatay hizalandırılmış bir etiket oluştur
JLabel etk = new JLabel("Üzüm", icon, SwingConstants.CENTER);
Font f=new Font("Vivaldi",Font.PLAIN, 20);
//Etiketin metin hizalamasını ve metin-ikon arası boşluğu ayarla
etk.setHorizontalTextPosition(SwingConstants.LEFT);
etk.setVerticalTextPosition(SwingConstants.BOTTOM);
etk.setIconTextGap(5);
JTextField t1=new JTextField();// boş bir text alanı oluştur
JTextField t2=new JTextField("isim");//Belirtilen metin ile bir text alanı
JTextField t3=new JTextField("soyad");
t2.setFont(f);
t2.setForeground(Color.BLUE);
add(t1);
add(t2);
add(t3);
}
public static void main(String[] args) {
JFrame frame = new TestTextField();
frame.setTitle("Text Alanlar");
frame.setLayout(new GridLayout(3,1));
frame.setSize(200, 200);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

}