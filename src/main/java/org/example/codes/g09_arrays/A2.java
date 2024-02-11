package org.example.codes.g09_arrays;

public class A2 {
	public static void main(String[] args) {
		int number = 0;
		int[] numbers= new int [1];
		m(number,numbers);
		System.out.println(number+""+numbers[0]);

		int[] list = {1,2,3,4,5};
		reverse(list);
		for (int i = 0;i<list.length;i++)
			System.out.println(list[i]);
	}
	public static void reverse(int[ list]) {
		int[] newList = new int[list.length];
		for (int i = 0;i<list.length;i++)
			newList[i] = list[list.length -1 - i];
		list = newList;
	}
	public static void m(int x, int[]y){
		x=3;
		y[0]=3;
	}




}
