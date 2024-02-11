package org.javaturk.spring.di.ch05.greeting.greeting08;

public class HelloWorldGreetingProvider implements GreetingProvider {
	
	public HelloWorldGreetingProvider() {
		System.err.println("==> in HelloWorldGreetingProvider()");
	}

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
