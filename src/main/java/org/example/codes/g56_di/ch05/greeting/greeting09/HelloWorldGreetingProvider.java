package org.javaturk.spring.di.ch05.greeting.greeting09;

public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
