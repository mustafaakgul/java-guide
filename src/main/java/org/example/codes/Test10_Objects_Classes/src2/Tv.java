package org.example.Test10_Objects_Classes.src2;

public class Tv {
	private String brand;
	private Button[] Buttons;
	
	public String getbrand(){
		return brand;
	}
	public Button[] getButtons(){
		return Buttons;
	}
	public void setBrand(String a){
		this.brand=a;
	}
	public void setButtons(Button[] a){
		int[] m={1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		a[i].setId(m[i]);
	}
	public void actv(){
		
	}
	public void kapatv(){
		
	}
	public void printtv(){
		//System.out.println("Brand: "+brand+"Buttons: "+Button.print(););
	}
	
	
	public static void main(String[] args){
		Tv t=new Tv();
		Button b2= new Button();
	}
}	