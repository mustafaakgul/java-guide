package org.example.Test10_Objects_Classes;

import java.util.Scanner;

public class yazar {
	
	private static String isim;
	private static String email;
	private static String cinsiyet;
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public void print() {
		System.out.println("Yazarin ismi: " + isim+ "\nEmaili: " + email + "\ncinsiyeti: " + cinsiyet);
	}



public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Yazarin ismi? ");
	isim = input.nextLine();
	System.out.println("Yazarin emaili? ");
	email = input.nextLine();
	System.out.println("Yazarin cinsiyeti?");
	cinsiyet = input.nextLine();
	
	yazar a = new yazar();
	a.print();
	yazar b = new yazar();
	b.setIsim("ahmet");
	b.setEmail("ahmet@gmail.com");
	b.setCinsiyet("erkek");
	b.print();
	yazar c = new yazar();
	b.setIsim("cmet");
	b.setEmail("cmet@gmail.com");
	b.setCinsiyet("bayan");
	c.print();
}
}
