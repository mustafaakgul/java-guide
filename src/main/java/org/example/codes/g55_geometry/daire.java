package org.example.codes.g55_geometry;

public class daire {
	
	public void yazdaire(){
		System.out.println(yaricap);
	}
	public double alan(){
		return PI*yaricap*yaricap;
	}
	public double cevre(){
		return 2*PI*yaricap;
	}
	public boolean esitmi(daire d){
		if(this.yaricap=d.yaricap)
			return true;
		else
			return false;
	}
	
public static void main(String[] args){
	daire d1,d2;
	d1= new daire(5);
	d2=new daire();
	d2.setdaire(5);
	d1.yazdaire();
	double a = d1.alan();
	System.out.println(a);
	a=d1.cevre();
	System.out.println(a);
	if(d1.esitmi(d2))
		System.out.println("esittir");
	else
		System.out.println("degildr");
}
}
