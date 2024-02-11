package org.javaturk.spring.di.ch07.greeting.greeting19.provider;

import org.javaturk.spring.di.ch07.greeting.greeting19.custom.Selam;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Selam
@Qualifier("selam")
public class SelamGreetingProvider implements GreetingProvider{
	
	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
