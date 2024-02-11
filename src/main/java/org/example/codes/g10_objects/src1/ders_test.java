package org.example.Test10_Objects_Classes.src1;


public class ders_test {
	public static void main(String [] args){
		ogretmen o1=new ogretmen("Ahmet","Durak","123");
		ogretmen o2=new ogretmen("Mehmet","Durur","124");
		o1.printogretmen();
		o2.printogretmen();
		derskitap a=new derskitap("denizde"+"ahmet kara"+"deniz yayinlari");
		ders b=new ders("mat"+o1.getisim()+" kitap ad"+a.getkitapad());
		a.print();
		b.printders();
	}

}
