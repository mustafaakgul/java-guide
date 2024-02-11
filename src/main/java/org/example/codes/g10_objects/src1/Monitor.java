package org.example.Test10_Objects_Classes.src1;

public class Monitor {
	
	private boolean renkli;
	private int size;
	
	public Monitor(){
		
	}
	public Monitor(boolean r){
		this.renkli=r;
	}
	public Monitor(boolean s, int size){
		this.renkli=s;
		this.size=size;
	}
	public void setmonitor(boolean x,int y){
		this.renkli=x;
		this.size=y;
	}
	public void setrenkli(boolean x){
		this.renkli=x;		
	}
	public void setsize(int y){		
		this.size=y;
	}
	public boolean getrenkli(){
		return renkli;
	}
	public int getsize(){
		return size;
	}
	public void printmonitor(){
		System.out.println("Renginiz: "+renkli+" \nboyut: "+size);
	}
	public static void main(String[] args){
		Monitor a = new Monitor();
		a.printmonitor();
		a.setmonitor(true,15);
		a.printmonitor();
	}

}
