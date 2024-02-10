package Character;
import java.util.Scanner;
public class Calculator {
	
	//Hesap Makinesi

	
	
		public static void main(String[] args) {
			   Scanner s=new Scanner(System.in);
			   int sonuc = 0;
	   System.out.print("İşlemi giriniz:");
	                String x= s.nextLine();
			    
			    String[] karDizi = x.split(" ");

			    switch (karDizi[1].charAt(0)) {
			      case '+': sonuc = Integer.parseInt(karDizi[0]) + Integer.parseInt(karDizi[2]);
			                break;
			      case '-': sonuc = Integer.parseInt(karDizi[0]) - Integer.parseInt(karDizi[2]);
			                break;
			      case '*': sonuc = Integer.parseInt(karDizi[0]) * Integer.parseInt(karDizi[2]);
			                break;
			      case '/': sonuc = Integer.parseInt(karDizi[0]) / Integer.parseInt(karDizi[2]);
			    }
			    
		      System.out.println(karDizi[0] + ' ' + karDizi[1] + ' '+ karDizi[2] + " = " + sonuc);
		}
	}



