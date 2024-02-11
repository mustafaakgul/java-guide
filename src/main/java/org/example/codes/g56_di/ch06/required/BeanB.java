package org.javaturk.spring.di.ch06.required;

import org.springframework.beans.factory.annotation.Required;

public class BeanB {

	private String name;

	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
	}

	public void doThat() {
		System.out.println("I am doing that!");
	}
}
