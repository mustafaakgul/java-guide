package org.javaturk.spring.di.ch08.lazy.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
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
