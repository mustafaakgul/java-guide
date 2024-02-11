package org.example.codes.Test53_GUI;//Sıfıra bölme hatası
import java.util.*;
public class Aritmetik1 {
  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    boolean continueInput = true;

	    do {
	      try {
	        System.out.print("Enter an integer: ");
	        int number = input.nextInt();
	  
	        // Display the result
	        System.out.println(
	          "The number entered is " + number);
	        
	        continueInput = false;
	      } 
	      catch (InputMismatchException ex) {
	        System.out.println("Try again. (" + 
	          "Incorrect input: an integer is required)");
	        input.nextLine(); // discard input 
	      }
	    } while (continueInput);
	  }
	}
