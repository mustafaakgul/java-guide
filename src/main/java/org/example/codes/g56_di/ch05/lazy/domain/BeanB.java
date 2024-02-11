package org.javaturk.spring.di.ch05.lazy.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {

	private String name;

	@Autowired
	public BeanB(String name) {
		System.err.println("in BeanB()");
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
	}
}
