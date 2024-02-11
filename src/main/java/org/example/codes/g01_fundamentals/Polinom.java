package org.example.codes.g01_fundamentals;

import java.util.Scanner;
public class Polinom {
    private double a;
    private double b;
    private double c;
    public Polinom(){

    }
    public Polinom(double x, double y, double z){
        a=x;
        b=y;
        c=z;
    }
    public void setPolinom(double x, double y, double z){
        a=x;
        b=y;
        c=z;
    }
    public void setA(double x){
        a=x;
    }
    public void setB(double x){
        b=x;
    }
    public void setC(double x){
        c=x;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public void yazPolinom(){
        if(a!=0){
            if(a!=1 && a!=-1)
                System.out.print(a);
            if(a==-1)
                System.out.print("-");
            System.out.print("x^2");
        }
        if(b!=0){
            if(b>0)
                System.out.print("+");
            if(b!=1 && b!=-1)
                System.out.print(b);
            if(b==-1)
                System.out.print("-");
            System.out.print("x");
        }
        if(c!=0){
            if(c>0)
                System.out.print("+");
            System.out.print(c);
        }
        System.out.println();

    }
    public boolean esitMi(Polinom w){
        if(a==w.a && b==w.b && c==w.c)
            return true;
        else
            return false;
    }
    public void kokBul(){
        double delta;
        delta=b*b-4*a*c;
        double x1,x2;
        if(delta<0)
            System.out.println("reel kok yoktur.");
        else{
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("x1="+x1+"\nx2="+x2);
        }

    }
    public static void main(String[] args) {
        double k1,k2,k3;
        Scanner s=new Scanner(System.in);
        System.out.println("Birinci polinom :");
        System.out.print("Katsayı 1 :");
        k1=s.nextDouble();
        System.out.print("Katsayı 2 :");
        k2=s.nextDouble();
        System.out.print("Katsayı 3 :");
        k3=s.nextDouble();
        Polinom p=new Polinom(k1,k2,k3);
        System.out.println("İkinci polinom :");
        System.out.print("Katsayı 1 :");
        k1=s.nextDouble();
        System.out.print("Katsayı 2 :");
        k2=s.nextDouble();
        System.out.print("Katsayı 3 :");
        k3=s.nextDouble();
        Polinom p1=new Polinom(k1,k2,k3);
        p.yazPolinom();
        p1.yazPolinom();
        if(p.esitMi(p1)){
            System.out.println("p Eşit p1");
        }
        else
            System.out.println("Eşit değil");
        p.kokBul();

    }

}


