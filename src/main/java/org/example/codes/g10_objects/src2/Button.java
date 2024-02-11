package org.example.Test10_Objects_Classes.src2;

public class Button {
	private boolean isOnorOff;
	private String color;
	private String type;
	private int id;
	
	public Button(){
		
	}
	public Button(boolean a,String b,String c,int d){
	this.isOnorOff=a;
	this.color=b;
	this.type=c;
	this.id=d;
   }
	public boolean getisOnorOff(){
		return isOnorOff;
	}
	public String getType(){
		return type;
	}
	public String getColor(){
		return color;
	}
	public int getId(){
		return id;
	}
	public void setisOnorOff(boolean a){
		this.isOnorOff=a;
	}
	public void setColor(String a){
		this.color=a;
	}
	public void setType(String a){
		this.type=a;
	}
	public void setId(int a){
		this.id=a;
	}
	public void setButton(boolean a,String b,String c,int d){
		this.isOnorOff=a;
		this.color=b;
		this.type=c;
		this.id=d;
	}
	public void clickButton(){
		if(isOnorOff==true){
			isOnorOff=false;
		}
		else
			isOnorOff=true;
		
	}
	public void print(){
		System.out.println("Is on or off :"+isOnorOff+" Color: "+color+" Type: "+type+" Id: "+id);
	}
	public static void main(String[] args){
		Button b1=new Button();
		b1.print();
		b1.setButton(true, "yellow", "power", 50);
		b1.print();
		b1.clickButton();
		b1.print();
	}
}