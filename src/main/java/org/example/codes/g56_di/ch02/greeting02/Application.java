package org.javaturk.spring.di.ch02.greeting02;

public class Application {

	public static void main(String[] args) {
		// If an argument is provided, use it, otherwise, display “Selam”
		if (args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello world :)");
		}
	}
}
