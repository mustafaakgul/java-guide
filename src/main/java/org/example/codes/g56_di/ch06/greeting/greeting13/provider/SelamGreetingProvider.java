package org.javaturk.spring.di.ch06.greeting.greeting13.provider;

import org.springframework.stereotype.Component;

@Component
public class SelamGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
