package org.example.codes.g00_intro;
import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String[] a={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println("Enter today's number");
		int    x   =input.nextInt();
		System.out.println("Enter futura day's number");
		int    y   =input.nextInt();
		int diff=y-x;
		int newday =diff%7;
		int last=x+newday;
		if(last>6)
			last=last%7;
		System.out.println("New Day"+a[last]);
	}

}
