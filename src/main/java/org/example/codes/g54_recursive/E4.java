package org.example.codes.g54_recursive;

import java.util.Scanner;
public class E4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("sayiyi giriniz:");
		int    x   =input.nextInt();
		System.out.println("ussu giriniz");
		int    y   =input.nextInt();
		System.out.println(usalma(x,y));
	}
	public static int usalma(int a,int b){
		if(b==1)
			return a;
			else
				return a*usalma(a,b-1);
		/*b==0 ise return 1 else retrn usalma a,b-1*/
	}

}
