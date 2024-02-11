package org.example.codes.Test53_GUI.Listener;

import java.awt.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.event.*;
public class EventTekrar extends JFrame{
	private JButton dugme=new JButton("Kare");
	private int say;
	public EventTekrar(){
		say=1;
		JPanel panel=new JPanel();
		panel.setBorder(new TitledBorder("Ben bir panelim"));
		panel.setLayout(new FlowLayout());
		dugme.setBackground(Color.WHITE);
		dugme.setForeground(Color.BLACK);  
		panel.add(dugme);
		add(panel);
		dugme.addActionListener(new Dinle());
	}
	public class Dinle implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(dugme==e.getSource())
				if(say==1)
					say=2;
				else
					say=1;
			if(say==1){
				dugme.setBackground(Color.PINK);
				dugme.setForeground(Color.BLUE);  
				dugme.setSize(150, 50);	
			}
			else{
				dugme.setBackground(Color.WHITE);
				dugme.setForeground(Color.BLACK);  
				dugme.setSize(70, 30);	
			}
		}
	}
	public static void main(String[] args) {
		EventTekrar pencere=new EventTekrar();
		pencere.setTitle("Ben bir pencereyim");
		pencere.setLocationRelativeTo(null);
		pencere.setSize(400,200);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}}
