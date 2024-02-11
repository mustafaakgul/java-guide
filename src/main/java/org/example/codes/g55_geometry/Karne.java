package org.example.codes.g55_geometry;

//class değişkeni olarak dizi kullanmak
public class Karne{
	private String ogno;
	private  int notlar[]=new int[10];
	private  int kredi[]=new int[10];

	public Karne(String n,int a[],int b[]){
		ogno=n;
		for(int i=0;i<10;i++){
			notlar[i]=a[i];
			kredi[i]=b[i];
		}
	}
	public void setKarne(String n,int a[],int b[]){
		ogno=n;
		for(int i=0;i<10;i++){
			notlar[i]=a[i];
			kredi[i]=b[i];

		}
	}

	public void yaz(){
		System.out.println("no:"+ogno);
		for(int i=0;i<10;i++){
			System.out.println("not:"+notlar[i]);
			System.out.println("kredi:"+kredi[i]);
		}
		System.out.println();
	}
	public void ortalama(){
		double ort;
		int toplam=0,ktop=0;
		for(int i=0;i<10;i++){
			toplam=toplam+notlar[i]*kredi[i];
			ktop=ktop+kredi[i];
		}
		ort=(double)(toplam)/ktop;
		System.out.printf("ağırlıklı ortalama= %.2f",ort);    
	}
	public static void main(String[] args) {

		int n[]={20,30,40,50,60,7,12,13,45,67};
		int k[]={2,7,4,5,6,5,12,1,5,6};
		Karne k1= new Karne("01170709",n,k);
		k1.yaz();
		k1.ortalama();
	}
}
