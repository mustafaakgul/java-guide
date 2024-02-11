package org.example.codes.g00_intro;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		int x=(int)(Math.random()*10);
		int y=(int)(Math.random()*10);
		int diff=x-y;
		
		int Control=0;
		while(Control<1){
		System.out.println("What is your estimate difference x and y =");
		Scanner input=new Scanner(System.in);
		int z=input.nextInt();	
		if(z==diff){
			System.out.println("Correct");
			break;
		}
		else if(z>diff){
			System.out.println("Wrong");
			System.out.println("Need Smaller Number");			
		}
		else{
			System.out.println("Wrong");
			System.out.println("Need Bigger Number");
		}
		
		}
		}
	}