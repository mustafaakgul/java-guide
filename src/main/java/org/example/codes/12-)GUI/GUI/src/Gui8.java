import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Gui8 {

	public static void main(String[] args) {
		 JFrame pencere = new JFrame(); 
		 pencere.setTitle("Sınırlar");
		 pencere.setSize(300,300);
		 pencere.setLayout(new GridLayout(2,2));
		 pencere.setVisible(true);
		 pencere.setLocationRelativeTo(null);
		 pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JPanel p1 = new JPanel();
		 p1.setLayout(new FlowLayout(FlowLayout.LEFT, 6, 6));
		 
		p1.setBorder(new TitledBorder("Panelin Etiketi"));
		
		JLabel etk1 = new JLabel("Kırmızı");
	    JLabel etk2 = new JLabel("Turuncu");
	    Border sınırCiz1 = new LineBorder(Color.GREEN, 2);
	    Border sınırCiz2 = new LineBorder(Color.BLUE, 4);
	   // p1.setBorder(sınırCiz1);
	    
	    etk1.setBorder(sınırCiz2);
		etk2.setBorder(sınırCiz2);
		p1.add(etk1);
		p1.add(etk2);
		pencere.add(p1);
	}

}
