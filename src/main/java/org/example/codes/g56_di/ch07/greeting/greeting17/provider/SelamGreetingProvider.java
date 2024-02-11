package org.javaturk.spring.di.ch07.greeting.greeting17.provider;

import org.javaturk.spring.di.ch07.greeting.greeting17.custom.Selam;
import org.springframework.stereotype.Component;

@Selam
public class SelamGreetingProvider implements GreetingProvider{
	
	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
