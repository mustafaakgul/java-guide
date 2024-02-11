package org.example.codes.g15_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test5 {			

		public static void main(String[] args) throws FileNotFoundException {
			File source=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\9.2\\Ceng\\src\\People");
			Scanner s = new Scanner(source);	
			while(s.hasNext()){
			String info=s.nextLine();
			String[] b=info.split("\t");
			if(b[1].equals("212")){
				System.out.println(info);
			if(b[1].startsWith("212")){
						System.out.println(info);
			}
			}
			
			
		}

	}
	}


