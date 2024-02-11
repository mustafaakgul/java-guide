package org.example.Test10_Objects_Classes;
import java.util.Scanner;
public class insan {

	
	private  int idno;
	private  String isim;
	private  String soyad;
	private  int dogumtarihi;
	private  String meslek;

	public  int getIdno() {
		return idno;
	}

	public  void setIdno(int idno) {
		this.idno = idno;
	}

	public  String getIsim() {
		return isim;
	}

	public  void setIsim(String isim) {
		this.isim = isim;
	}

	public  String getSoyad() {
		return soyad;
	}

	public  void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public  int getDogumtarihi() {
		return dogumtarihi;
	}

	public  void setDogumtarihi(int dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}

	public  String getMeslek() {
		return meslek;
	}

	public  void setMeslek(String meslek) {
		this.meslek = meslek;
	}

	public  int yasbul() {
		return 2015 - dogumtarihi;
	}

	public  void yaz() {
		System.out.println("ismi: " + isim + "\nsoyismi: "
				+ soyad + "\ndogum tarihi: " + dogumtarihi
				+ "\nyasi: " + yasbul() + "\nnosu: " + idno
				+ "\nmeslegi: " + meslek);
	}



public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	insan p1 = new insan();
	System.out.print("ismi :");
	String.setIsim =input.nextLine;
	System.out.print("soyismi? :");
	String.setSoyad =input.nextLine;
	System.out.print("numarasi? :");
	int setIdno =input.nextInt;
	System.out.print("dogum tarihi? :");
	int setDogumtarihi =input.nextInt;
	System.out.print("meslegi? :");
	String.setMeslek =input.nextLine;

	

	p1.yaz();
	System.out.println();
	insan p2 = new insan();

	p2.setIsim("ahmet");
	p2.setSoyad("mhmet");
	p2.setDogumtarihi(1955);
	p2.setIdno(578569);
	p2.setMeslek("muhendis");
	p2.yasbul();
	p2.yaz();
}
}

