

import java.util.Scanner;
public class S7 {
public static int tekTopla(int n){
	if(n%2==0)
		n=n-1;
	if(n==1)
		return 1;
	else
		return n+tekTopla(n-2);
}

public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("sayi:");
	int x=input.nextInt();
	System.out.println(tekTopla(x));
}
}
