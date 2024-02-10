package org.example.Test53_GUI;
import java.awt.*;	

import javax.swing.*;
  public class gui3{
	  public static void main(String[] args) {
		
		    JFrame jf=new JFrame();
		    jf.setVisible(true);
			jf.setSize(500,300);
			jf.setTitle("Pencere 1");
			jf.setLocationRelativeTo(null);
			
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			for (int i = 0; i < 6; i++) {
				JButton btn=new JButton("Button"+i);
				jf.add(btn);
			}
		
	}
  }
