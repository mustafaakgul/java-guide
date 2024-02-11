package org.example.codes.Test53_GUI;    // Basit pencereye buton(dugme) eklemek
	import javax.swing.*;
	public class Gui2 {
	  public static void main(String[] args) {
	    JFrame pencere = new JFrame("Pencere 1");
	    pencere.setSize(400, 300);
	    // frame'e buton ekle 
	    JButton dugme = new JButton("OK");
	    pencere.add(dugme);	    
	    pencere.setVisible(true);
	    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	  }
	}



