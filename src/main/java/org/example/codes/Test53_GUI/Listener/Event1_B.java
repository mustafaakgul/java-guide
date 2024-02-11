package org.example.codes.Test53_GUI.Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Event1_B extends JFrame{
	private JButton ent=new JButton("OK");

	public Event1_B(){
	  add(ent);
	  Dinle a=new Dinle();
	  ent.addActionListener(a);

}
	public class Dinle implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("OK butonuna basıldı..");
			
		}
	}
	public static void main(String[] args) {
		Event1_B pencere=new Event1_B();
		pencere.setSize(300,300);
		pencere.setLocation(200,100);
		pencere.setVisible(true);
		pencere.setTitle("Pencerem");
		pencere.setLayout(new FlowLayout());
		pencere.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
