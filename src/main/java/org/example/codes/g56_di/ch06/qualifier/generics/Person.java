package org.javaturk.spring.di.ch06.qualifier.generics;

import org.javaturk.spring.di.ch06.qualifier.custom.*;
import org.javaturk.spring.di.ch06.qualifier.custom.domain.HomeAddress;
import org.javaturk.spring.di.ch06.qualifier.custom.domain.OfficeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	DeliveryPoint<HomeAddress> homeAddress;

	@Autowired
	DeliveryPoint<OfficeAddress> officeAddress;

	public void setHomeAddress(DeliveryPoint<HomeAddress> homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public DeliveryPoint<HomeAddress> getHomeAddress() {
		return homeAddress;
	}

	public void setOfficeAddress(DeliveryPoint<OfficeAddress> officeAddress) {
		this.officeAddress = officeAddress;
	}

	public DeliveryPoint<OfficeAddress> getOfficeAddress() {
		return officeAddress;
	}

	@Override
	public String toString() {
		return "Person [homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + "]";
	}
}
