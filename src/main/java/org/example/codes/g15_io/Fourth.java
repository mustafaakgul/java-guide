package org.example.codes.g15_io;

import java.io.File;
import java.util.Scanner;

//dosyadaki sayilari toplamak
public class Fourth {
	
	public static void main(String[] args)throws Exception {
		File file=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\11-)Files\\CengFiles\\src\\test2.txt");
		if(!file.exists()){
			System.out.println("There is no file");
		System.exit(0);
		}
		Scanner read=new Scanner(file);
		String x="";
		int y=0,z;
		while(read.hasNext()){
			x+=read.next()+" ";
			x+=read.next()+" ";
			z=read.nextInt();
			y+=z;
			x+=z;
			x+="\n";
		}
		read.close();
		System.out.println(x);
		System.out.println("Toplam"+y);
	}

}
