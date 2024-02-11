import java.util.Scanner;


public class Second {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bir string girin");
		String a = input.nextLine();
		String b=a.toLowerCase();
		String c=a.toUpperCase();
	System.out.println(b);
	System.out.println(c);
}
}
