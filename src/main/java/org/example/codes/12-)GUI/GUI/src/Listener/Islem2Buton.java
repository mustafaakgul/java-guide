package Listener;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Islem2Buton extends JFrame{
	private JTextField sayi1=new JTextField (10);
	private JTextField sayi2=new JTextField (10);
	private JTextField sonuc=new JTextField(10);
	private JButton toplam=new JButton("+");
	private JButton cikar=new JButton("-");
	private JButton carpim=new JButton("*");
	private JButton bolme=new JButton("/");
	public Islem2Buton(){
		sonuc.setEditable(false);
		JPanel p1=new JPanel(new FlowLayout());
		p1.setBorder(new TitledBorder("Sayılar"));
		p1.add(sayi1);
		p1.add(sayi2);
		JPanel p2=new JPanel(new FlowLayout());
		p2.setBorder(new TitledBorder("İşlemler"));
		p2.add(toplam);
		p2.add(carpim);
		p2.add(cikar);
		p2.add(bolme);
		JPanel p3=new JPanel(new FlowLayout());
		p3.setBorder(new TitledBorder("Sonuç"));
		p3.add(sonuc);
		add(p1);
		add(p2);
		add(p3);
		Dinle d=new Dinle();
		toplam.addActionListener(d);
		cikar.addActionListener(d);
		carpim.addActionListener(d);
		bolme.addActionListener(d);
	}
	public class Dinle implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int s1=0;
			s1=Integer.parseInt(sayi1.getText());
			int s2=0;
			s2=Integer.parseInt(sayi2.getText());
			
if(sayi2.getText()!=null && sayi2.getText()!=null)
			
			         if(e.getSource()==toplam){sonuc.setText(s1+"+"+s2+"="+(s1+s2));}
			               else if(e.getSource()==cikar){
sonuc.setText(s1+"-"+s2+"="+(s1-s2));
}
			               else if(e.getSource()==carpim){
sonuc.setText(s1+"*"+s2+"="+(s1*s2));
}
			               else if(e.getSource()==bolme){
				             if(s2==0)
					     sonuc.setText("Sıfıra bolme hatası");
				             else
					     sonuc.setText(s1+"/"+s2+"="+(s1/s2));
			      }
		}
	}
	public static void main(String[] args) {
		Islem2Buton pencere=new Islem2Buton();
		pencere.setLayout(new GridLayout(3,1));
		pencere.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pencere.setVisible(true);
		pencere.setLocationRelativeTo(null);
		pencere.setSize(300,300);
	}

}
