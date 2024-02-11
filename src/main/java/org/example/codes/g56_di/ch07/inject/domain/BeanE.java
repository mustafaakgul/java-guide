package org.javaturk.spring.di.ch07.inject.domain;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class BeanE {
	
	@Inject
	private int aNumber;
	
	@Inject
	private String aString;
	
	@Inject
	private BeanF aBean;

	@Override
	public String toString() {
		return "BeanE [aNumber=" + aNumber + ", aString=" + aString + ", aBean=" + aBean + "]";
	}
}
