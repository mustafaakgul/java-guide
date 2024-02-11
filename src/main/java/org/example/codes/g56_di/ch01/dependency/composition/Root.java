package org.javaturk.spring.di.ch01.dependency.composition;

public class Root {
	private Tree owner;

	public Root(Tree owner) {
		this.owner = owner;
	}
}
