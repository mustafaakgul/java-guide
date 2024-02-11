package org.example.Test02_Object;

class insan{
    int boy;
}
class ogrenci extends insan implements Cloneable{
    Object kopyala() throws CloneNotSupportedException{
        //kendimden 1 tane dondurdum ramde farkli olan bir kopyayi dndrcek
        //clone butun ozellkleri kendi kendi atar
        return this.clone();
    }
    ogrenci kopyala2(){
        //different kind of deep copy
        ogrenci temp = new ogrenci();
        temp.boy = this.boy;
        return temp;
    }
    //kendi anladigimiz equal kodumuzu yaziyoruz override ediyoruz
    boolean equals(ogrenci rhs){
        //right hand side
        //if(this.boy == rhs.boy)
         //   return true;
        return this.boy==rhs.boy;

        //tek ozellk var bnn yerine bir suru ozellk olablir bnlari karsilastr dyebiliriz
    }
    //to string kendmize ait bir seklde yazilablir veya kendi tostring kodumuzu kllanabliriz
    public String toString(){
        return "obje boyu"+this.boy;
    }
}
public class class_Object {
    public static void main(String args[]) throws CloneNotSupportedException{
        insan ali = new insan();
        insan ahmet = new insan();
        ahmet = ali;     //shallow copy sıg kopyalama
        ali.boy = 180;
        System.out.println(ali.boy);
        System.out.println(ahmet.boy);

        if(ali == ahmet){
            System.out.println("esitler");
        }
        if(ali.equals(ahmet)){
            System.out.println("esitler2");
        }
        ogrenci ayse = new ogrenci();
        ayse.boy = 160;
        //deep copy derin kopyalama ram de bir kopyasinin ckmasi
        ogrenci fatma = (ogrenci)ayse.kopyala();
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy=180;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        //3 ve 4 esit degl cnku kopyalari olustu kendileri ayni degil
        if(ayse == fatma){
            System.out.println("esitler3");
        }
        if(ayse.equals(fatma)){
            System.out.println("esitler4");
        }
        fatma.boy=160;
        if(ayse.equals(fatma)){
            System.out.println("esitler5");
        }
        System.out.println(ayse);
        System.out.println(ayse.hashCode());
    }

}
