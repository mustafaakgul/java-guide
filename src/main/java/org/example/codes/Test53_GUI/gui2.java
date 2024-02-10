package org.example.Test53_GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui2 {
	public static void main(String[] args) {
		JFrame jf=new JFrame("Pencere");
		FlowLayout f=new FlowLayout();
		jf.setVisible(true);
		jf.setSize(500,300);
		jf.setLocationRelativeTo(null);
		jf.setLayout(f);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JButton btn=new JButton("Buton1");
		JButton btn2=new JButton("Buton2");
		JButton btn3=new JButton("Buton3");
		jf.add(jp1);
		jf.add(jp2);
		jp1.add(btn);
		jp1.add(btn2);
		jp1.add(btn3);
	}

}
