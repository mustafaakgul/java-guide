package org.example.codes.Test53_GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Fontlar {

	public static void main(String[] args) {
		 JFrame pencere = new JFrame(); 
		 pencere.setSize(300,300);
		 pencere.setLayout(new GridLayout(2,2));
		 pencere.setVisible(true);
		 pencere.setLocationRelativeTo(null);
		 pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JPanel p1 = new JPanel();
		 p1.setLayout(new FlowLayout(FlowLayout.LEFT, 6, 6));
		 
		Font f1 = new Font("SansSerif", Font.PLAIN, 20);
		Font f2 = new Font("Script MT Bold", Font.BOLD+Font.ITALIC, 24);
		Font f3 = new Font("Vivaldi", Font.BOLD, 20);
		
		JButton bt1 = new JButton("Kucuk");
		bt1.setFont(f1);
		JButton bt2 = new JButton("Orta Bold italik");
		bt2.setFont(f2);
		JButton bt3 = new JButton("Buyuk");
		bt3.setFont(f3);
		
		p1.setBorder(new TitledBorder("Panel"));
		p1.add(bt1);
           p1.add(bt2);
		p1.add(bt3);
		pencere.add(p1);
		

	}

}
