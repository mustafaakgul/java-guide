package org.javaturk.spring.di.ch07.greeting.greeting19.provider;

import org.javaturk.spring.di.ch07.greeting.greeting19.custom.Hello;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hello")
//@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
