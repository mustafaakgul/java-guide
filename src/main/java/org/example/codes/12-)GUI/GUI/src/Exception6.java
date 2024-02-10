import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class Exception6  extends JFrame{
	private JTextField sayi1=new JTextField (20);
	private JTextField  sayi2=new JTextField (10);
	private JRadioButton r1=new JRadioButton("+");
	private JRadioButton r2=new JRadioButton("-");
	private JRadioButton r3=new JRadioButton("*");
	private JRadioButton r4=new JRadioButton("/");
	private JTextField sonuc=new JTextField(10);
	private JButton enter=new JButton("ENTER");
	public Exception6(){
		JPanel pN=new JPanel();
		pN.setLayout(new FlowLayout());

		JLabel etk1=new JLabel("Sayi 1 ");
		JLabel etk2=new JLabel("Sayi 2 ");
		pN.add(etk1);
		pN.add(sayi1);
		pN.add(etk2);
		pN.add(sayi2);
		add(pN,BorderLayout.NORTH);

		JPanel pC=new JPanel(new FlowLayout());
		pC.setBorder(new TitledBorder("Islemler"));

		ButtonGroup btg=new ButtonGroup();
		btg.add(r1);
		btg.add(r2);
		btg.add(r3);
		btg.add(r4);
		pC.add(r1);
		pC.add(r2);
		pC.add(r3);
		pC.add(r4);

		pC.add(enter);
		enter.addActionListener(new Dinle());
		add(pC,BorderLayout.CENTER);
		JPanel pS=new JPanel();

		JLabel etk3=new JLabel("Sonuc");
		pS.add(etk3);
		pS.add(sonuc);
		add(pS,BorderLayout.SOUTH);
	}

	public class Dinle implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				String s1=sayi1.getText();
				String s2=sayi2.getText();

				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(s2);

				if(e.getSource()==enter){
					if(r1.isSelected())
						sonuc.setText(""+(a+b));
					else
						if(r2.isSelected())
							sonuc.setText(""+(a-b));
						else
							if(r3.isSelected())
								sonuc.setText(""+(a*b));
							else
								sonuc.setText(""+(a/b));

				}
			}catch(Exception ex){
				System.out.println(ex.getMessage());

			}
		} 
	}
	public static void main(String[] args) {
		Exception6 pencere=new Exception6();
		pencere.setLocationRelativeTo(null);
		pencere.setVisible(true);
		pencere.setTitle("Hesap işlemi");
		pencere.setSize(400,200);
		pencere.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
