package org.example.codes.Test53_GUI.Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Lab1 extends JFrame implements ActionListener{
	JButton btn;
	JTextField txt;
	JTextField txt2;
	JComboBox c;
	JLabel lbl;
	public Lab1(){
    setLocationRelativeTo(null);		
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(400,500);
	setLayout(new GridLayout(3,3));
	txt=new JTextField();
	txt2=new JTextField();
	c=new JComboBox();	
	c.addItem("Seciniz islem");
	c.addItem("+");
	c.addItem("-");
	c.addItem("/");
	c.addItem("*");
	btn=new JButton("Hesapla");
	add(new JLabel("Sayi1"));
	btn.addActionListener(this);
    add(txt);
    add(c);
    add(new JLabel("Sayi2"));
    add(txt2);
    add(new JLabel(""));
    add(new JLabel(""));
    add(btn);
    lbl=new JLabel();
    add(lbl);
	}

public static void main(String[] args) {
	new Lab1();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int sonuc=0;
	if(e.getSource()==btn){
		System.out.println("basildi");
int	a=Integer.parseInt(	txt.getText());
int	b=Integer.parseInt(	txt2.getText());
if(c.getSelectedItem().equals("+"))
	sonuc=a+b;
else if(c.getSelectedItem().equals("-"))
	sonuc=a-b;
else if(c.getSelectedItem().equals("*"))
	sonuc=a*b;

lbl.setText(" "+sonuc);

	}
	
}
}