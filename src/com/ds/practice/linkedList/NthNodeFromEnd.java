package com.ds.practice.linkedList;

import com.ds.practice.linkedList.JavaNodeClass.Node;

public class NthNodeFromEnd {
	
	static JavaNodeClass nodeLink = new  JavaNodeClass();

	static Node head =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nodeData = new int[]{3, 23, 12, 67};
		
		/*System.out.print("Enter the index: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();*/
		
		int index = 2;
		
		for (int i = nodeData.length-1; i >= 0; i--) 
		{
			push(nodeData[i]);
		}
		System.out.println("Initial Node data");
		printLinkedList();
		
		System.out.println("Add at Front - 123: ");
		addAtFront(123, head);
		
		System.out.println("Add at End - 234: ");
		addAtEnd(234, head);
		
		System.out.println("Add at specific node - 679: ");
		addAtSpcificNode(head.next.next, 679);
	}
	
	public static void addAtFront(int data, Node actualNode)
	{
		Node newData = nodeLink.new Node(data);
		newData.next = actualNode;
		
		head = newData;
		printLinkedList();
	}
	
	public static void addAtSpcificNode(Node prevNode, int data)
	{
		if (null == prevNode) {
			System.out.println("Node should not be null.");
			return;
		}
		
		Node newNode = nodeLink.new Node(data);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
		//head = prevNode;
		printLinkedList();
	}
	
	public static void addAtEnd(int data, Node head)
	{
		Node newNode= nodeLink.new Node(data);
		if (null == head) {
			newNode = head;
			printLinkedList();
			
			return;
		}
		Node last = head;
		while(null != last.next)
		{
			last = last.next;
		}
		last.next = newNode;
		printLinkedList();
		
	}
	
	
	public static void printLinkedList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    }
	
	public static void push(int new_data) 
    { 
        Node new_node = nodeLink.new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }
}
