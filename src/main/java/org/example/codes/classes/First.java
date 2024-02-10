package org.example.codes.classes;

import java.util.Scanner;
//This program can develop i think great idea
//Subtraction quiz loop
public class First {
	public static void main(String[] args) {
		final int number_of_questions=5;
		int correctCount=0;
		int count=0;
		long startTime=System.currentTimeMillis();
		String output="";
		Scanner input=new Scanner(System.in);
		while(count<number_of_questions){
			int number1=(int)(Math.random()*10);
			int number2=(int)(Math.random()*10);
			
			if(number1<number2){      //swapping number1 and number2
				int temp=number1;
				number1=number2;
				number2=temp;
			}
			System.out.println("What is "+number1+" - "+number2+"?");
			int answer=input.nextInt();
			if(number1-number2==answer){
				System.out.println("Correct");
				correctCount++;
			}
			else
				System.out.println("Wrong answer Should be"+(number1-number2));
			count++;
			output+="\n"+number1+"-"+number2+"="+answer+((number1-number2==answer)?"correct":"wrong");
		}
		long endtime=System.currentTimeMillis();
		long testtime=endtime-startTime;
		System.out.println("Correct count is"+correctCount+"\nTest time is"+testtime/1000+"seconds\n"+output);
	}

}
