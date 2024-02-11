package org.example.codes.g06_strings.String;

public class IndexOf {

	public static void main(String[] args) {
		String s= "Hoşgeldiniz";
		System.out.println(s.indexOf('H'));// 0 döndürür.
		System.out.println(s.indexOf('x'));//  -1 döndürür.
		
		String s2="Welcome to Java";
		System.out.println(s2.indexOf('o', 5));// 9 döndürür.
		System.out.println(s2.indexOf("come"));// 3 döndürür.
		System.out.println(s2.indexOf("Java", 5));// 11 döndürür.
		System.out.println(s2.indexOf("java", 5));// -1 döndürür.
		System.out.println(s2.lastIndexOf('a'));// 14 döndürür.

	}

}
