package org.javaturk.spring.di.ch06.qualifier.custom.domain;

import org.javaturk.spring.di.ch06.qualifier.custom.qualifiers.Home;
import org.javaturk.spring.di.ch06.qualifier.custom.qualifiers.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Home(city="Istanbul")
	Address homeAddress1;
	
	@Autowired
	@Home(city="Ayvalik")
	Address homeAddress2;
	
	@Autowired
	@Office(city="Istanbul")
	Address officeAddress1;

	@Override
	public String toString() {
		return "Person [homeAddress1=" + homeAddress1 + ", homeAddress2=" + homeAddress2 + ", officeAddress1=" + officeAddress1 + "]";
	}
}
