import java.awt.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame {
   private AnlatımPaneli p1 = new AnlatımPaneli();

  public static void main(String[] args) {
    TextAreaDemo pencere = new TextAreaDemo();
    pencere.setSize(400,300);
    pencere.setLocationRelativeTo(null); // Center the pencere
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setTitle("TextArea örneği");
    pencere.setVisible(true);
  }

  public TextAreaDemo() {
    p1.setTitle("Title");
    String metin = "Description";
    p1.setDescription(metin);
    p1.setImageIcon(new ImageIcon("logo.gif"));

    // paneli pencereye eklemek
    setLayout(new BorderLayout());
    add(p1, BorderLayout.CENTER);
  }
}
