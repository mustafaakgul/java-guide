package org.example.codes.g01_fundamentals;

/*
include<stdio.h>
int main()
\n
scanf
printf
getchar
Systempause

import java.util.Scanner;
public class      {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
int       =input.nextInt();
System.out.println();
int[][] m = new int[2][5];

p3=p1.topla(p2)
sonuc.a=this.a+p.a
sonuc.b=this.a+p.b
sonuc.c=this.a+p.c
return sonuc
p3=p1.topla(p2)
p3.topla(p1,p2)
p3=p3.topla(p1,p2)
p1.topla(p2)

%.2f
%02d
\n
%s
%f
while icnde ypmk
if in icnde fonk blrleme
main icnde scnner tnmlamamasi

\n
\t
\b
\\
\'
\"
public protected private
object import
random
switch case
print println printf final System.exit parse method
byte short int long float double boolean char
 */
public class Mix1 {
}
/*
static int fib(int n){
    if((n ==1)||(n==0){
        return n;
    }
    return fib(n-1)+fin(n-2):
}


public class S1 {
    public static void main(String[] args) {
        kareCiz();
    }
    public static void kareCiz(){
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++){
                if(i==0||i==3)
                    System.out.print("*");
                else if (j==0||j==3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}

package lab2;

        import java.util.Scanner;
public class S2 {
    public static void main(String[] args) {

        int a;
        char b;
        Scanner input  = new Scanner(System.in);
        System.out.println("lutfen isaret ");
        b = input.nextLine().charAt(0);
        System.out.println("sayi girin");
        a = input.nextInt();
        kareCiz(b,a);
    }
    public static void kareCiz(char isaret,int kenaruzunluk){

        int n=kenaruzunluk;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(i==0||i==(n-1))
                    System.out.print("*");
                else if (j==0||j==(n-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

package lab2;

public class S3 {
        import java.util.Scanner;
    public static void main(String[] args) {
        bulOrtalama();
    }
    public static void bulOrtalama(){
        Scanner input  = new Scanner(System.in);
        int x = input.nextInt();
        for(int i=1;i<x;i++){

            System.out.println(i".sayiyi giriniz");

        }

    }

}

package lab2;

        import java.util.Scanner;
public class S4 {
    public static void main(String[] args) {
        int a,b;
        Scanner input  = new Scanner(System.in);
        System.out.println("hngi sayinn kuvveti ");
        a = input.nextInt();
        System.out.println("kacnci kuvvet");
        b = input.nextInt();
        hesapla(a,b);
    }
    public static void hesapla(int a,int b){

        int  carpim=1;
        for(int i=0;i<b;i++){
            carpim=carpim*a;
        }

        System.out.print("Sonuc:"+a+"^"+b+"="+carpim);
    }
}



1-)

        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("Bir sayi giriniz");
        x = input.nextInt();

        y = x*(x+1)*(2*x+1)/6;
        System.out.println("Program cevabiniz ="+y);
    }

}



2-)


        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int s,d,f,h,j,k;
        System.out.println("Lütfen harcadiginiz giderleri giriniz");

        System.out.println("Cumartesi ");
        System.out.print("Otobus gideri:");
        s = input.nextInt();
        System.out.print("Kirtasiye gideri:");
        d = input.nextInt();
        System.out.print("Yemek:");
        f = input.nextInt();
        System.out.println("Pazar");
        System.out.print("Otobus gideri:");
        h = input.nextInt();
        System.out.print("Kirtasiye gideri:");
        j = input.nextInt();
        System.out.print("Yemek:");
        k = input.nextInt();
        System.out.println("Toplam harcanan miktar:"+(s+d+f+h+j+k));
    }
}

3-)


        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] dizi = new int[4];

        System.out.println("Lütfen dizinin elemanlarini giriniz.");
        System.out.print("1. eleman:");
        dizi[0]=input.nextInt();
        System.out.print("2. eleman:");
        dizi[1]=input.nextInt();
        System.out.print("3. eleman:");
        dizi[2]=input.nextInt();
        System.out.print("4. eleman:");
        dizi[3]=input.nextInt();

        int enBuyuk=dizi[0];
        for(int i=1; i < dizi.length;i++){
            if(dizi[i]> enBuyuk )
                enBuyuk=dizi[i];
        }
        System.out.println("En buyuk eleman:" + enBuyuk);

        int enKucuk=dizi[0];
        for(int i=1; i < dizi.length;i++){
            if(dizi[i]< enKucuk )
                enKucuk=dizi[i];
        }
        System.out.println("En kucuk eleman:" + enKucuk);


    }
}





4.1-)


        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        String[] aylar ={"ocak","subat","mart","nisan","mayis","haziran","temmuz","agustos","eylul","ekim","kasim","aralik"};
        int[] gunler= {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Ay         Kaç gün");
        System.out.println(aylar[0]+"         "+ gunler[0]);
        System.out.println(aylar[1]+"         "+ gunler[1]);
        System.out.println(aylar[2]+"         "+ gunler[2]);
        System.out.println(aylar[3]+"         "+ gunler[3]);
        System.out.println(aylar[4]+"         "+ gunler[4]);
        System.out.println(aylar[5]+"         "+ gunler[5]);
        System.out.println(aylar[6]+"         "+ gunler[6]);
        System.out.println(aylar[7]+"         "+ gunler[7]);
        System.out.println(aylar[8]+"         "+ gunler[8]);
        System.out.println(aylar[9]+"         "+ gunler[9]);
        System.out.println(aylar[10]+"         "+ gunler[10]);
        System.out.println(aylar[11]+"         "+ gunler[11]);


    }
}


4.2-)


        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        String[] aylar ={"ocak","subat","mart","nisan","mayis","haziran","temmuz","agustos","eylul","ekim","kasim","aralik"};
        int[] gunler= {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Ay         Kaç gün");
        for(int i=0 ; i<12;i++)
            System.out.println(aylar[i]+"         "+ gunler[i]);


    }
}



5-)


public class Program {
    public static void main(String args[]){
        int altcizgi, i, j;
        System.out.println("         1    2    3    4    5    6    7    8    9   10 ");
        //döngüyle uzunca bir çizgi çizelim
        for(altcizgi=1; altcizgi<=100; altcizgi++){
            System.out.print("_");
        }
        System.out.println();

        for (i =1; i<=10; i++) {
            System.out.print(i+"  |    ");

            for (j=1 ; j<=10 ; j ++) {
                System.out.print(i*j +"    ");
            }
            System.out.println();
        }
    }
}


6.1-)


        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Bir sayi giriniz");
        x = input.nextInt();
        hesaplaToplam(x);
    }

    public static void hesaplaToplam(int n)
    {
        int  a = n*(n+1)*(2*n+1)/6;
        System.out.println("Program cevabiniz ="+a);
    }

}


6.3,4-)



        import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] dizi = new int[4];

        System.out.println("Lütfen dizinin elemanlarini giriniz.");
        System.out.print("1. eleman:");
        dizi[0]=input.nextInt();
        System.out.print("2. eleman:");
        dizi[1]=input.nextInt();
        System.out.print("3. eleman:");
        dizi[2]=input.nextInt();
        System.out.print("4. eleman:");
        dizi[3]=input.nextInt();

        bulEnBuyuk(y);
        bulEnKucuk(z);

    }

    public static void bulEnBuyuk(dizi[i])
    {
        int enBuyuk=dizi[0];
        for(int i=1; i < dizi.length;i++){
            if(dizi[i]> enBuyuk )
                enBuyuk=dizi[i];
        }


        System.out.println("En buyuk eleman:" + enBuyuk);
    }

    public static void bulEnKucuk(dizi[i])
    {
        int enKucuk=dizi[0];
        for(int i=1; i < dizi.length;i++){
            if(dizi[i]< enKucuk )
                enKucuk=dizi[i];
        }
        System.out.println("En kucuk eleman:" + enKucuk);
    }

}
}


public class welcome {
    public static void main (String[] args) {
        System.out.println("welcome to java");
    }

}


import java.util.Scanner;


public class S6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = new int [10];
        System.out.println("elemanlari girin:");
        for(int i=0;i<dizi.length;i++){
            dizi[i] = input.nextInt();
        }
        System.out.println(dizi[4]);
    }
}
*/