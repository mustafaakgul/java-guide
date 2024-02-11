package org.javaturk.spring.di.ch07.liteBean.domain.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanD {
	@Autowired
	private String name;
	
	@Autowired
	private int count;
	
	@Autowired
	private boolean open;

	private BeanE beanE;
	private BeanF beanF;

//	@Autowired
//	public BeanD(String name, int count, boolean open) {
//		this.name = name;
//		this.count = count;
//		this.open = open;
//	}

	@Autowired
	public void setBeanE(BeanE beanE) {
		this.beanE = beanE;
	}

	@Autowired
	public void setBeanF(BeanF beanF) {
		this.beanF = beanF;
	}

	@Bean
	public String name() {
		return "Bean-D";
	}

	@Bean
	public int count() {
		return 5;
	}

	@Bean
	public boolean open() {
		double d = Math.random();
		if (d > 0.5)
			return true;
		else
			return false;
	}
	
	@Bean
	public BeanE beanE(String beanName, int number) {
		BeanE beanE = new BeanE(beanName, number);
		return beanE;
	}

	@Bean
	public BeanF beanF() {
		BeanF beanF = new BeanF();
		return beanF;
	}
	
	@Bean
	public String beanName() {
		return "Bean-E";
	}

	@Bean
	public int number() {
		return 111;
	}
	
	@Bean
	public String nameOfBean() {
		return "Bean-F";
	}

	@Override
	public String toString() {
		return "BeanD [name=" + name + ", count=" + count + ", open=" + open + ", beanE=" + beanE + ", beanF=" + beanF + "]";
	}

}
