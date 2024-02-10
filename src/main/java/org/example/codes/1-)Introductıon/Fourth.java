package org.guide.Chapter3;

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		int lottery=(int)(Math.random()*100);
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your lottery(Two Digit)");
		int guess=input.nextInt();
		int lottery1=lottery/10;
		int lottery2=lottery%10;
		int guess1=guess/10;
		int guess2=guess%10;
		System.out.println("Lottery is"+lottery);
		if(guess==lottery)
			System.out.println("Exacy match:You win $10,000");
		else if(guess2==lottery1&&guess1==lottery2)
			System.out.println("Match all digits:You win $3,000");
		else if(guess1==lottery1&&guess1==lottery2&&guess2==lottery1&&guess2==lottery2)
			System.out.println("Martch one digit:You win $1,000");
		else
			System.out.println("Sorry:No match");
	}

}
