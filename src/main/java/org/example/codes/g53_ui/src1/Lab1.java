package org.example.Test53_GUI.src1;

import java.awt.*;
import javax.swing.*;
public class Lab1 extends JFrame{
	JPanel pnl1,pnl2;
		public Lab1(){
		pnl1=new JPanel();
		pnl2=new JPanel();
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		add(pnl1,BorderLayout.NORTH);
		add(pnl2,BorderLayout.SOUTH);
		
		pnl1.setLayout(new FlowLayout());
		pnl2.setLayout(new GridLayout(5,4));
		String[] a={"(",")","%","AC","7","8","9","/","4","5","6","x","1","2","3","-","0",".","=","+"};
		for (int i = 0; i < 20; i++) {
			JButton button=new JButton(a[i]);
			pnl2.add(button);				
	}
		JTextField t=new JTextField();
		t.setText("Hesap makine");
		pnl1.add(t);
		pack();
		
}
		public static void main(String[] args) {
			new Lab1();
		}
	}