package org.example.Test10_Objects_Classes.src1;

public class tv {
	private String �retimyeri;
	private String �retimtarihi;
	private Monitor monitor;
	
	public tv(){
		monitor=new Monitor();
	}
	
	public tv(String �retimyeri,String �retimtarihi,boolean renk,int size){
		this.�retimyeri=�retimyeri;
		this.�retimtarihi=�retimtarihi;
		monitor=new Monitor();
		monitor.setrenkli(renk);
		monitor.setsize(size);
	}
	public void printtv(){
		System.out.println("Tarihiniz: "+�retimtarihi+" \nYeriniz: "+�retimyeri+" \nRenginiz: "+monitor.getrenkli()+" \nBoyutunuz: "+monitor.getsize());
	}
	public static void main(String[] args){
		tv k = new tv("adres","123243",true,45);
		tv b = new tv();
		k.printtv();
		b.printtv();
		
	}

}
