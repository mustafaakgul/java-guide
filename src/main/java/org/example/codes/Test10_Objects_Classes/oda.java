package org.example.Test10_Objects_Classes;

public class oda {
	private int odaNo;
	private String odaTip;
	private int odaAlan;

	public oda(){
		
	}
	public oda(int odaNo){
		this.odaNo=odaNo;
	}
	public oda(int odaNo,int odaTip){
		this.odaNo=odaNo;
		this.odaTip=odaTip;
	}
	public oda(int odaNo,String odaTip,int odaAlan){
		this.odaNo=odaNo;
		this.odaTip=odaTip;
		this.odaAlan=odaAlan;
	}
	public void setodaNo(int x){
		odaNo=x;
	}
	public void setgun(String x){
		odaTip=x;
	}
	public void setgun(int x){
		odaAlan=x;
	}
	public int getodaNo(){
		return odaNo;
	}
	public String getodaTip(){
		return odaTip;
	}
	public int getodaAlan(){
		return odaAlan;
	}
	public void printoda()	{
		System.out.println("odaNo"+odaNo+"odaTip"+odaTip+"odaalan"+odaAlan);
	}
	public static void main(String[] args){
		oda a = new oda( 1, "faf", 3);
		a.printoda();
	}
}
