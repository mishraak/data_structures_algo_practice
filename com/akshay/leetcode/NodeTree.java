package com.akshay.leetcode;

public class NodeTree {
	int data;
	NodeTree left;
	NodeTree right;
	
	public NodeTree(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public NodeTree(int data, NodeTree left, NodeTree right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
