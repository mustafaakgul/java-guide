package org.javaturk.spring.di.ch06.greeting.greeting12.renderer;

import org.javaturk.spring.di.ch06.greeting.greeting12.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {
	
	@Autowired
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
			System.err.println(greetingProvider.getGreeting());
	}
}
