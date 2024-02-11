package org.javaturk.spring.di.ch06.greeting.greeting14.provider;

import org.javaturk.spring.di.ch06.greeting.greeting14.custom.Hello;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("hello")
@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
}
