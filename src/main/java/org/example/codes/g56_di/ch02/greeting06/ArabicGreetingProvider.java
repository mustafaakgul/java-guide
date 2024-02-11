package org.javaturk.spring.di.ch02.greeting06;

public class ArabicGreetingProvider implements GreetingProvider{

	@Override
	public String getGreeting() {
		return "as Salamu Alaikum";
	}
}
