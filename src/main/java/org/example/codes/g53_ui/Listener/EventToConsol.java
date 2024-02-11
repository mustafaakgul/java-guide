package org.example.codes.g53_ui.Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventToConsol extends JFrame{
	private JButton enter=new JButton("Enter");
	private JButton cancel=new JButton("Cancel");
	public EventToConsol(){
	  add(enter);
	  add(cancel);
	  Dinle a=new Dinle();
	  enter.addActionListener(a);
	  cancel.addActionListener(a);
}
	public class Dinle implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==enter)
				System.out.println("Enter butonuna basıldı..");
			else if(e.getSource()==cancel)
				System.out.println("Cancel butonuna basıldı..");
		}
	}
	public static void main(String[] args) {
		EventToConsol pencere=new EventToConsol();
		pencere.setSize(300,300);
		pencere.setLocation(200,100);
		pencere.setVisible(true);
		pencere.setTitle("Pencerem");
		pencere.setLayout(new FlowLayout());
		pencere.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
