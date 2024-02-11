package org.javaturk.spring.di.ch06.greeting.greeting11;

public class SelamGreetingProvider implements GreetingProvider{
	private String greeting;

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
