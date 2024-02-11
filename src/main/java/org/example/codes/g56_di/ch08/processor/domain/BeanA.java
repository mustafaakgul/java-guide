package org.javaturk.spring.di.ch08.processor.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	private String name;
	private LocalDateTime preInitializationDate;
	private LocalDateTime postInitializationDate;
	
	public void setName(String name) {
		System.err.println("in setName() of BeanA: " + this.name + " - " + name);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setPreInitializationDate(LocalDateTime preInitializationDate) {
		this.preInitializationDate = preInitializationDate;
	}

	public void setPostInitializationDate(LocalDateTime postInitializationDate) {
		this.postInitializationDate = postInitializationDate;
	}
	
	@Override
	public String toString() {
		return "BeanA [name=" + name + ", preInitializationDate=" + preInitializationDate + ", postInitializationDate=" + postInitializationDate
				+ "]";
	}

	public void defaultStartUp() {
		System.err.println("in BeanA defaultStartUp()");
	}
	
	public void defaultCleanUp() {
		System.err.println("in BeanA defaultCleanUp()");
	}
	
	public void startUp() {
		System.err.println("in BeanA startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanA cleanUp()");
	}
}
