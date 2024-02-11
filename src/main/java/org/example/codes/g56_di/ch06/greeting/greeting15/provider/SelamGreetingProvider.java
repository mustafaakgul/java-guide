package org.javaturk.spring.di.ch06.greeting.greeting15.provider;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.javaturk.spring.di.ch06.greeting.greeting15.custom.*;

@Component
//@Selam
//@Primary
//@Qualifier("selam")
public class SelamGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
}
