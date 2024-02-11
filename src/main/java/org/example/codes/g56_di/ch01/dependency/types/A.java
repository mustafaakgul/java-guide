package org.javaturk.spring.di.ch01.dependency.types;

public class A extends P implements I{
	
	private B b;
	
	public void f(C c) {
		
	}
	
	public D g() {
		return new D();
	}
}
