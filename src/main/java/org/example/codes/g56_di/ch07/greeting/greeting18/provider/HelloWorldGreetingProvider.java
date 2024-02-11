package org.javaturk.spring.di.ch07.greeting.greeting18.provider;

import org.javaturk.spring.di.ch07.greeting.greeting18.custom.Hello;
import org.springframework.stereotype.Component;

@Component
@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
