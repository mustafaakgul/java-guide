import java.util.Scanner;


public class isci {
	
	private String isim;
	private String no;
	private double maas;
	private int kidem; 
	public void setIsci(String n, String i, double w, int k) {
	        isim=n;
	        no = i;
	        maas = w;
	        kidem=k;
	}
	public void setIsim(String i){  isim=i;  }
	public void setNo(String n){ no=n; }
	public void setMaas(double d){   maas=d; }
	public void setKidem(int s){ kidem=s; }
	public String getIsim(){ return isim;  }
	public String getNo(){ return no;  }
	public double getMaas(){ return maas;  }
	public int getKidem(){ return kidem;  }
	public void printIsci() {
	        System.out.println(isim + "\tNo: " + no + "\tKıdem:"+kidem+"\tMaas:" + maas +" TL");
	}
	public void maasArtir(){
		if(kidem>=3)
			maas=maas+0.03*kidem*maas;
		System.out.println(isim+" isimli kişinin maaşı artırıldı.");
	}
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		isci  c1=new isci(); 
		isci  c2=new isci();
	    c1.setIsci("Ahmet Kıymaz", "001", 1000.00, 3);
	    c1.maasArtir();
	    c1.printIsci();
	       //getting information form user and setting object
	    c2.setIsci("Veli Duman","002", 1250.70, 7);
	    c2.printIsci();
	    
	    c2.maasArtir();
	    c2.printIsci();
	 }
	}


