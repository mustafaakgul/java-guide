package org.javaturk.spring.di.ch01.dependency.composition;

public class Trunk {
	private Tree owner;

	public Trunk(Tree owner) {
		this.owner = owner;
	}

}
