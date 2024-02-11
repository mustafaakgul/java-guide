package org.example.codes.g15_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//dosyaya yazılması

public class Second {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test.txt");
		if(f.exists()){
			System.out.println("Dosya olusturulmus.");
			System.exit(0);
		}
		PrintWriter p=new PrintWriter(f); //Dosya olusturur eskileri varsa siler.
		p.print("Mustafa");
		p.println("Akgul");
		p.close();
	}

}
