package org.javaturk.spring.di.ch02.greeting05;

/**
 * Topic: Factory class.
 *  
 * Greeting providers and renderers are provided through a factory. 
 * 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class Application {

	public static void main(String[] args) {
		Factory factory = GreetingFactory.getInstance();

		GreetingRenderer renderer = factory.getGreetingRenderer();
		GreetingProvider provider = factory.getGreetingProvider();
		renderer.setGreetingProvider(provider);
		renderer.render();
	}
}
