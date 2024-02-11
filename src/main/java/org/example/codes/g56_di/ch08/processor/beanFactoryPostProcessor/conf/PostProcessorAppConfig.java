package org.javaturk.spring.di.ch08.processor.beanFactoryPostProcessor.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostProcessorAppConfig {
	
	@Bean
	public String name() {
		return "A_NAME";
	}
}
