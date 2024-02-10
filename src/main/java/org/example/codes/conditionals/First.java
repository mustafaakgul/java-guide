package org.example.codes.conditionals;

public class First {
	public static int max(int a,int b){
		int result;
		if(a<b){
			result= b;
		}
		else
			result= a;
		return result;
	}
	public static void main(String[] args) {
		int i=5;
		int j=3;
		int k=max(i,j);
		System.out.println(k);
	}

}
