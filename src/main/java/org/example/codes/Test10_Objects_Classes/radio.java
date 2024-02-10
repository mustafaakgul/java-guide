package org.example.Test10_Objects_Classes;

public class radio {
	private int frekans;
	private int volumeLevel;
	private boolean on;
	
	public radio(){
		
	}
	public radio(int r){
		this.frekans=r;
	
    }
    public radio(int r,int s){
    	this.frekans=r;
    	this.volumeLevel=s;
	}
    public radio(int r,int s,boolean k){
    	this.frekans=r;
    	this.volumeLevel=s;
    	this.on =k;
    }
    public void setFrekan(int x){
    	x=frekans;
    }
    public void setVolume(int x){
    	x=volumeLevel;
    }
    public void setradio(int a,int b,boolean c){
    	this.frekans=a;
    	this.volumeLevel=b;
    	this.on=c;
    }
    public void frekansarttır(){
    	frekans=frekans+10;
    }
    public void frekansazalt(){
    	frekans=frekans-20;
    }
    public void sesarttır(){
    	volumeLevel=volumeLevel+2;
    }
    public void sesazalt(){
    	volumeLevel=volumeLevel-3;
    }
    public void print(){
    	System.out.println("frekansiniz: "+frekans+" sesiniz: "+volumeLevel);
    }

    public static void main(String[] args){
    	radio r1 = new radio();
    	radio r2 = new radio();
    	r1.print();
    	r1.setradio(50,5,true);
    	r1.print();
    	r1.frekansarttır();
    	r1.print();
    	r1.frekansazalt();
    	r1.print();
    	r1.sesarttır();
    	r1.print();
    	r1.sesazalt();
    	r1.print();
    }
}