package StringBuilder;
import java.util.Scanner;
public class PalindromeIgnoreNonAlphaNumeric {
	
	
	
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Bir string yazın: ");
	    String s = input.nextLine();
	 
	    System.out.println("harf ve sayı olanları dikkate alır:" + s + " palindrom mudur? " + isPalindrom(s));
	  }

	  //String palindrom ise true döndürür 
	  public static boolean isPalindrom(String s) {
	    
	    String s1 = temizle(s); // Rakam, harf boşlukların dışındakileri(,;:.) siler ve yeni string oluşturur
	  
	    String s2 = tersCevir(s1);//  s1'in tersini alır
	  
	    return s2.equals(s1);     // string ve tersi aynı ise palindromdur. 
	  }

	  //temizleyip yeni bir string olarak döndürür. 
	  public static String temizle(String s) {
	 
	    StringBuilder sb = new StringBuilder();

	    // harf ve rakam olanları boş StringBuilder’a ekleyerek yeni bir StringBuilder oluşturur
	    for (int i = 0; i < s.length(); i++) {
	      if (Character.isLetterOrDigit(s.charAt(i))) {
	        sb.append(s.charAt(i));
	      }
	    }
	    return sb.toString(); // temizlenmiş builder'ı stringe çevirip döndürür
	  }
	// Stringi ters çevirip döndüren metot 
	  public static String tersCevir(String s) {     
	    StringBuilder sb = new StringBuilder(s);
	    sb.reverse(); //  StringBuilder'ın reverse metodu kullanılıyor
	    return sb.toString();  // stringe çevrilip döndürülüyor.
	  }
	}



