package CengApp;


public class DaireNokta {
	  private double yaricap ;
	  private Nokta merkez ;
	  public DaireNokta() {
		    yaricap=0;
		    merkez.setNokta(0, 0);
		  }
	  public DaireNokta(double r, Nokta n) {
	    setYaricap(r); 
	    merkez=n;
	  }
	  public setDaire(double r,Nokta n){
		  setYaricap(r);
		  merkez=n;
	  }
	  public void setMerkez(Nokta n){
		  merkez=n;
	  }
	   public void setYaricap(double r) {
	    if(r>=0) 
	    	yaricap = r;
	    else
	    	yaricap= 0;
	  }
	   public double getYaricap() { 
		   return yaricap; 
	   }
	   public Nokta getMerkez(){
		   return merkez; 
	   }
	   public void yazDaire() {
		   System.out.println("Yarıçap = "+ yaricap);
		   System.out.print("Merkez : "); 
		   merkez.yazNokta();
	   }
	   public double alan() {
	    return yaricap * yaricap * Math.PI;
	  }
	   public void hareket(double xArtim, double yArtim){
		   double a,b;
		   a= merkez.getX()+xArtim;
		   merkez.setX(a);
		   b= merkez.getY()+yArtim;
		   merkez.setY(b);
		   System.out.printf("Daire x=%.0f ve y=%.0f kadar hareket ediyor.\n",xArtim,yArtim);
	   }
	   public void uzaklik(){
		   double uzak;
		   uzak=merkez.uzaklik();
		   System.out.printf("Uzaklık= %.2f\n\n",uzak);
	   }
	   public static void main(String[] args){
		   Nokta n1=new Nokta(3,4);
		   DaireNokta d1=new DaireNokta(5,n1);
		   d1.yazDaire();
		   d1.uzaklik();
		   d1.hareket(4,4);
		   d1.yazDaire();
		   d1.uzaklik();
		   DaireNokta d2=new DaireNokta(6,n1);
		   if(d1.equals(d2))
			   System.out.println("Esittir");
			   else
				   System.out.println("Degildir");
			   		
	   }
	}