package org.example.Test10_Objects_Classes;


public class car {
	
	private int hiz;
	private int yol;
	private String marka;
	private String renk;

	public car()  {
		
	}
	public car(int hiz){
		this.hiz=hiz;
		
	}
	public car(int hiz,int yol){
		this.hiz=hiz;
		this.yol=yol;
	}
	public car(int hiz,int yol,String marka){
		this.hiz=hiz;
		this.yol=yol;
		this.marka=marka;
	}
	public car(int hiz,int yol,String marka,String renk){
		this.hiz=hiz;
		this.yol=yol;
		this.marka=marka;
		this.renk=renk;
	}
	
   public void sethiz(int x){
	   hiz=x;
   }
   public void setyol(int x){
	   yol=x;
   }
	   public void setmarka(String x){
		   marka=x;
	   }
		   public void setrenk(String x){
			   renk=x;
		   }
   public void setCar(int hiz,int yol,String marka,String renk){
	   this.hiz=hiz;
	   this.yol=yol;
	   this.marka=marka;
	   this.renk=renk;
   }
   public void gazaBas(int x){
	   hiz=hiz+x;
	   yol=yol+x*10;
   }
  
   public void freneBas(int x){
	   hiz=hiz-x;
	   yol=yol+x;
	   
   }
   public void printCar(){
	   System.out.println("renk"+renk+"\nhiz"+hiz+"\nmarka"+marka+"\nyol"+yol);
   }




public static void main(String[] args) {
	car a= new car();
	a.printCar();
	a.setCar(10,20,"adsda","lklkl");
	a.printCar();
	System.out.println("degstrldi");
	a.setrenk("krmz");
	a.sethiz(50);
	a.setyol(100);
	a.setmarka("wwrw");
	a.printCar();
	System.out.println("ikinci araba");
	car b = new car(50,60,"ert","hjjjj");
	b.printCar();
	
}
}