package Complex;

import java.util.Scanner;

public class Complex {
	private double reel;  
	private double sanal;  
	public Complex() 
	{
		setReel(0);
		setSanal(0);
	}
	public Complex(double r)  
	{
		setReel(r);
		setSanal(r);
	}
	public Complex(double r,double i)  
	{
		setReel(r);
		setSanal(i);
	}
	public double getReel()  
	{
		return reel;
	}
	public double getSanal()  
	{
		return sanal;
	}
	public void setReel(double r)  
	{
		reel=r;
	}
	public void setSanal(double i)  
	{
		sanal=i;
	}
	public Complex topla(Complex n2)  
	{
		return new Complex(reel+n2.getReel(),sanal+n2.getSanal());
	}
	public Complex topla(Complex n2,Complex n3)  
	{
		return new Complex(n2.getReel()+n3.getReel(),n2.getSanal()+n3.getSanal());
	}
	public Complex cikarma(Complex n2)  
	{
		return new Complex(reel-n2.getReel(),sanal-n2.getSanal());
	}
	public Complex cikarma(Complex n2,Complex n3)  
	{
		return new Complex(n2.getReel()-n3.getReel(),n2.getSanal()-n3.getSanal());
	}
	public Complex carpma(Complex n2)  
	{
		Complex x=new Complex();  
		x.setReel((reel*n2.getReel())-(sanal*n2.getSanal()));
		x.setSanal((reel*n2.getSanal())+(sanal*n2.getReel()));
		return x;
	}
	public Complex carpma(Complex n2,Complex n3)  
	{
		Complex x=new Complex();  
		x.setReel((n3.getReel()*n2.getReel())-(n3.getSanal()*n2.getSanal()));
		x.setSanal((n3.getReel()*n2.getSanal())+(n3.getSanal()*n2.getReel()));
		return x;
	}
	public Complex eslenik(){
		return new Complex(reel,-1*sanal);
	}
	public Complex bolme(Complex n2)  
	{
		Complex x1=n2.eslenik();  
		Complex x2=this.carpma(x1);  
		double realSq=n2.getReel()*n2.getReel();//c karesi
		double imgSq=n2.getSanal()*n2.getSanal();//d karesi
		double toplam=realSq+imgSq;
		return new Complex(x2.getReel()/toplam,x2.getSanal()/toplam);
	}
	public Complex bolme(Complex n2,Complex n3)  // n2 / n3
	{
		Complex x1=n3.eslenik();  
		Complex x2=n2.carpma(x1);  //x2= n2*n3.eslenik()
		double realSq=n3.getReel()*n3.getReel();
		double imgSq=n3.getSanal()*n3.getSanal();
		double total=realSq+imgSq;
		return new Complex(x2.getReel()/total,x2.getSanal()/total);
	}
	public boolean esitMi(Complex n2)  
	{
		if(reel==n2.getReel() && sanal==n2.getSanal())  
		{
			return true;
		}
		return false;
	}
	public String toString(){
		String s=""+reel+ (sanal>=0?" + " : "")+sanal;
		return s;
	}
	public void printComplex()
	{
		if(reel==0)
			System.out.println(sanal+"i");
		else if(sanal==0)
			System.out.println(reel);
		else if(sanal>=0)
			System.out.println(reel+"+"+sanal+"i");
		else
			System.out.println(reel+""+sanal+"i");
	}
	public static void main(String[] args) {
		double d,x;
		Complex c1=new Complex();
		
		System.out.print("Reel=");
		Scanner s=new Scanner(System.in);
		d=s.nextDouble();
		System.out.print("Sanal=");
		x=s.nextDouble();
		
		c1.setReel(d);
		c1.setSanal(x);
		c1.printComplex();
		
		Complex c2=new Complex();
		System.out.print("Reel=");
		d=s.nextDouble();
		System.out.print("Sanal=");
		x=s.nextDouble();
		
		c2.setReel(d);
		c2.setSanal(x);
		c2.printComplex();
		
		boolean b=c1.esitMi(c2);
		if(b)
			System.out.println("esit");
		else
			System.out.println("esit degil");
		Complex sonuc=new Complex();
		
		sonuc=c1.eslenik();
		sonuc.printComplex();
		
		sonuc=c1.topla(c2);
		sonuc.printComplex();
		
	}
}
