package org.example.Test10_Objects_Classes;

import java.util.Scanner;

public class sayi {

	
	private  int sayi;

	public  int getsayi() {
		return sayi;
	}

	public  void setsayi(int sayi) {
		this.sayi =sayi;
	}

	public  boolean sifirmi(int sayi) {
		if (sayi == 0)
			return true;
		else
			return false;
	}

	public  boolean pozitifmi(int sayi) {
		if (sayi >= 0)
			return true;
		else
			return false;
	}

	public  boolean negatifmi(int sayi) {
		if (sayi < 0)
			return true;
		else
			return false;
	}

	public  boolean tekmi(int sayi) {
		if (sayi % 2 != 0)
			return true;
		else
			return false;
	}

	public  boolean cifmi(int sayi) {
		if (sayi % 2 == 0)
			return true;
		else
			return false;
	}

	public  boolean asalmi(int sayi) {
		if (sayi > 2) {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0)
					return false;
				else
					return true;
			}

		}

		else
			return false;

		return true;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		sayi n1 = new sayi();
		sayi n2 = new sayi();
		System.out.print("sayi girin: ");
		int sayi = input.nextInt();
		n1.setsayi(sayi);
		System.out.println("sifirmi: " + n1.sifirmi(sayi));

		System.out.println("pozitifmi " + n1.pozitifmi(sayi));

		System.out.println("negatifmi: " + n1.negatifmi(sayi));

		System.out.println("tekmi " + n1.tekmi(sayi));

		System.out.println("cifmi: " + n1.cifmi(sayi));

		System.out.println("asasmı: " + n1.asalmi(sayi));

		System.out.println("Faktorial: " + n1.getfaktoriel(sayi));

		System.out.println("tersi: " + n1.getters(sayi));

		System.out.println("karekok: " + n1.getkok(sayi));

		System.out.println("toplambasamak: " + n1.toplam(sayi));

		int sayi2 = input.nextInt();

		System.out.println("sifirmi: " + n2.sifirmi(sayi2));

		System.out.println("pozitif: " + n2.pozitifmi(sayi2));

		System.out.println("negatif: " + n2.negatifmi(sayi2));

		System.out.println("tek: " + n2.tekmi(sayi2));

		System.out.println("cift: " + n2.cifmi(sayi2));

		System.out.println("asal: " + n2.asalmi(sayi2));

		System.out.println("faktoriel: " + n2.getfaktoriel(sayi2));

		System.out.println("ters: " + n2.getters(sayi2));

		System.out.println("kok: " + n2.getkok(sayi2));

		System.out.println("toplm: " + n2.toplam(sayi2));

	}



	public static int getfaktoriel(int sayi) {
		if (sayi == 1)
			return 1;
		else
			return sayi * getfaktoriel(sayi - 1);
	}

	public static double getkok(int sayi) {
		return Math.sqrt(sayi);
	}

	public static int toplam(int sayi) {
		int sum = 0;
		for (int i = 1; i < sayi; i++) {
			sum += sayi % 10;
			if (sayi < 10) {
				sum=0;
				sum += sayi;
				break;
			}
		}
		return sum;
	}

	public static int getters(int sayi) {
		int ters = 0;
		while (sayi != 0) {
			ters = ters * 10;
			ters = ters + sayi % 10;
			sayi = sayi / 10;
		}
		return ters;

	}

}
