package org.javaturk.spring.di.ch07.greeting.greeting18.provider;

import org.javaturk.spring.di.ch07.greeting.greeting18.custom.Selam;
import org.springframework.stereotype.Component;

@Component
@Selam
public class SelamGreetingProvider implements GreetingProvider{
	
	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
