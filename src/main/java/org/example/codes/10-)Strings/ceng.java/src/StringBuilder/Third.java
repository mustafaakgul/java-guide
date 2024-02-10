package StringBuilder;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.print("Bir string yazın: ");
        String st = t.nextLine();
        StringBuilder s=new StringBuilder(st); // Girilen string StringBuilder nesnesi yapılıyor
        StringBuilder x=new StringBuilder(s.toString()); // İkinci bir StringBuilder nesnesi oluşturuluyor
        s.reverse(); // s nesnesi kendi içinde ters çeviriliyor. 
        
        if(s.toString().equals(x.toString())) // s ve x nesnesinin içerikleri aynı ise palindromdur 
        	System.out.println("palindrom");
        else
        	System.out.println("palindrom değil");
 	}


}
