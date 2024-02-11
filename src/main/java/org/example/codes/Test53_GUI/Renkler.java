package org.example.codes.Test53_GUI;

import java.awt.*;
import javax.swing.*;
public class Renkler {

	public static void main(String[] args) {
		 JFrame pencere = new JFrame(); 
		 pencere.setSize(300,300);
		 pencere.setLayout(new GridLayout(2,2));
		 pencere.setVisible(true);
		 pencere.setLocationRelativeTo(null);
 pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JPanel p1 = new JPanel();
		 p1.setLayout(new FlowLayout(FlowLayout.LEFT, 6, 6));
		 
		 JButton bt1 = new JButton("Sol");
		 bt1.setForeground(Color.BLUE);
		 JButton bt2 = new JButton("Orta");
		 bt2.setForeground(Color.YELLOW);
		 JButton bt3 = new JButton("Sağ");
		 bt3.setForeground(Color.CYAN);
		 
		 Color c1 = new Color(0, 0, 0);
		 bt1.setBackground(c1);
		 Color c2 = new Color(255, 255, 255);
		 bt2.setBackground(c2);
		 Color c3 = new Color(255, 200, 100);
		 bt3.setBackground(c3);
		 
		 p1.add(bt1);
		 p1.add(bt2);
		 p1.add(bt3);
		 pencere.add(p1);
		}
}
