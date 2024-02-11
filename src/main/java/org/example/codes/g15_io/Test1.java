package org.example.codes.g15_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test1 {

	

		public static void main(String[] args) throws FileNotFoundException {
		File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\9.2\\Ceng\\src\\People");
	    Scanner input =new Scanner(System.in);
	    PrintWriter p =new PrintWriter(f);
	    for(int i=0;i<3;i++){
	    	System.out.println("Bilgilerinizi giriniz:");
	    	System.out.println("Ad:");
	    	String a=input.nextLine();
	    	System.out.println("Tel no:");
	    	String b=input.nextLine();
	    	p.println(a+"\t"+b);
	    }
	    p.close();	
	    }

		}





