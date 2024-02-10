package String;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      int i,uz;
		System.out.print("Bir karakter dizisi girin: ");
		String s = input.nextLine();
		uz=s.length();
		for(i=0;i<uz;i++) {
			if (s.charAt(i) != s.charAt(uz-1-i)){
			   System.out.println("  palindrom değil");
			   break;
			}
	}
		if(i==uz)
			System.out.println("  palindrom ");
	}


}
