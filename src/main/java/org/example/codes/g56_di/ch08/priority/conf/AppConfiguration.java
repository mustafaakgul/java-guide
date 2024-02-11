package org.javaturk.spring.di.ch08.priority.conf;

import javax.annotation.Priority;

import org.javaturk.spring.di.ch08.priority.domain.YBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

//@Configuration
public class AppConfiguration {
	
	@Bean
	@Order(-100)
//	@Priority
	public YBean yBean() {
		return new YBean();
	}
}
