package org.javaturk.spring.di.ch07.inject.domain;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class BeanD {

	private static BeanE beanE;
	
	@Inject
	public void setAnotheBBean(BeanE beanE) {
		BeanD.beanE = beanE;
	}

	@Override
	public String toString() {
		return "BeanD [beanE=" + beanE + "]";
	}
}
