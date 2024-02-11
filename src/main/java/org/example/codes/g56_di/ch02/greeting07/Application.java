package org.javaturk.spring.di.ch02.greeting07;

/**
 * Topic: Custom object framework.
 *  
 * Greeting providers and greeting renderers are produced through a custom framework.
 * The custom framework is also responsible for wiring objects.
 * 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class Application {

	public static void main(String[] args) {
		
		ObjectProviderFramework framework = new ObjectProviderFramework() ;

		GreetingRenderer renderer = (GreetingRenderer) framework.getObject("org.javaturk.spring.di.ch02.greeting07.StandardOutputRenderer", "org.javaturk.spring.di.ch02.greeting07.HelloWorldGreetingProvider");
		renderer.render();
		
//		renderer = (GreetingRenderer) framework.getObject("org.javaturk.spring.di.ch02.greeting07.ErrorOutputRenderer", "org.javaturk.spring.di.ch02.greeting07.SelamGreetingProvider");
//		renderer.render();
	}
}
