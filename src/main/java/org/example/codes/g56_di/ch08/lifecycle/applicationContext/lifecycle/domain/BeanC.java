package org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BeanC {
	
	public BeanC() {
		System.err.println("in BeanC()");
	}

	@Override
	public String toString() {
		return "BeanC [ ]";
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanC init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanC shutDown()");
	}
}
