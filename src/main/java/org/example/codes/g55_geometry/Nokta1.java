package org.example.codes.g55_geometry;

public class Nokta1 {

	private double x;
	private double y;
	
	public void setx(double a){
		x=a;
	}
	public void sety(double a){
		y=a;
	}
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public void setNokta(double a,double b){
		x=a;
		y=b;
	}
	public double distance(){
		double sonuc=Math.sqrt(x*x+y*y);
		return sonuc;
	}
	public void print(){
		System.out.println(" "+x+" "+y);
	}
	public static void main(String[] args){
		Nokta1 n= new Nokta1();
		n.setNokta(4,5);
		n.print();
		
	}
	
}
