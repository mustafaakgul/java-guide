package org.javaturk.spring.di.ch05.greeting.greeting09;

public class ErrorOutputRenderer implements GreetingRenderer {
	
	private GreetingProvider greetingProvider = null;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}

	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}
}
