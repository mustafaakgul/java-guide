package org.example.codes.g00_intro;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		double z=input.nextDouble();
		
		System.out.println("(x<y && y<z) is "+(x<y && y<z));
		System.out.println("(x<y || y<z) is "+(x<y || y<z));
		System.out.println("(x+y<z)is "+(x+y<z));
		System.out.println("(x+y>z)is "+(x+y>z));
	}

}
