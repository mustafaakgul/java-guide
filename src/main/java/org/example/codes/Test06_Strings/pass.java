package org.example.Test06_Strings;

import java.util.Scanner;

public class pass {
	
	public static void abc(String b){
		int counter=0;
		for(int i=0;i<b.length();i++){
		     if (Character.isDigit(b.charAt(i)))
			counter++;
		}
		
		
	
	public static void main(String[] args){
		Scanner x= new Scanner(System.in);
		System.out.println("Kullanici adi giriniz:");
		String a= x.nextLine();
		System.out.println("Sifrenizi giriniz:");
		String b=x.nextLine();
		int a1=1;
		while(a1>=1){
		if(b.length()>=4){
			abc(b);
			a1--;
		}
		else
			System.out.println("En az 4 karekter kullanın.");
		System.out.println("Sifrenizi giriniz:");
		String b1=x.nextLine();
		}
}
}
