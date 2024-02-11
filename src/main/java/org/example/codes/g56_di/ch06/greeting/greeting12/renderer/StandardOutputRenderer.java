package org.javaturk.spring.di.ch06.greeting.greeting12.renderer;

import org.javaturk.spring.di.ch06.greeting.greeting12.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="renderer") //This is the same as @Component(value="renderer")
public class StandardOutputRenderer implements GreetingRenderer {

	private GreetingProvider greetingProvider;

	@Autowired
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
