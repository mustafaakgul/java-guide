package org.javaturk.spring.di.ch03.domain;

import java.util.Date;

public class CustomValueInjection {

	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "CustomValueInjection [dob=" + dob + "]";
	}
}
