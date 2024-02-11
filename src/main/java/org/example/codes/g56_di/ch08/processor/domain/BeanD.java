package org.javaturk.spring.di.ch08.processor.domain;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class BeanD {
	private String name;
	private LocalDateTime preInitializationDate;
	private LocalDateTime postInitializationDate;
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
}
