package org.example.codes.g06_strings.String;
import java.util.Scanner;
public class Test1 {
	
	
	
		
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Bir String girin: ");
			String a=input.nextLine();
			String b="AAAAA"+a.substring(5,a.length());
			System.out.print(" "+b+"\n");
			System.out.println(b.toLowerCase());

		}

	


}
