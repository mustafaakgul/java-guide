package org.javaturk.spring.di.ch08.order.init.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	private String s;
	private int i;
	private boolean b;
	private BeanB beanB1;
	
	@Autowired
	private long l;
	
	@Autowired
	private char c;
	
	@Autowired
	private BeanB beanB2;
	
	private double d;
	
	@Autowired
	public BeanA(double d) {
		this.d = d;
		System.err.println("in BeanA(double d)");
		System.err.println(toString());
	}

	@Autowired
	public void setI(int i) {
		this.i = i;
		System.err.println(toString());
	}

	@Autowired
	public void setS(String s) {
		this.s = s;
		System.err.println(toString());
	}

	@Autowired
	public void setB(boolean b) {
		this.b = b;
		System.err.println(toString());
	}

	@Autowired
	public void setBeanB1(BeanB beanB) {
		this.beanB1 = beanB;
		System.err.println(toString());
	}

	@Override
	public String toString() {
		return "BeanA [s=" + s + ", i=" + i + ", b=" + b + ", beanB1=" + beanB1 + ", l=" + l + ", c=" + c + ", beanB2=" + beanB2 + ", d=" + d + "]";
	}
}
