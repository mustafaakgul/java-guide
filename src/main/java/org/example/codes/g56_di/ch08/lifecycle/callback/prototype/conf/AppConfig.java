package org.javaturk.spring.di.ch08.lifecycle.callback.prototype.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public String name() {
		return "A-NEW-NAME";
	}

}
