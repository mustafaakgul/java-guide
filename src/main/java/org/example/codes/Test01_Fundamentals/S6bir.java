

import java.util.Scanner;
public class S6bir {
   
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
