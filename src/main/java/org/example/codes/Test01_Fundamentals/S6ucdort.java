


import java.util.Scanner;
public class S6ucdort {
 
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
  
  System.out.println("En buyuk eleman:" + enBuyuk);
  System.out.println("En kucuk eleman:" + enKucuk);
 }
  
     public static int bulEnBuyuk(int dizi[i])
     {
  int enBuyuk=dizi[0];
  for(int i=1; i < dizi.length;i++){
      if(dizi[i]> enBuyuk )
          enBuyuk=dizi[i];
      return enBuyuk;
  }
  
     
  
     }
  
     public static int bulEnKucuk(int dizi[i])
     {
  int enKucuk=dizi[0];
  for(int i=1; i < dizi.length;i++){
      if(dizi[i]< enKucuk )
          enKucuk=dizi[i];
      return enKucuk;
  }
  
     }
  
 }