package org.javaturk.spring.di.ch08.greeting.greeting20.provider;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.javaturk.spring.di.ch08.greeting.greeting20.custom.Hello;
import org.springframework.stereotype.Component;

@Component
@Hello
public class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in HelloWorldGreetingProvider init()");
	}
	
	@PreDestroy
	public void destroy() {
		System.err.println("in HelloWorldGreetingProvider destroy()");
	}
}
