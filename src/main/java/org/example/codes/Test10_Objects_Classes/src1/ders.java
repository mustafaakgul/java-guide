package org.example.Test10_Objects_Classes.src1;

public class ders {
	
	private String dersadi;
	private ogretmen ogretmenn;
	private derskitap derskitapp;

	public ders(){
		
	}
	public ders(String dersadi,ogretmen a,derskitap b){
		this.dersadi=dersadi;
		ogretmenn=a;
		derskitapp=b;
	}
	public void printders(){
		System.out.println("dersadi"+dersadi+"ogretmen"+"derskitap");
	}
	public static void main(String [] args){
		
	}
}
