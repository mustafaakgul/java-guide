package org.javaturk.spring.di.ch06.profile.domain.address;

public abstract class HomeAddress implements Address {

	@Override
	public String toString() {
		return "HomeAddress [City=" + getAddress() + "]";
	}
}
