package org.example.codes.g54_recursive;

public class E17 {
	public static void main(String[] args) {
		for(int i=0;i<=7;i++){
			ucgen(i);
		System.out.println();
		}
	}
	public static void ucgen(int n) {
	if(n!=8){
		System.out.print(n);
		ucgen(n+1);
		}
	else
		System.out.print(0);
	}    /*azarlta ve arttırayla foru degıstırılebılır*/

}
