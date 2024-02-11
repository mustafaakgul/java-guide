package org.example.codes.g15_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Test2 {
	/*import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.nio.file.Files;
	import java.util.*;

	public class Second {

		public static void main(String[] args) {
			 Scanner input =new Scanner(System.in);
			 FileWriter f= new FileWriter("People",true);
			 PrintWriter p =new PrintWriter(f);
			 System.out.println("Ad:");
		    	String a=input.nextLine();
		    	System.out.println("Tel no:");
		    	String b=input.nextLine();
		    	p.println(a+""+b);
		    	p.close();
		}
	}
	*/
	

	

		public static void main(String[] args) throws IOException {
			Scanner s = new Scanner (System.in);
			FileWriter f = new FileWriter ("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\9.2\\Ceng\\src\\People",true);
			PrintWriter p = new PrintWriter (f);
			System.out.println("l�tfen ki�i bilgilerini giriniz : ");
			
				System.out.print("Ad giriniz : ");
				String ad = s.nextLine();
				System.out.print("Telefon numaras�n� giriniz : ");
				String telno = s.nextLine();
				p.println(ad + "\t"+telno);
				
			p.close();
			
			
		}
		
	}



