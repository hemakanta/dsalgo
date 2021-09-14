package com.ds.practice.binaryTree;

public class BinaryTree {
	Node root;
	public BinaryTree(int value)
	{
		// TODO Auto-generated constructor stub
		this.root = new Node(value);
	}
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root= null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(34);
		
		bt.root.left= new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(5);
		bt.root.left.right =new Node(10);
		
		bt.root.right.left=new Node(23);
		bt.root.right.right=new Node(11);
		
		
		
		

	}

}
