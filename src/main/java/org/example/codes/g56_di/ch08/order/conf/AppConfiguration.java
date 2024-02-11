package org.javaturk.spring.di.ch08.order.conf;

import org.javaturk.spring.di.ch08.order.domain.YBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfiguration {
	
	@Bean
	@Order(-100)
	public YBean yBean() {
		return new YBean();
	}
}
