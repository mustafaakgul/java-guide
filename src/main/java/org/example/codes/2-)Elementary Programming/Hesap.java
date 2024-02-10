package org.example.codes;

public class Hesap{
    private double miktar;
    private String no;
    public Hesap( ){
        miktar = 0.0;
        no="";
    }
    public Hesap( String a, double ilkMiktar ){
        setHesap(a,ilkMiktar);
    }
    public void setHesap( String n, double ilk ){
        no=n;
        if ( ilk >= 0.0 )
            miktar = ilk;
    }
    public double getMiktar( ){
        return miktar;
    }
    public String getNo( ){
        return no;
    }
    public void paraYatir( double para ) {
        if(para>0)
            miktar = miktar + para;
        System.out.println(para+" kadar para yatırılıdı. Bakiyeniz :"+miktar);
    }
    public void paraCek( double para ) {
        if(para>0){
            if(para<=miktar){
                miktar = miktar - para;
                System.out.println(para+ " kadar çekildi. Bakiye "+miktar);
            }
            else
                System.out.println("Yetersiz bakiye. Max çekebileceğiniz miktar "+miktar);
        }
    }
    public void printHesap(){
        System.out.printf("Hesap numarası: %s \n Bakiye %.2f TL \n\n", no, miktar);

    }
    public static void main(String args[]){

        Hesap c1= new Hesap();
        System.out.println("c1 e ait işlemler");
        c1.printHesap();
        c1.setHesap("0001", 93000);
        c1.paraCek(1500);
        c1.paraYatir(500);
        c1.printHesap();
        Hesap c2= new Hesap();
        System.out.println("c2 e ait işlemler");

        c2.setHesap ("002", 0);
        c2.paraYatir(500);
        c2.paraCek(1000);
        c2.paraYatir(1200);
        c2.printHesap();
    }
}
