package org.example.codes.g09_arrays.multidimension;

import java.util.Scanner;


public class karematris {
	public static void main(String[] args) {
		int[][] karematris = new int[2][2];
		matrisDoldur2(karematris);
	}
	public static void matrisDoldur2(int[][] dizi){
		Scanner input = new Scanner (System.in);
		for(int i =0;i<dizi.length;i++){
			for(int j =0;j<dizi[0].length;j++){
				System.out.println("girin");
				dizi[i][j] = input.nextInt();
			}
	}
		for(int i =0;i<2;i++){
			for(int j =0;j<2;j++){
}
System.out.println();
}
	}
}