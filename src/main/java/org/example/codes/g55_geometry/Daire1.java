package org.example.codes.g55_geometry;

public class Daire1 {
	
	private double r;
	private String x;
	
	public void setr(double a){
		r=a;
	}
	public void setx(String a){
		x=a;
	}
	public double getr(){
		return r;
	}
	public String getx() {
		return x;
	}
	public double alanhesapla(){
		double sonuc=3.14*r*r;
		return sonuc;
	}
	public double cevrehesapla(){
		double sonuc=2*Math.PI*r;
		return sonuc;
	}
	public static void main(String[] args){
		Daire1 d= new Daire1();
		d.setr(5);
		System.out.println("Radius: "+d.getr());
		
		//kllnıcıdan alma alan hesapla
	}

}
