package org.javaturk.spring.di.ch06.greeting.greeting12.provider;

import org.springframework.stereotype.Component;

@Component("greetingProvider")
public interface GreetingProvider {
	
	public String getGreeting();
}
