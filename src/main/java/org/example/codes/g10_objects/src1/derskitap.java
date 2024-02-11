package org.example.Test10_Objects_Classes.src1;

public class derskitap {
	
	private String kitapad;
	private String yazar;
	private String yayinevi;
	
	public derskitap(){
		
	}
	public derskitap(String a){
         this.kitapad=a;
}
	public derskitap(String a,String b){
		this.kitapad=a;
		this.yazar=b;
	}
	public derskitap(String kitapad,String yazar,String yayinevi){
		this.kitapad=kitapad;
		this.yazar=yazar;
		this.yayinevi=yayinevi;
	}
	public String getkitapad(){
		return kitapad;
	}
	public String getyazar(){
		return yazar;
	}
	public String getyayinad(){
		return yayinevi;
	}
	public void setkitapad(String a){
		this.kitapad=a;
	}
	public void setyazar(String a){
		this.yazar=a;
	}
	public void setyayinevi(String a){
		this.yayinevi=a;
	}
	public void setders(String a,String b,String c){
		this.kitapad=a;
		this.yazar=b;
		this.yayinevi=c;
	}
	public void print(){
		System.out.println("Kitap Adi: "+kitapad+" Yazar: "+yazar+" Yayinevi: "+yayinevi);
	}
	public static void main(String[] args){
		
	}
}
