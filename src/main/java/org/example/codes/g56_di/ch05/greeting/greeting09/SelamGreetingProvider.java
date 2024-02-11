package org.javaturk.spring.di.ch05.greeting.greeting09;

public class SelamGreetingProvider implements GreetingProvider{
	private String greeting;

	@Override
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
