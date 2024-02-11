package org.javaturk.spring.di.ch07.greeting.greeting17.provider;

import org.javaturk.spring.di.ch07.greeting.greeting17.custom.Hello;
import org.springframework.stereotype.Component;

@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
