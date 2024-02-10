package org.example.Test53_GUI;
import javax.swing.JFrame;
import javax.swing.*;
public class gui1 {
	public static void main(String[] args) {
		
	
	JFrame jf=new JFrame();
	jf.setVisible(true);
	jf.setSize(500,300);
	jf.setTitle("Pencere 1");
	jf.setLocationRelativeTo(null);
	JButton btn=new JButton("Buraya tiklayin");
	JButton btn1=new JButton("Yeni buton");
	jf.add(btn);
	jf.add(btn1);
	jf.add(btn);
}
}
