package org.javaturk.spring.di.ch02.greeting05;

public interface GreetingRenderer {
	
	public void render();

	public void setGreetingProvider(GreetingProvider provider);

}
