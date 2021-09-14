package com.ds.practice.linkedList;

import java.util.Scanner;

class Node {
	
	int data;
	Node next;
	
	Node(int value)
	{
		data =value;
		next = null;
	}
}

public class DeleteNode
{
	Node head;
	void printList(Node head)
	{
		if(null == head)
			System.out.println("Empty node");
		Node temp = head;
		System.out.println("");
		while(null != temp )
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void addToTheLast(Node newNode)
	{
		if (null == head) {
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(null != temp.next)
				temp = temp.next;
			temp.next = newNode;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter below data: ");
		System.out.println("1. No of Test Cases");
		System.out.println("2. Size of LinkedList");
		System.out.println("3. Node Values as per the size");
		System.out.println("4. Deletion index");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int size = sc.nextInt();
			DeleteNode linkList = new DeleteNode();
			
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			linkList.addToTheLast(head);
			int a = 0;
			for(int i =1; i<size; i++)
			{
				a = sc.nextInt();
				linkList.addToTheLast(new Node(a));
			}
			
			int x = sc.nextInt();
			GfG g = new GfG();
			Node result =  g.deleteNode(linkList.head, x);
			linkList.printList(result);
			t--;
		}
	}
}

class GfG
{
    Node deleteNode(Node head, int indexPosition)
    {
	// Your code here	
	  Node previous = head;
	  int count =1;
	  while(count < indexPosition-1)
	  {
		  previous = previous.next;
		  count++;
	  }
	  
	  if(null == previous || null == previous.next)
	  {
	      System.out.println("Node size is less as compare to position to delete");
	  }
	  else
	  {
		  if (indexPosition==1) 
		  {
			  head=head.next;
		  }
		  else
		  {
			  Node current = previous.next;
			  previous.next = current.next;
			  current.next = null;
		  }
	  }
	  return head;
    }
}
