package org.javaturk.spring.di.ch02.greeting05;

public interface Factory {
	
	public GreetingRenderer getGreetingRenderer();

	public GreetingProvider getGreetingProvider();

}
