package org.example.Test53_GUI.src1;

import javax.swing.*;

import java.awt.*;

public class Lab2 extends JFrame{
	JPanel pnl1,pnl2,pnl3,pnl4,pnl5;
	public Lab2(){
		setLayout(new GridLayout(1,2));
		pnl1=new JPanel();
		pnl2=new JPanel();	
		pnl3=new JPanel();	
		setLocationRelativeTo(null);		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JTextField t=new JTextField();
		t.setText("Type Here");
		ImageIcon a=new ImageIcon("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\12.2\\LAB\\src\\2.jpeg");
		JLabel jb=new JLabel("",a,JLabel.CENTER);
		JButton jb2=new JButton("Here Button");
		pnl1.add(jb);	   
	    pnl2.setLayout(new BorderLayout());	    	    
		JButton button=new JButton("ENTER");
		pnl2.add(button,BorderLayout.NORTH);
		JButton button2=new JButton("EXIT");
		pnl2.add(button2,BorderLayout.SOUTH);	
		pnl3.add(t,BorderLayout.NORTH);
		pnl3.add(jb2,BorderLayout.SOUTH);
		pnl2.add(pnl3,BorderLayout.CENTER);
	    add(pnl1);
	    add(pnl2);
	    pack();	
	}
	public static void main(String[] args) {
		new Lab2();
	}
}