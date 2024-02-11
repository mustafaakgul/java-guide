package org.example.codes.g09_arrays.multidimension;

public class S1 {
	public static void main(String[] args) {
		int[][] triangeArray = new int[4][5];
		int[] x = {1,2};
		triangeArray[0] = x;
		System.out.println(triangeArray[0][0]);
	}

}
