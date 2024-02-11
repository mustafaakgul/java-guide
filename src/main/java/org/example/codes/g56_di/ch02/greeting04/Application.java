package org.javaturk.spring.di.ch02.greeting04;

/**
 * Topic: Dependency inversion (DI) through interfaces.
 * 
 * Message provider logic and message rendering logic has been separated and
 * dependencies are inverted. All dependencies are on interfaces now.
 * 
 * It has two different interfaces for two different responsibilities:
 * MessageProvide interface for providing the message and MessageRenderer
 * rendering the message. So this inverts the dependencies among the classes in
 * previous example.
 * 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class Application {

	public static void main(String[] args) {
		Application app = new Application();
		
		GreetingRenderer renderer = new StandardOutputRenderer();

		GreetingProvider helloGreetingProvider = new HelloWorldGreetingProvider();
		renderer.setGreetingProvider(helloGreetingProvider);
		renderer.render();
		
		renderer = new ErrorOutputRenderer();

		GreetingProvider selamGreetingProvider = new SelamGreetingProvider();
		renderer.setGreetingProvider(selamGreetingProvider);
		renderer.render();
	}
}
