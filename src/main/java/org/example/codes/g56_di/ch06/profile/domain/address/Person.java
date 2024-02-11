package org.javaturk.spring.di.ch06.profile.domain.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	
	@Autowired
	Address address;
	
	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
}
