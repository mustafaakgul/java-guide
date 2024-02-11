package org.javaturk.spring.di.ch08.processor.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class BeanB {
	private String name;
	private LocalDateTime preInitializationDate;
	private LocalDateTime postInitializationDate;
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	public void setPreInitializationDate(LocalDateTime preInitializationDate) {
		this.preInitializationDate = preInitializationDate;
	}

	public void setPostInitializationDate(LocalDateTime postInitializationDate) {
		this.postInitializationDate = postInitializationDate;
	}
	
	@PostConstruct
	public void startUp() {
		System.err.println("in BeanB startUp()");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.err.println("in BeanB cleanUp()");
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + ", preInitializationDate=" + preInitializationDate + ", postInitializationDate=" + postInitializationDate
				+ "]";
	}
}
