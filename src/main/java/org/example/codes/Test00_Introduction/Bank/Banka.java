package org.example.Test00_Introduction.Bank;
import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Banka {
	
		private static String kullaniciAdi;
		private String sifre;
		private static int hesapNoSayac;		
		
		public Banka(){
			this.kullaniciAdi=null;
			this.sifre=null;
			this.hesapNoSayac=0;
		}
		public Banka(String a){
			this.kullaniciAdi=a;
		}
		public Banka(String a,String b){
			this.kullaniciAdi=a;
			this.sifre=b;
		}
		public Banka(String a,String b,int c){
			this.kullaniciAdi=a;
			this.sifre=b;
			this.hesapNoSayac=c;
		}							
		public void setKullaniciAdi(String a){
			this.kullaniciAdi=a;
		}
		public void setSifre(String a){
			this.sifre=a;
		}
		public void setHesapNoSayac(int a){
			this.hesapNoSayac=a;
		}	
		public void setBank(String a,String b,int c){
			this.kullaniciAdi=a;
			this.sifre=b;
			this.hesapNoSayac=c;			
		}
		public void olusturHesap(Musteri c)throws Exception{
			olusturKullaniciAd(c);
			olusturSifre(c);
			//Bu methoddaki islemlerin tamamı icindeki methodlarda yapilmaktadir.
		}
		public void olusturKullaniciAd(Musteri c)throws Exception{
			File file=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt");
 			FileWriter fw=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt",true);
 			File hesapbilgi=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt");
			FileWriter fw2=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt",true);
			File hesapdenge=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt");
			FileWriter fw1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",true);
			PrintWriter pw=new PrintWriter(fw);
			PrintWriter pw1=new PrintWriter(fw1);
 			PrintWriter pw2=new PrintWriter(fw2);
            Scanner read=new Scanner(file);
			Scanner input = new Scanner(System.in);			
			int control1=0;
			while(control1<1){
				while(read.hasNext()){
				System.out.println("Lutfen bir kullanici adi giriniz :");
		    	String x=input.nextLine();
				String y=read.nextLine();
				String[] parcalar=y.split("\t");
				if(x.equals(parcalar[3])){
					System.out.println("Hata! Sistemde bu isimde bir kullanici mevcut.");
				}
				else{
					control1++;
					pw.print(c.getIsim()+"\t"+c.getSoyisim()+"\t"+c.getYas()+"\t"+x+"\t");
					pw1.println(hesapNoSayac+"\t"+"0");
					pw2.println(x+"\t"+hesapNoSayac);
				}
			}
				read.close();	
				pw.close();
		}
			hesapNoSayac++;
		}
		public void olusturSifre(Musteri c)throws Exception{
			Scanner input = new Scanner(System.in);	
			FileWriter fw=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt",true);
	     	PrintWriter pw=new PrintWriter(fw);
			int control1=0;
			while(control1<1){
	    	System.out.println("Sifreniz :");
			String x=input.nextLine();			
			if(x.contains(c.getIsim())||x.contains(c.getSoyisim())){
				System.out.println("Sifreniz adinizi veya soyadinizi icermemelidir! ");
			}
			else{
				System.out.println("Islem basarili bir sekilde gerceklesmistir. ");
				control1++;
				pw.println(x);
			}
			}
			pw.close();
		}
		public void yatirPara(Musteri c)throws Exception{
			Scanner input = new Scanner(System.in);	
			File hesapdenge=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt");
			FileWriter fw1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",true);
			Scanner read1=new Scanner(hesapdenge);
			PrintWriter pw1=new PrintWriter(fw1);
			System.out.println("Hesap No : ");
    		String para1=input.nextLine();
    		System.out.println("Miktar :");
    		int para1m=input.nextInt();
    		String satirlar="";
			String yeniSatir="";
    		while(read1.hasNext()){
    			String a1=read1.nextLine();
    			String[] parcalara=a1.split("\t");
    			if(parcalara[0].equals(para1)){
    //				pw1.println(para1+"\t"+(Integer.parseInt(parcalara[1])+para1m));
    				yeniSatir=para1+"\t"+(Integer.parseInt(parcalara[1])+para1m);
    					}
    			else{
    				yeniSatir=a1;
    			}
    			satirlar=satirlar+yeniSatir+"\n";
    				}
			FileWriter x=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",false);
            PrintWriter p=new PrintWriter(x);
            p.println(yeniSatir);
    		p.close();
    		read1.close();
		}
		public void cekPara(Musteri c)throws Exception{
			Scanner input = new Scanner(System.in);	
			File hesapdenge=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt");
			FileWriter fw1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",true);
			Scanner read1=new Scanner(hesapdenge);
			PrintWriter pw1=new PrintWriter(fw1);
			System.out.println("Hesap No : ");
    		String para2=input.nextLine();
    		System.out.println("Miktar :");
    		int para2m=input.nextInt();
    		String satirlar="";
			String yeniSatir="";
    		while(read1.hasNext()){
    			String a2=read1.nextLine();
    			String[] parcalarb=a2.split("\t");
    			if(parcalarb[0].equals(para2)){
    	//			pw1.println(para2+"\t"+(Integer.parseInt(parcalarb[1])-para2m));
    				yeniSatir=para2+"\t"+(Integer.parseInt(parcalarb[1])+para2m);
    					}
    			else{
    				yeniSatir=a2;
    			}
    			satirlar=satirlar+yeniSatir+"\n";
    				}
    		FileWriter x=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",false);
            PrintWriter p=new PrintWriter(x);
            p.println(yeniSatir);
    		p.close();
    		read1.close();
		}
		public void ekleHesap(Musteri c)throws Exception{
			FileWriter fw1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",true);
			FileWriter fw2=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt",true);
			PrintWriter pw1=new PrintWriter(fw1);
			PrintWriter pw2=new PrintWriter(fw2);
			pw1.println(hesapNoSayac+"\t"+"0");
			pw2.println(kullaniciAdi+"\t"+hesapNoSayac);
			hesapNoSayac++;
			pw1.close();
			pw2.close();
		}
		public void silHesap(Musteri c)throws Exception{
			Scanner input=new Scanner(System.in);	
			File musteriBilgi =new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt");
			FileWriter fw=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt",true);
			File hesapdenge=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt");
			FileWriter fw1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",true);
			File hesapbilgi=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt");
			FileWriter fw2=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt",true);
			Scanner read=new Scanner(musteriBilgi);
			Scanner read1=new Scanner(hesapdenge);
			Scanner read2=new Scanner(hesapbilgi);
			System.out.println("Silmek istediginiz hesap numarasi :");
			String alinan=input.nextLine();
			String satirlar="";
			String yeniSatir="";
			String satirlar1="";
			String yeniSatir1="";
			while(read1.hasNext()){
				String satir=read1.nextLine();
				String[] parcalar=satir.split("\t");
				if(parcalar[0].equals(alinan)){
					yeniSatir="";   //hesabi silmek için bos stringe esitliyorum
				}
				else{
					yeniSatir=parcalar[0]+parcalar[1];
				}
				satirlar=satirlar+yeniSatir+"\n";
			}
			while(read2.hasNext()){
				String satir1=read2.nextLine();
				String[] parcalar=satir1.split("\t");
				if(parcalar[1].equals(alinan)){
					yeniSatir1="";      //hesabi silmek için bos stringe esitliyorum
				}
				else{
					yeniSatir1=parcalar[0]+parcalar[1];
				}
				satirlar1=satirlar1+yeniSatir1+"\n";
			}
			FileWriter fwdenge=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",false);
			PrintWriter pwdenge=new PrintWriter(fwdenge);
			pwdenge.println(satirlar);
			pwdenge.close();
			read1.close();
			FileWriter fwbilgi=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt",false);
			PrintWriter pwbilgi=new PrintWriter(fwbilgi);
			pwbilgi.println(satirlar1);
			pwbilgi.close();
			read2.close();
		}
		public void degistirSifre(Musteri c)throws Exception{
			Scanner input = new Scanner(System.in);
			FileWriter fw=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt",true);
			PrintWriter pw=new PrintWriter(fw);
			String satirlar="";
			String yeniSatir="";
			int control5=0;
			while(control5<1){
				System.out.println("Yeni Sifreniz : ");
				String deg=input.nextLine();
				if(deg.contains(c.getIsim())||deg.contains(c.getSoyisim())){
					System.out.println("Sifreniz adinizi veya soyadinizi icermemelidir! ");
				}
				else{
					System.out.println("Islem basarili bir sekilde gerceklesmistir. ");
					control5++;
			        pw.println(c.getIsim()+"\t"+c.getSoyisim()+"\t"+c.getYas()+"\t"+kullaniciAdi+"\t"+deg);					
				}
				
			}
			pw.close();
		}
		public void listeleMusteri()throws Exception{
			File file=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt");
			Scanner read=new Scanner(file);
			while(read.hasNext()){
				String x = read.nextLine();
				String[] parcalar=x.split("\t");
				System.out.println("Ad: "+parcalar[0]);
				System.out.println("Soyad: "+parcalar[1]);
				System.out.println("Yas: "+parcalar[2]);
			}
			read.close();
		}
		public static void main(String[] args)throws Exception {
			Banka banka=new Banka();
			Musteri m=new Musteri();
			Scanner input=new Scanner(System.in);	
			File musteriBilgi =new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt");
			FileWriter fw=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\musteriBilgi.txt",true);
			File hesapdenge=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt");
			FileWriter fw1=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapDenge.txt",true);
			File hesapbilgi=new File("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt");
			FileWriter fw2=new FileWriter("C:\\Users\\Mustafa\\Desktop\\JAVA PROGRAMMING\\JAVA Eclipse\\Assigment\\Homework2\\CengHomeWork\\src\\Bank\\hesapBilgi.txt",true);
			PrintWriter pw=new PrintWriter(fw);
			PrintWriter pw1=new PrintWriter(fw1);
			PrintWriter pw2=new PrintWriter(fw2);
			Scanner read=new Scanner(musteriBilgi);
			Scanner read1=new Scanner(hesapdenge);
			Scanner read2=new Scanner(hesapbilgi);
			int hesapNoSayac=1;
			banka.setHesapNoSayac(hesapNoSayac);
			int control2=0;
			while(control2<1){
				System.out.println(".....MENU.....\n");
				System.out.println("* Yeni Hesap");
				System.out.println("* Hesap Sec");
				System.out.println("* Listele Musteriler");
				System.out.println("* Cikis");
				System.out.println();
				System.out.println("Secim :");
				int x=input.nextInt();
				if(x==1){
					System.out.println("Ad :");
					String x11=input.nextLine();
					 x11=input.nextLine();
					System.out.println("Soyad :");
					String x12=input.nextLine();
					System.out.println("Yas:");
					int x13=input.nextInt();																	
					m.setMusteri(x11, x12, x13);
					banka.olusturKullaniciAd(m);
					banka.olusturSifre(m);					
				}
				if(x==2){
					System.out.println("Kullanici Adiniz : ");
					String x21=input.nextLine();
					System.out.println("Sifreniz : ");
					String x22=input.nextLine();
				    while(read.hasNext()){
				    	String abc=read.nextLine();
				    	String[] abcdizi=abc.split("\t");
				    	if(abcdizi[3].equals(x21)){
				    		if(abcdizi[4].equals(x22)){
				    			System.out.println("Kullanici adi ve sifre kabul edilmistir.");		
				    	m.setMusteri(abcdizi[0],abcdizi[1],Integer.parseInt(abcdizi[2]));
				    		}
				    	}
				    }					
	                int control3=0;
	                while(control3<1){
	                	System.out.println("1. Degistir Sifre");
	                	System.out.println("2. Yatir Para");
	                	System.out.println("3. Cek Para");
	                	System.out.println("4. Ekle Hesap");
	                	System.out.println("5. Sil Hesap");
	                	System.out.println("6. Yazdir");
	                	System.out.println("7. Cikis");
	                	System.out.println();
	                	System.out.println("Secim: ");
	                	int y=input.nextInt();
	                	if(y==1){
	                		banka.degistirSifre(m);
	                	}
	                	if(y==2){
	                		banka.yatirPara(m);
	                			}	                               	
	                	if(y==3){
	                		banka.cekPara(m);
	                	}
	                	if(y==4){
	                		banka.ekleHesap(m);
	                	}
	                	if(y==5){
	                		banka.silHesap(m);
	                	}
	                	if(y==6){
	                		while(read1.hasNext()){
	                			String x6=read1.nextLine();
	                			String[] parcalar6=x6.split("\t");
	                			System.out.println("Hesap No: "+parcalar6[0]);
	                			System.out.println("Para Miktari: "+parcalar6[1]);
	                		}
	                	}
	                	if(y==7){
	                		System.out.println("Gule Gule\nIslemler bolumunden ciktiniz.");
	                		control3++;
	                	}
	                }
				}
				if(x==3){
					banka.listeleMusteri();
				}
				if(x==4){
					System.out.println("   Gule Gule   ");
					control2++;
				}
			}									
		} 
    }
