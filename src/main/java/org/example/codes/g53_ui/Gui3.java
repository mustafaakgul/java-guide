package org.example.codes.g53_ui;    // Basit pencere setLocationla yer belirlemek

import javax.swing.*;
	public class Gui3 {
		public static void main(String[] args) {
		    JFrame pencere = new JFrame("Pencere 2");
		    pencere.setSize(400, 300);
		    // frame'e bir buton ekle
		    JButton dugme = new JButton("OK");
		    pencere.add(dugme);
		   
		    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    pencere.setLocation(100,200); //100,200 den baslayarak pencere cizdirilir.
		    pencere.setLocation(100,500);
		    pencere.setVisible(true);
		}
	}
