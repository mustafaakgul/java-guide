package org.example.codes.g54_recursive;

import java.util.Scanner;
public class E2 {
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
