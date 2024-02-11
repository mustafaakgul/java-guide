import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.*;
public class yazDosya {

	public static void main(String[] args) throws FileNotFoundException {
	File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\10.1\\Ceng\\src\\File.txt");
    Scanner input =new Scanner(System.in);
    PrintWriter p =new PrintWriter(f);
    for(int i=0;i<3;i++){
    	System.out.println("Bilgilerinizi giriniz:");
    	System.out.println("Ad Soyad: ");
    	String a=input.nextLine();
    	System.out.println("Not 1 ");
    	String b=input.nextLine();
    	System.out.println("Not 2: ");
    	String c=input.nextLine();
    	p.println(a+"\t"+b+"\t"+c);
    }
    p.close();	
    }

	}








