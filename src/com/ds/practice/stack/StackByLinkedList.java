package com.ds.practice.stack;

public class StackByLinkedList {
	
	class StackNode
	{
		int data;
		StackNode next;
		StackNode(int x)
		{
			data = x;
			next = null;
		}
	}
	
	StackNode top;
	
	boolean isEmpty()
	{
		return (top==null);
	}
	
	public void push(int data)
	{
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top=newNode;
		System.out.println(data + " pushed to Stack.");
	}
	
	public int pop()
	{
		int val=0;
		if(isEmpty())
		{
			throw new RuntimeException("No data in Stack, it is Empty");
		}
		val = top.data;
		top = top.next;
		
		return val;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new RuntimeException("No data in Stack, it is Empty");
		}
		return top.data;
	}
	
	public void traverse()
	{
		StackNode root = top;
		while(null != root)
		{
			System.out.print(root.data+" ");
			root= root.next;
		}
		System.out.println("\n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackByLinkedList stack = new StackByLinkedList();
		stack.push(23);
		stack.push(34);
		stack.push(67);
		stack.push(78);
		
		stack.traverse();
		
		System.out.println(stack.pop() +" data poped.");
		
		System.out.println(stack.peek() +" data in top.");

	}

}
