package org.javaturk.spring.di.ch06.greeting.greeting11;

public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
