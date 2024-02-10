package org.example.Test53_GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui2new extends JFrame{
	JPanel pnl1,pnl2;
	public gui2new() {
		pnl1=new JPanel();
		pnl2=new JPanel();
		pnl1.setLayout(new FlowLayout());
		pnl2.setLayout(new FlowLayout());
		for (int i = 0; i < 6; i++) {
			if(i<3){
				pnl1.add(new JButton("Button"+(i+1)));
			}
			else
				pnl2.add(new JButton("Button"+(i+1)));
		}
		setLayout(new FlowLayout());
		add(pnl1);
		add(pnl2);
		setVisible(true);
		setSize(300,400);
		
	}
	public static void main(String[] args) {
		new gui2new();
	}

}
