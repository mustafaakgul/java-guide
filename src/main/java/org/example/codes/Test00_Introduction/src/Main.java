package org.example.Test00_Introduction.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame{
	private String username;
	private String password;
    public void setusername(String a){
    	this.username=a;
    }
    public void setpassword(String a){
    	this.password=a;
    }
    public void setmain(String a,String b){
    	this.username=a;
    	this.password=b;
    }
    public String getusername(){
    	return username;
    }
    public String getpassword(){
    	return password;
    }
	private JLabel lbl1=new JLabel("Enter Username and Password");
	private JButton jbn1=new JButton("Add New User");
	private JButton jbn2=new JButton("Login");
	private JTextField jtx1=new JTextField();
	private JTextField jtx2=new JTextField();
	public Main(){		
		setVisible(true);
		setSize(500,500);
		setTitle("Login");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		JPanel pnl1=new JPanel();	
		pnl1.setLayout(new GridLayout(2,2));
		pnl1.add(new JLabel("Username"));
		pnl1.add(jtx1);
		pnl1.add(new JLabel("Password"));
		pnl1.add(jtx2);
		add(lbl1);
		add(pnl1);
		add(jbn2);
		add(jbn1);		
		jbn1.addActionListener(new Dinle());
	}
	public  class Dinle implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Main main=new Main();
			setVisible(false);
			JFrame nwuser=new JFrame();
			JPanel npl=new JPanel();
			JTextField jtxnw1=new JTextField();
			JTextField jtxnw2=new JTextField();
			npl.setLayout(new GridLayout(2,2));
			npl.add(new JLabel("Username"));	
			npl.add(jtxnw1);
			npl.add(new JLabel("Password"));
			npl.add(jtxnw2);
			JButton jbnnw=new JButton("Add New User");
			nwuser.setVisible(true);
			nwuser.setSize(300,300);
			nwuser.setTitle("Add New User");
			nwuser.setLocationRelativeTo(null);
			nwuser.setDefaultCloseOperation(EXIT_ON_CLOSE);
			nwuser.setLayout(new GridLayout(2,1));
			nwuser.add(npl);
			nwuser.add(jbnnw);
			String a=jtxnw1.getText();
			main.setusername(a);
			String b=jtxnw2.getText();
			main.setpassword(b);
			System.out.println(main.getusername());
		}
	}			
	public static void main(String[] args) {
		new Main();
	}
	}
     
