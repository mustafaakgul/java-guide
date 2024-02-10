package org.example.Test10_Objects_Classes;

public class lamba {
	
	private int guc ;
	private String renk;
	private boolean konum;
	
	public lamba(){
		
	}
	public lamba(int guc){
		this.guc=guc;
	}
	public lamba(int guc,String renk){
		this.guc=guc;
		this.renk=renk;
	}
	public lamba(int guc,String renk,boolean konum){
		this.guc=guc;
		this.renk=renk;
		this.konum=konum;
	}
	public void setGuc(int x){
		this.guc=x;
	}
	public void setRenk(String x){
		this.renk=x;
	}
	public void setKonum(boolean x){
		this.konum=x;
	}
	public void setLamba(int x,String y,boolean z){
		this.guc=x;
		this.renk=y;
		this.konum=z;
	}
	public int getGuc(){
		return guc;
	}
	public String getRenk(){
		return renk;
	}
	public boolean getKonum(){
		return konum;
	}
	public void print(){
		System.out.println("guc:"+guc+"renk"+renk+"konumunuz"+konum);
	}
	public void onOff(){
		if(konum==true){
			System.out.println("acıktır");
		}
		else
			System.out.println("kapalıdır");
		}
	
	public void karsılastır(lamba a){
		if(this.guc==a.guc && this.renk==a.renk && this.konum==a.konum){
			System.out.println("Esittir");
			else{
				System.out.println("Degildir");
			}
		}
	}
	
	public static void main(String[] args){
		lamba x = new lamba();
		lamba y = new lamba();
		x.setLamba(5, yesil, true);
		y.setLamba(7, kirmizi, true);
		x.print();
		y.print();
		x.onOff();
		y.onOff();
		x.karsılastır(y);
	}

}
