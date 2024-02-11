package org.example.codes.g00_intro;

public class Eighth {
	public static void main(String[] args) {
		
		String[] a={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=(int)(Math.random()*11);
		x=x+1;
		System.out.println("Your Mounth "+a[x]);
	}

}
