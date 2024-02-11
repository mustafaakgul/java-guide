package org.example.codes.g09_arrays.multidimension;

public class toplam {
	public static void main(String[] args) {
}
	int [][] a = {{1,2,3},{4,5,6}};
	int [][] b = {{1,2,3},{4,5,6}};
	int [][] c = {{0,0,0},{0,0,0}};
	
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			c[i][j] =a[i][j]+b[i][j];
		}
		}
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.println(c[i][j]);
		}
		}
}
}