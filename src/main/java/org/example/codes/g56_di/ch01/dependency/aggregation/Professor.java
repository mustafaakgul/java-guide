package org.javaturk.spring.di.ch01.dependency.aggregation;

public class Professor {
	private String name;
	private  Course[] coursesGiven;
	
	public Professor(String name, Course[] coursesGiven) {
		this.name = name;
		this.coursesGiven = coursesGiven;
	}
}
