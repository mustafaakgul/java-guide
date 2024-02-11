package org.javaturk.spring.di.ch02.greeting06;

/**
 * Topic: Custom factory framework.
 *  
 * Greeting providers and greeting renderers are produced through a factory. 
 * But the factory is a custom framework.
 * 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class Application {

	public static void main(String[] args) {
		ObjectProviderFramework framework = new ObjectProviderFramework() ;

		GreetingRenderer renderer = (GreetingRenderer) framework.getObject("org.javaturk.spring.di.ch02.greeting06.StandardOutputRenderer");
		GreetingProvider provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.HelloWorldGreetingProvider");
		
		renderer.setGreetingProvider(provider);
		renderer.render();
		
		renderer = (GreetingRenderer) framework.getObject("org.javaturk.spring.di.ch02.greeting06.ErrorOutputRenderer");
		provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.SelamGreetingProvider");
		
		renderer.setGreetingProvider(provider);
		renderer.render();
		
		provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.ArabicGreetingProvider");
		
		renderer.setGreetingProvider(provider);
		renderer.render();
	}
}
