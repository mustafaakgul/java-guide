package org.javaturk.spring.di.ch03.domain;

public class BeanAFactory implements Factory{

	@Override
	public BeanA create() {
		return new BeanA();
	}
}
