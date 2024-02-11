package org.javaturk.spring.di.ch01.dependency.composition;

public class Tree {
	private String name;
	private Root root;
	private Trunk trunk;
	private Leaf[] leaves = new Leaf[1_000_000];
	
	public Tree(String name) {
		this.name = name;
		root = new Root(this);
		trunk = new Trunk(this);
		Leaf leaf1 = new Leaf(this);
		leaves[0] = leaf1;
//		...
	}
}
