package org.example.Test10_Objects_Classes.src1;

public class ogretmen {
	
	private String isim;
	private String soyisim;
	private String ofisNo;
	
	public ogretmen(){
		
	}
	public ogretmen(String a){
		this.isim=a;
	}
	public ogretmen(String a,String b){
		this.isim=a;
		this.soyisim=b;
	}
	public ogretmen(String a,String b,String c){
		this.isim=a;
		this.soyisim=b;
		this.ofisNo=c;
	}
	public void setogretmen(String a,String b,String c){
		this.isim=a;
		this.soyisim=b;
		this.ofisNo=c;
	}
	public void setisim(String a){
		this.isim=a;
				
	}
	public void setsoyisim(String b){		
		this.soyisim=b;		
	}
	public void setofisNo(String c){
		this.ofisNo=c;
	}
	public String getisim(){
		return isim;
	}
	public String getsoyisim(){
		return soyisim;
	}
	public String getofisNo(){
		return ofisNo;
	}
	public void printogretmen(){
		System.out.println("Isminiz: "+isim+"\nSoyisminiz: "+soyisim+"\nOfis No: "+ofisNo);
	}
	public static void main(String[] args){
		ogretmen o3=new ogretmen("Ahmet","Durak","123");
		ogretmen o4=new ogretmen("Mehmet","Durur","124");
		o3.printogretmen();
		o4.printogretmen();
	}

}
