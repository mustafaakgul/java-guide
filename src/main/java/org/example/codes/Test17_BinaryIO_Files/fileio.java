package org.example.Test17_BinaryIO_Files;
import java.util.*;
import java.io.*;

public class first {
	public static void kisiekle()throws Exception{
		FileWriter f=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.2\\lab\\src\\lab\\file.txt",true);
		PrintWriter p=new PrintWriter(f);
		Scanner input=new Scanner(System.in);
		System.out.println("Kisi ismini girin: ");
		String s=input.nextLine();
		System.out.println("Tel nosunu giriniz: ");
		String s2=input.nextLine();
		p.println(s+"\t"+s2);
		p.close();
	}
	public static void kisiara()throws Exception{
		File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.2\\lab\\src\\lab\\file.txt");
		Scanner read=new Scanner(f);
		Scanner input=new Scanner(System.in);
		System.out.println("Aradigin kisi: ");
		String s1=input.nextLine();
		while(read.hasNext()){
			String s2=read.next();
			String[] parcalar=s2.split("\t");
			if(parcalar[0].equals(s1)){
				System.out.println(parcalar[0]+"  "+parcalar[1]);
			}
		}
		read.close();
		//2. soru ile aynı cevap
	}
	public static int kisibulma()throws Exception{
		Scanner input=new Scanner(System.in);
		File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.2\\lab\\src\\lab\\file.txt");
		Scanner read=new Scanner(f);
		System.out.println("Aramak istediginiz kisi");
		String s=input.nextLine();
		int sayac=0;
		while(read.hasNext()){
			String a=read.nextLine();
			String[] parcalar=a.split("\t");
			if(parcalar[0].equals(s)){
				sayac++;
			}
		}
		read.close();
		return sayac;
	}
	public static void method4()throws Exception{
		File f=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\11.2\\lab\\src\\lab\\file.txt");
        Scanner read=new Scanner(f);
        while(read.hasNext()){
        	String x=read.nextLine();
        	String[] parcalar=x.split("\t");
        	if(parcalar[1].startsWith("212")){
        System.out.println(parcalar[1]);   //hata neden var anlamadim
	}
	public static void main(String[] args)throws Exception {
		Scanner input=new Scanner(System.in);
		System.out.println("1. Kisi ekle");
		System.out.println("2. Kisi ara");
		System.out.println("3. Kisi bulma");
		System.out.println("4. 212 ile baslayan liste");
		System.out.println("5. Kisi sil");
		
		int s=input.nextInt();
		if(s==1){
			kisiekle();
		}
		if(s==2){
			kisiara();
		}
		if(s==3){
			kisibulma();
		}
		if(s==4){
			method4();
		}
	}

}
