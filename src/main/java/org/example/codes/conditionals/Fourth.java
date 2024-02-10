package org.example.codes.conditionals;
import java.util.Scanner;

//hex2dec
public class Fourth {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a hex number");
		String hex=input.nextLine();
		System.out.println("The decimal value for hex"+hex+" is "+hex2dec(hex));
	}
	public static int hex2dec(String hex){
		int decimalvalue=0;
		for (int i = 0; i < hex.length(); i++) {
			char hexchar=hex.charAt(i);
			decimalvalue=decimalvalue*16+hexchartodecimal(hexchar);
		}
		return decimalvalue;
	}
	public static int hexchartodecimal(char ch){
		if(ch>='A'&&ch<='F')
			return 10+ch-'A';
		else
			return ch-'0';
	}

}
