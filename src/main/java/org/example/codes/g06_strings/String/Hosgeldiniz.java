package org.example.codes.g06_strings.String;

public class Hosgeldiniz {
	  public static void main(String[] args) {
		String s1 = "Java’ya hoşgeldiniz";

		String s2 = new String("Java’ya hoşgeldiniz "); 

		String s3 = "Java’ya hoşgeldiniz";  // daha önce oluşturulduğu için aynı referans verilir.

		System.out.println("s1 == s2 : " + (s1 == s2));  // false
		System.out.println("s1 == s3 : " + (s1 == s3));  // true      referansları aynıdır.

		}
	}
