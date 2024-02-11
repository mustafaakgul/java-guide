


import java.util.Scanner;
public class S6iki {
 
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
    int x = hesaplaGider(s,d,f,h,j,k);
  System.out.println("Toplam harcanan miktar:"+x);
 }
     public static int hesaplaGider(int a,int b,int c, int d, int e, int f){
     
     return a+b+c+d+e+f;
     }
    
}