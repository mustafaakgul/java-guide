package org.javaturk.spring.di.ch05.greeting.greeting10;

public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
