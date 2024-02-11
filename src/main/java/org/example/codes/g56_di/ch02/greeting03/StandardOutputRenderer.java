package org.javaturk.spring.di.ch02.greeting03;

public class StandardOutputRenderer {
	private HelloWorldGreetingProvider greetinngProvider = null;

	public void setGreetingProvider(HelloWorldGreetingProvider provider) {
		this.greetinngProvider = provider;
	}

	// Rendering logic can change without affecting the rest of the application
	public void render() {
		String greeting = greetinngProvider.getGreeting();
		System.out.println(greeting);
	}
}
