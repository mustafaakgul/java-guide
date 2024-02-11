package org.javaturk.spring.di.ch06.greeting.greeting12.provider;

import org.springframework.stereotype.Component;

//@Component
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
