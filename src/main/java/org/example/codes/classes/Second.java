package org.example.codes.classes;

import java.util.Scanner;
//do while loop test
public class Second {
	public static void main(String[] args) {
		int data;
		int sum=0;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Enter an integer the input ends if its 0");
			data=input.nextInt();
			sum+=data;
			
		} while(data!=0);
		System.out.println("The sum is"+sum);
	}

}
