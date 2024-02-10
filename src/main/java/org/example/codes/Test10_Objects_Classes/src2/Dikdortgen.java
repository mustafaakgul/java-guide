package org.example.Test10_Objects_Classes.src2;

public class Dikdortgen {
	
	private int kenar1;
	private int kenar2;

public Dikdortgen(){
	
}
public Dikdortgen(int a){
	this.kenar1=a;
}
public Dikdortgen(int a,int b){
	this.kenar1=a;
	this.kenar2=b;
}
public int hesaplaalan(){
	int x =kenar1*kenar2;
	return x;
}
public int hesaplacevre(){
	int y=2*(kenar1+kenar2);
	return y;
}
public void print(){
	System.out.println("kenar1 :"+kenar1+" kenar2 :"+kenar2+"alan: "+hesaplaalan()+"cevrre: "+hesaplacevre());
}
public static void main (String[] args ){
	Dikdortgen[] dizi=new Dikdortgen[3];
	Dikdortgen d1= new Dikdortgen();
	Dikdortgen d2= new Dikdortgen(5);
	Dikdortgen d3= new Dikdortgen(3,4);
	d1.print();
	d2.print();
	d3.print();
	d2.kenar2=2;
	d2.print();
	dizi[0]=d1;
	dizi[1]=d2;
	dizi[2]=d3;
 bulToplamAlan(dizi);
	//d1.bulToplamAlan(dizi);
}


public static double bulToplamAlan(Dikdortgen[] dikdortgenNesne){
	double toplam=0;
	for(int i=0;i<dikdortgenNesne.length;i++){
		toplam=toplam+dikdortgenNesne[i].hesaplaalan();
	}
	
	return toplam;
}




}
