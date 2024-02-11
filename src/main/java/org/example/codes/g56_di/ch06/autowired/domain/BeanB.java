package org.javaturk.spring.di.ch06.autowired.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
	private String name;
	private int age;
	private BeanC beanC;
	private BeanD beanD;

	@Autowired
	public BeanB(String name, int age, BeanD beanD) {
		this.name = name;
		this.age = age;
		this.beanD = beanD;
	}

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + ", age=" + age + ", beanC=" + beanC + ", beanD=" + beanD + "]";
	}
}
