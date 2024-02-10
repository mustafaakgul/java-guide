package org.example.Test00_Introduction.Bank;


public class Musteri {
	private String isim;
	private String soyisim;
	private int yas;
	
	public Musteri (){
		this.isim=null;
		this.soyisim=null;
		this.yas=0;
	}
	public Musteri(String a){
		this.isim=a;
	}
	public Musteri(String a,String b){
		this.isim=a;
		this.soyisim=b;
	}
	public Musteri(String a,String b,int c){
		this.isim=a;
		this.soyisim=b;
		this.yas=c;
	}
	public void setIsim(String a){
		this.isim=a;
	}
	public void setSoyisim(String a){
		this.soyisim=a;
	}
	public void setYas(int a){
		this.yas=a;
	}
	public void setMusteri(String a, String b,int c){
		this.isim=a;
		this.soyisim=b;
		this.yas=c;
	}
	public String getIsim(){
		return isim;
	}
	public String getSoyisim(){
		return soyisim;
	}
	public int getYas(){
		return yas;
	}
	public void PrintCustomer(){
		System.out.println("Isminiz : "+getIsim());
		System.out.println("Soyisminiz : "+getSoyisim());
		System.out.println("Yasiniz : "+getYas());
	}
	public static void main(String[] args) {
		
	}

}
