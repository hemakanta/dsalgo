package com.ds.practice.binaryTree;

import java.util.Stack;

public class InoderTraversByUsingStack {
	
	Node root;
	
	void inorder() 
    { 
		if (root == null) 
            return; 
		
		Stack<Node> s = new Stack<Node>(); 
        Node curr = root;
        
        while (curr != null || s.size() > 0)
        { 
            while (curr !=  null)
            { 
                s.push(curr);
                curr = curr.left; 
            }
            
            curr = s.pop();
            
            System.out.print(curr.key + " ");
            
            curr = curr.right;
        }
    }

	public static void main(String[] args) {
		InoderTraversByUsingStack tree = new InoderTraversByUsingStack();
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inorder();

	}

}
