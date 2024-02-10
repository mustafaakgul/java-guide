package org.example.Test09_Arrays;

public class S3 {
	public static void main(String[] args) {
		matrisDoldur(matrisOlustur2());
		
	}
	public static void matrisDoldur(int[][] a){
		Random r = new Random();
		for(int i =0;i<4;i++){
			for(int j =0;j<4;j++){
				a[i][j] = r.nextInt(10);
				System.out.print(a[i][j]);
			}
			System.out.println();
	}
}
	public static int[][] matrisOlustur2(){
		int[][]m = new int [4][4];
		 return m;
				}
}
