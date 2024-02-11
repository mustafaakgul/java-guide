package org.javaturk.spring.di.ch05.greeting.greeting08;

public interface GreetingRenderer {
	
	public void render();

	public void setGreetingProvider(GreetingProvider provider);

}
