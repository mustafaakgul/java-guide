package org.guide.Chapter6;

import java.util.Scanner;

//modularizing method
//greater common divisor method
public class Second {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter first integer");
		int n1=input.nextInt();
		System.out.println("Enter second integer");
		int n2=input.nextInt();
		System.out.println("The greater common divisor for"+n1+" and "+n2+" is "+gcd(n1,n2));
	}
	public static int gcd(int x,int y){
		int gcd=1;
		int k=2;
		while(k<=x&&k<=y){
			if(x%k==0&&y%k==0)
				gcd=k;
			k++;
		}
		return gcd;
	}

}
