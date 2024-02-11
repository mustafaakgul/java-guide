package org.example.Test10_Objects_Classes;

public class karmasik {
	
	private double gercek;
	private double sanal;
	
	public karmasik(){
		gercek=0;
		sanal=0;
	}
	public karmasik(double r){
		this.gercek = r;
		
	}
	public karmasik(double r,double s) {
		this.gercek = r;
		this.sanal = s;
		
	}
	public void setGercek(double x){
		gercek = x;
	}
	public void setSanal(double x){
		sanal = x;
	}
	public void setKarmasik(double gercek,double sanal){
		this.gercek = gercek;
		this.sanal = sanal;
	}
	public double getGercek(){
		return gercek;
	}
	public double getSanal(){
		return sanal;
	}
	public void printKarmasik(){
		System.out.println("gercek kismi =" + gercek + "sanal kismi = i" +sanal);
	}
	public void ekleKarmasik(karmasik t){
		karmasik k3 = new karmasik();
		k3.gercek=gercek+t.gercek;
		k3.sanal=sanal+t.sanal;
		System.out.println(k3.gercek+"+"+k3.sanal+"i");
		
		
	}
	public void esitmi(karmasik k2){
		if(gercek == k2.gercek && sanal == k2.sanal)
			System.out.println("Esittir");
		else
			System.out.println("degildir");
	
		
	}
	public karmasik buleslenik(){
		karmasik e = new karmasik();
		
		e.gercek = this.gercek;
		e.sanal = this.sanal*(-1);
		System.out.println("sayiniz:"+gercek+"+i"+e.sanal);
		System.out.println(gercek+"+"+sanal+"i");
		return e;
		
	}
	public static void main(String[] args){
		
		karmasik k1 = new karmasik();
		karmasik k2 = new karmasik();
		k1.printKarmasik();
		k1.setKarmasik(5,4);
		k1.printKarmasik();
	karmasik z =	k1.buleslenik();
	System.out.println(z.sanal);
	k2.setKarmasik(5,6);
		k1.esitmi(k2);
		k1.ekleKarmasik(k2);
	}

}
