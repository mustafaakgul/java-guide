package org.guide.Chapter3;
import java.util.Scanner;
//This program can calculate two roots
public class Fifth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		double root1,root2;
		System.out.println("The equation is a*x^2+b*x+c=0");
		System.out.println("Pls enter a,b,c");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double disc=b*b-4*a*c;
		if(disc>=0){
			System.out.println("It can calculate");
			root1=(-b+Math.pow(disc,0.5))/2*a;
			root2=(-b-Math.pow(disc,0.5))/2*a;
			if(root1==root2)
				System.out.println("The only root is "+root1);
			else
			System.out.println("Your roots are"+root1+" and "+root2);
		}
		else 
			System.out.println("There is no root");
	}

}
