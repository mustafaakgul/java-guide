package Daire;

public class Daire {

}
//Nesne dizisi oluşturmak 
public class Daire {
	public final double PI=3.14;
	private double yaricap;
	public Daire(){
		yaricap=0;
	}
	public Daire(double r){
		yaricap=r;
	}
	public void setDaire(double x){
		yaricap=x;
	}
	public double getYaricap(){
		return yaricap;
	}
	public void yazDaire(){
		System.out.println("yarıcap="+yaricap);
	}
	public double alan(){
		return PI*yaricap*yaricap;
	}
	public double cevre(){
		return 2*PI*yaricap;
	}
	public boolean esitMi(Daire d){
		if(this.yaricap==d.yaricap)
			return true;
		else
			return false;
	}
	}


public class Daire2 {

public static void main(String[] args){
	double tAlan=0;
	Daire[] d=new Daire[5];
	d[0]=new Daire(5);
	d[1]=new Daire(10);
	d[2]=new Daire(5.3);
	d[3]=new Daire(10.2);
	d[4]=new Daire(5.6);
	for(int i=0;i<5;i++)
		tAlan=tAlan+d[i].alan();
	
	d[0].yazDaire();
	d[1].yazDaire();
	d[2].yazDaire();
	d[3].yazDaire();
	d[4].yazDaire();
	System.out.println("----------------");
	System.out.println("Toplam Alan="+tAlan);
}	
}
-----------Ornek 2
Yukarıdaki Daire classı kullanılarak yapılmış bir program
public class DaireDizi {

	public static Daire[] diziOlustur() { /* Daire nesnelerinden dizi oluşturan ve return eden metot */
		Daire[] d = new Daire[5];
		double x;
		for (int i = 0; i < d.length; i++) {
			x=Math.random()*100;
			d[i] = new Daire(x);
		}
		return d;     //  Diziyi return eder.
	}

public static double topla(Daire[] DaireDizi) {     /*  Daire alanlarını toplayan metot */
		double sum = 0;
		for (int i = 0; i < DaireDizi.length; i++)
			sum += DaireDizi[i].alan();
		return sum;
	}

	public static void printDaireDizi(Daire[] d) {    /* Daire dizisini ve toplam alanlarını yazan metot */
		System.out.printf("%-30s%-15s\n", "Yaricap", "Alan");
		for (int i = 0; i < d.length; i++) {
			System.out.printf("%-30.2f%-15.2f\n", d[i].getYaricap(),d[i].alan());
		}
		System.out.println("-----------------------------------------");
		System.out.printf("%-30s%-15f\n", "Toplam daire alanları",topla(d));
	}

	

	public static void main(String[] args) {
		Daire[] dizi;
		dizi = diziOlustur();
		printDaireDizi(dizi);
	}
}

Ekran Çıktısı  :

Yaricap                       Alan           
48.75                         7463.38        
61.71                         11958.10       
85.18                         22781.82       
77.41                         18816.15       
5.57                          97.37          
-----------------------------------------
Toplam daire alanları         61116.828997