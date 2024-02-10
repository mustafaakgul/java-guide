import java.util.Scanner;


public class E12 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("sayiyi giriniz:");
		int    x   =input.nextInt();
		System.out.println(fib(x));

}
	public static int fib(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else 
			return fib(n-1)+fib(n-2);
		
	}
}
