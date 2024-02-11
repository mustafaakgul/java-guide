package org.example.codes.g55_geometry;

public class point {
	private double x;
	private double y;
	
	public void setx(double a){
		this.x=a;
	}
	public void sety(double a){
		this.y=a;
	}
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public double distance(){
		double result=Math.sqrt(x*x+y*y);
		return result;
	}
	public static void main(String[] args){
		point p = new point();
		System.out.println(p.getx()+""+p.gety());
		
	}

}
