package org.example.codes.g54_recursive;

public class E10 {
	public static void main(String[] args) {
		
		System.out.println(sum(6));
	}
	public static int sum(int n){
		
		if(n<10)
			return (n+sum(n+1));
		else
			return 2;
	}

}
