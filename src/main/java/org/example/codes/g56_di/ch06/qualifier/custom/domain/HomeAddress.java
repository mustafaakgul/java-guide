package org.javaturk.spring.di.ch06.qualifier.custom.domain;

public abstract class HomeAddress implements Address {

	@Override
	public String toString() {
		return "HomeAddress [City=" + getAddress() + "]";
	}
}
