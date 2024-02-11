import java.util.Scanner;


public class E4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayi girin:");
		int x =input.nextInt();
		
		System.out.println("Sonuc ="+factor(x));
	}
	public static int factor(int n) {
		
		if(n==0)
			return 1;
			else 
				return n*factor(n-1);
	}
}
