package org.javaturk.spring.di.ch08.processor.domain;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope("prototype")
public class BeanC {
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

	@Override
	public String toString() {
		return "BeanC [name=" + name + ", preInitializationDate=" + preInitializationDate + ", postInitializationDate=" + postInitializationDate
				+ "]";
	}
	
	@PostConstruct
	public void startUp() {
		System.err.println("in BeanC startUp()");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.err.println("in BeanC cleanUp()");
	}
}
