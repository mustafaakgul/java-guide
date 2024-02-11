package org.example.Test10_Objects_Classes;

public class kutu {
	

	private  int uzunluk;
	private  int genislik;
	private  String renk;

	public  int getuzunluk() {
		return uzunluk;
	}

	public  void setuzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public  int getgenislik() {
		return genislik;
	}

	public  void setgenislik(int genislik) {
		this.genislik = genislik;
	}

	public  String getrenk() {
		return renk;
	}

	public  void setrenk(String renk) {
		this.renk = renk;
	}

	public  int getalan(int a, int b) {
		return a * b;
	}

	public  int getcevre(int a, int b) {
		return (a + b) * 2;
	}

	public  void print() {
		System.out.println("uzunluk: " + uzunluk);
		System.out.println("genslk " + genislik);
		System.out.println("renk: " + renk);
	}




public static void main(String[] args) {
	kutu k1 = new kutu();
	kutu k2 = new kutu();

	k1.setuzunluk(7);
	k1.setgenislik(12);
	k1.setrenk("syah");
	System.out.println("alan: " + k1.getalan(7,12 ));
	System.out.println("cevre: " + k1.getcevre(7, 12));
	k1.print();
	System.out.println();
	k2.setuzunluk(6);
	k2.setgenislik(3);
	k2.setrenk("kırmızı");
	System.out.println("alan: " + k2.getalan(6, 3));
	System.out.println("cevre: " + k2.getcevre(6, 3));
	k2.print();
}

}


