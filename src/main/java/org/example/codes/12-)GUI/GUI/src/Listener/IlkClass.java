package Listener;

import java.awt.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.event.*;
public class IlkClass extends JFrame{
	private JButton dugme=new JButton("Kare");
	
	public IlkClass(){
		JPanel panel=new JPanel();
		panel.setBorder(new TitledBorder("Ben bir panelim"));
		panel.setLayout(new FlowLayout());
		panel.add(dugme);
		add(panel);
		dugme.addActionListener(new Dinle());
	}
	public class Dinle implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
		    dugme.setBackground(Color.PINK);
		    dugme.setForeground(Color.BLUE);  
    dugme.setSize(150, 50);	
		}
	}
	public static void main(String[] args) {
		IlkClass pencere=new IlkClass();
		pencere.setTitle("Ben bir frame'im");
		pencere.setLocationRelativeTo(null);
		pencere.setSize(400,200);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
