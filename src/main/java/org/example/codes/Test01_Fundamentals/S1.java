

import java.util.Scanner;
public class S1 {
    
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int x,y;
  System.out.println("Bir sayi giriniz");
  x = input.nextInt();
  
  y = x*(x+1)*(2*x+1)/6;
  System.out.println("Program cevabiniz ="+y);
 }
            
     }
