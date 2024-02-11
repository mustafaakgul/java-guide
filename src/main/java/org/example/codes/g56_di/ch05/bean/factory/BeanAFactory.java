package org.javaturk.spring.di.ch05.bean.factory;

import org.javaturk.spring.di.ch04.domain.BeanA;

public class BeanAFactory implements Factory{

	@Override
	public BeanA create() {
		return new BeanA();
	}
}
