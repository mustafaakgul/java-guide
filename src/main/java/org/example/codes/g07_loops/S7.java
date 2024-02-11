
import java.util.Scanner;
public class S7 {

public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Lütfen üc sayi giriniz");
	int    x   =input.nextInt();
	int    y   =input.nextInt();
	int    z   =input.nextInt();
	System.out.println("En kucuk sayi"+bulMin(x,y,z));
}
      public static int bulMin(int a ,int b,int c) {
    	  
    	  if (a<b&&a<c)
    		   return a;
    	  else if(b<c&&b<a)
    		  return b;
    	  else
    		  return c;
    	  
      }

}
