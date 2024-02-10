package Character;
import java.util.Scanner;
public class CharCounter {
	
	//Program: Kullanıcıdan okunan bir stringin içinde geçen harfleri sayan program
	
	
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir string girin: ");
		String s = input.nextLine();

		int[] say = sayHarf(s.toLowerCase());   // sayHarf() metodunun çağırılması
		    // Gelen Sonuçlar
		for (int i = 0; i < say.length; i++) {
		   if (say[i] != 0)
		     System.out.println((char)('a'+i)+" karakteri "+say[i]+" kere görülür");
		    }
	}
	 public static int[] sayHarf(String s) {
		    int[] sayaclar = new int[30];

		    for (int i = 0; i < s.length(); i++) {
		      if (Character.isLetter(s.charAt(i)))
		        sayaclar[s.charAt(i) - 'a']++;
		    }
		    return sayaclar;
		  }	
	 }




