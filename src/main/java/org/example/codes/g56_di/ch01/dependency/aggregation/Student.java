package org.javaturk.spring.di.ch01.dependency.aggregation;

public class Student {
	private String name;
	private  Course[] coursesTaken;
	
	public Student(String name, Course[] coursesTaken) {
		this.name = name;
		this.coursesTaken = coursesTaken;
	}

}
