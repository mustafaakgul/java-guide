
import java.util.Scanner;
public class S3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kac tane sayi girmek istersiniz:");
		int     n  =input.nextInt();
	    double [] dizi = new double[n];
	    double toplam=0;
	    System.out.println("sayilari giriniz");
	    for(int i = 0;i<n;i++){
	    	dizi[i] = input.nextDouble();
	    	toplam = toplam+dizi[i];
	    }
	    double ortalama=toplam/n;
	    System.out.println(ortalama);
    	  
    	
    	  
      }
	
}
