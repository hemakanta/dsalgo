package com.ds.practice.binaryTree;

/*class Node
{
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}*/

public class TreeTraversByRecursion 
{

	Node root;

	public TreeTraversByRecursion() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	/* Given a binary tree, print its nodes in inorder: left->root->right*/
	void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder: root->left->right */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" 
	 * postorder: left->root->right
	 * traversal.
	 */
	void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}
	
	// Wrappers over above recursive functions 
    void printPostorder()
    {     
    	printPostorder(root);
    } 
    void printInorder()
    {     
    	printInorder(root);
    } 
    void printPreorder()
    {    
    	printPreorder(root);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeTraversByRecursion tree = new TreeTraversByRecursion(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Inorder traversal of binary tree is "); 
        tree.printInorder();
  
        System.out.println("\nPreorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 

	}

}
