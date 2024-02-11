package org.javaturk.spring.di.ch07.liteBean.domain.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	private String name;
	private int count;
	private boolean open;

	@Autowired
	public BeanA(String name, int count, boolean open) {
		this.name = name;
		this.count = count;
		this.open = open;
	}

	@Bean
	public static String name() {
		return "Bean-A";
	}

	@Bean
	public static int count() {
		return 5;
	}

	@Bean
	public static boolean open() {
		double d = Math.random();
		if (d > 0.5)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + ", count=" + count + ", open=" + open + "]";
	}
}
