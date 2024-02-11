package org.javaturk.spring.di.ch06.greeting.greeting13.renderer;

import org.javaturk.spring.di.ch06.greeting.greeting13.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider;
	
	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
	
//	@Autowired
	public void setHelloWorldGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
