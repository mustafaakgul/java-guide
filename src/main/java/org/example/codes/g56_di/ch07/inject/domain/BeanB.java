package org.javaturk.spring.di.ch07.inject.domain;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

	private String name;
	private BeanC beanC;
	
	@Inject
	public BeanB(BeanC beanC) {
		this.beanC = beanC;
	}

	@Value("${user.name}")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + ", beanC=" + beanC + "]";
	}
}
