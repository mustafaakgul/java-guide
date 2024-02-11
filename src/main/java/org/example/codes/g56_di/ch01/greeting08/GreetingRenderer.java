package org.javaturk.spring.di.ch01.greeting08;

public interface GreetingRenderer {
	
	public void render();

	public void setGreetingProvider(GreetingProvider provider);

}
