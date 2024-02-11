package org.example.codes.Test53_GUI.Listener;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ComboBoxEvent extends JFrame{
	private JTextField sayi1=new JTextField (10);
	private JTextField sayi2=new JTextField (10);
	private JTextField sonuc=new JTextField(10);
	private JComboBox box;
	
	public ComboBoxEvent(){
		sonuc.setEditable(false);
		JPanel p1=new JPanel(new FlowLayout());
		p1.setBorder(new TitledBorder("Sayılar"));
		p1.add(sayi1);
		p1.add(sayi2);
		JPanel p2=new JPanel(new FlowLayout());
		p2.setBorder(new TitledBorder("İşlemler"));
		String[] x={"Topla","Cikar","Carp","Bol"};
		box=new JComboBox(x);
		p2.add(box);
		
		JPanel p3=new JPanel(new FlowLayout());
		p3.setBorder(new TitledBorder("Sonuç"));
		p3.add(sonuc);
		add(p1);
		add(p2);
		add(p3);
		
		box.addActionListener(new Dinle());
	}
	public class Dinle implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int s1=Integer.parseInt(sayi1.getText());
			int s2=Integer.parseInt(sayi2.getText());
			if(sayi2.getText()!=null && sayi2.getText()!=null)
			
			  if(e.getSource()==box){
				  if(box.getSelectedItem().equals("Topla"))
					 sonuc.setText(s1+"+"+s2+"="+(s1+s2));
			      else if(box.getSelectedItem().equals("Cikar"))
				      sonuc.setText(s1+"-"+s2+"="+(s1-s2));
			      else if(box.getSelectedItem().equals("Carp"))
				      sonuc.setText(s1+"*"+s2+"="+(s1*s2));
			      else if(box.getSelectedItem().equals("Bol"))
				      if(s2==0)
					     sonuc.setText("Sıfıra bolme");
				      else
					     sonuc.setText(s1+"/"+s2+"="+(s1/s2));
			      }
		}
	}
	public static void main(String[] args) {
		ComboBoxEvent pencere=new ComboBoxEvent();
		pencere.setLayout(new GridLayout(3,1));
		pencere.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pencere.setVisible(true);
		pencere.setLocationRelativeTo(null);
		pencere.setSize(300,300);
	}

}
