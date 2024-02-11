package org.javaturk.spring.di.ch06.spel;

import org.springframework.beans.factory.annotation.Autowired;

public class SpelBean {
	
	private double randomNumber;
	private String username;
	private String javaVersion;
	
	@Autowired
	public void setRandomNumber(double randomNumber) {
		this.randomNumber = randomNumber;
	}

	@Autowired
	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	@Autowired
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "SpelBean [randomNumber=" + randomNumber + ", username=" + username + ", javaVersion=" + javaVersion + "]";
	}

}
