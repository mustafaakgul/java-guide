package org.javaturk.spring.di.ch06.greeting.greeting15.renderer;

import javax.annotation.Resource;

import org.javaturk.spring.di.ch06.greeting.greeting15.custom.Selam;
import org.javaturk.spring.di.ch06.greeting.greeting15.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StandardOutputRenderer implements GreetingRenderer {

	@Resource(name = "selamGreetingProvider")
	private GreetingProvider greetingProvider;
	
//	@Resource
//	private GreetingProvider selamGreetingProvider;
	
//	@Resource
//	@Qualifier("selamGreetingProvider")
//	private GreetingProvider greetingProvider;
	
	// Use @Primary in SelamGreetingProvider
//	@Resource
//	private GreetingProvider greetingProvider;
	
//	@Resource
//	@Selam
//	private GreetingProvider greetingProvider;
	
//	@Autowired
//	public void setGreetingProvider(GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Resource
//	public void setGreetingProvider(GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Resource
//	public void setHelloWorldGreetingProvider(GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
}
