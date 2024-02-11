package org.javaturk.spring.di.ch05.greeting.greeting08;

public class SelamGreetingProvider implements GreetingProvider{
	
	public SelamGreetingProvider() {
		System.err.println("==> in SelamGreetingProvider()");
	}
	
	public String getGreeting() {
		return "Selam :)";
	}
}
