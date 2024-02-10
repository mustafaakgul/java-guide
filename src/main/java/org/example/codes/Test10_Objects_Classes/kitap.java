package org.example.Test10_Objects_Classes;

import java.util.Scanner;

public class kitap {
	private static String isim;
	private static double fiyat;
	private static int stokmiktari;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public  double getFiyat() {
		return fiyat;
	}

	public  void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public  int getStokmiktari() {
		return stokmiktari;
	}

	public  void setStokmiktari(int stokmiktari) {
		this.stokmiktari = stokmiktari;
	}

	public  void print() {
		System.out.println("kitabin ismi: " + isim + "\nfiyati: "
				+ fiyat+ "\nstok miktari: " + stokmiktari);
	}

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("kitabin ismi? ");
		isim = p.next();
		System.out.println("fiyati? ");
		fiyat = p.nextDouble();
		System.out.println("stok miktari");
		stokmiktari = p.nextInt();

		kitap k1 = new kitap();
		kitap k2 = new kitap();
		kitap k3 = new kitap();

		k1.print();

		k2.setIsim("yuzengemi");
		k2.setFiyat(19.99);
		k2.setStokmiktari(58);
		k2.print();

		k3.setIsim("ucan kus");
		k3.setFiyat(14.99);
		k3.setStokmiktari(87);
		k3.print();

	}
}