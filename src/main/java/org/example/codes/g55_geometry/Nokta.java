package org.example.codes.g55_geometry;

public class Nokta {
	private double x;
	private double y;
	public Nokta(){
		x=0;
		y=0;
	}
	public Nokta(double a, double b){
		x=a;
		y=b;
	}
	public void setNokta(double c, double d){
		x=c;
		y=d;
	}
	public void setX(double a){
		x=a;
	}
	public void setY(double b){
		y=b;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void yazNokta(){
		System.out.println("("+x+","+y+")");
	}
	public double uzaklik(){
		
		return Math.sqrt(x*x+y*y);
	}
	public boolean esitmi(Nokta n){
		if(this.x==n.x && this.y==n.y)
			return true;
		else
			return false;
	}

public static void main(String[] Args ){
	Nokta n1 = new Nokta(3,4);
	n1.yazNokta();
	System.out.println("uzaklik="+n1.uzaklik());
	Nokta n2= new Nokta(4,5);
	if(n1.esitmi(n2))
		System.out.println("Esittir. ");
	else
		System.out.println("Degildir. ");
}
} 
