package org.example.Test10_Objects_Classes;

public class tarih {
private int gun;
private int ay;
private int yil;

public tarih(){
	
}
public tarih(int gun){
	this.gun=gun;
}
public tarih(int gun,int ay){
	this.gun=gun;
	this.ay=ay;
}
public tarih(int gun,int ay,int yil){
	this.gun=gun;
	this.ay=ay;
	this.yil=yil;
}
public void setgun(int x){
	gun=x;
}
public void setay(int x){
	ay=x;
}
public void setyil(int x){
	yil=x;
}
public void settarih(int gun,int ay,int yil){
	   this.gun=gun;
	   this.ay=ay;
	   this.yil=yil;
	   
}
public int getgun(){
	return gun;
}
public int getay(){
	return ay;
}
public int getyil(){
	return yil;
}

	   

public void esitmi(tarih t){
	if(gun==t.gun && ay==t.ay &&   yil==t.yil){
		System.out.println("esittir");
	}
	else
		System.out.println("degldr");
	
}
public void printtarih()	{
	System.out.println("gun"+gun+"ay"+ay+"yil"+yil);
}
public static void main(String[] args){
	tarih a =new tarih();
	tarih b =new tarih();
	a.printtarih();
	a.settarih(10,20,30);
	a.printtarih();
	b.settarih(12,20,30);
	a.esitmi(b);
}
}
