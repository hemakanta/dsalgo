package com.ds.practice.linkedList;

public class DeleteNodeAtGivenPosition {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int value)
		{
			data = value;
			next=null;
		}
	}
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void printNode()
	{
		Node tnode = head; 
		if (null==tnode) {
			System.out.println("Empty linkedList");
		}
		
		while(null != tnode)
		{
			System.out.print(tnode.data+"->");
			tnode = tnode.next;
			if(null != tnode && null == tnode.next) {
				System.out.print(null != tnode ? tnode.data : "NA");
				tnode.next=new Node(456);
				
				boolean flag= printNodeCheck(tnode);
				if(flag)
					return;
			}
		}
		if (null==tnode)
		  System.out.println("NULL");
	}
	
	public boolean printNodeCheck(Node tnodeNext)
	{
		Node tnode = head;
		while(null != tnode)
		{
			if (null != tnodeNext && tnodeNext.next == tnode) 
			{
				System.out.println("Loop is there...");
				return true;
			}
			tnode = tnode.next;
		}
		return false;
	}
	
	public void deleteNode(int position)
	{
		Node temp = head;
		for(int i =0; temp!=null && i<position-1; i++)
			  temp = temp.next;
		
		if(null == temp || null == temp.next)
			System.out.println("Position exceded as compare to LinkedList size to delete the node");
		Node next = temp.next.next; 
		temp.next = next;
		printNode();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteNodeAtGivenPosition linklist = new DeleteNodeAtGivenPosition();
		
		linklist.push(12);
		linklist.push(45);
		linklist.push(456);
		linklist.push(123);
		linklist.push(789);
		
		linklist.printNode();
		System.out.println("After deleting from position 2");
		//linklist.deleteNode(2);

	}

}
