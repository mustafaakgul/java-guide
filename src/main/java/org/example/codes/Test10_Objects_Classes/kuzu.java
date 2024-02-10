package org.example.Test10_Objects_Classes;

import java.util.Scanner;

public class kuzu {
	
	private String hayvanAd;
	private String hayvanSes;

	public kuzu(){
}
	public kuzu(String hayvanAd) {
		this.hayvanAd = hayvanAd;
	}
   public kuzu(String hayvanAd, String hayvanSes){
	   this.hayvanAd = hayvanAd;
	   this.hayvanSes = hayvanSes;
   }
   public void setHayvanAd (String x);
   this.hayvanAd = x;
   }
public void setHayvanSes(String x){
	this.hayvanSes = x;
}
public String getHayvanAd(){
	return hayvanAd;
}
public String getHayvanSes(){
	return hayvanSes;
}
public void ekleolay(){
	System.out.print("Kuzu ne yapıyor giriniz:");
	Scanner input = new Scanner(System.in);
	String  x=input.nextLine();
	System.out.println(x);
}
public static void main(String[] args){
	kuzu a = new kuzu();
	a.ekleolay();
	a.ekleolay();
	a.ekleolay();
}
}