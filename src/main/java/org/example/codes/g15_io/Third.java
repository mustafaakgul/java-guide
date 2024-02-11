package org.example.codes.g15_io;

import java.io.File;
import java.util.Scanner;

//dosyadan bilgi okumak
public class Third {
	
	public static void main(String[] args) throws Exception{
		
		File f = new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test.txt");
		Scanner read=new Scanner(f); //Dosyadan okuma nesnesi
		String x="";
		while(read.hasNext()){
			//String x=read.next();
			 x=read.nextLine();
			x=x+"\n";
			//System.out.println(x);
			
			/*String name=read.next();
			String surname=read.next();
			int age=read.nextInt();
			System.out.println(name+" "+surname+" "+age);*/
		}
		read.close();
		System.out.println(x);
	}

}
