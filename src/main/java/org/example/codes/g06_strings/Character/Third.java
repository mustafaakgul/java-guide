package org.example.codes.g06_strings.Character;
import java.util.Scanner;
public class Third {
	
	
	
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Bir karakter dizisi girin: ");
	    String s = input.nextLine();

	    if (isPalindrome(s))
	      System.out.println(s + " palindromdur");
	    else
	      System.out.println(s + " palindrom değildir");
	  }
	  public static boolean isPalindrome(String s) {
	  
	    int ilk=0;    // string'deki ilk karakterin indisi
	  
	    int son=s.length()-1;  // string'deki son karakterin indisi

	    while (ilk<son) {
	      if (s.charAt(ilk) != s.charAt(son))
	        return false; //  palindrom değildir

	      ilk++;
	      son--;
	    }
	    return true; // Buraya geldiyse palindromdur.
	  }
	}



