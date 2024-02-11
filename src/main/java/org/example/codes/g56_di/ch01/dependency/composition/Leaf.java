package org.javaturk.spring.di.ch01.dependency.composition;

public class Leaf {
	private Tree owner;

	public Leaf(Tree owner) {
		this.owner = owner;
	}
}
