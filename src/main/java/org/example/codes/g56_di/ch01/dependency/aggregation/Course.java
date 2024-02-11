package org.javaturk.spring.di.ch01.dependency.aggregation;

public class Course {
	private String name;
	private Professor instructor;
	private Student[] students;

	public Course(String name, Professor instructor, Student[] students) {
		this.name = name;
		this.instructor = instructor;
		this.students = students;
	}
}
