package com.ds.practice.linkedList;

import java.util.Scanner;

public class SwapKthNodeFromBeginAndEnd {

	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the test cases");
		Scanner sc = new Scanner(System.in);
  		int testNo = sc.nextInt();
		while(testNo>0)
		{
			SwapKthNodeFromBeginAndEnd linkList = new SwapKthNodeFromBeginAndEnd();
			int nodeSize = sc.nextInt();
			for (int i = 0; i < nodeSize; i++) 
			{
				linkList.addToTheLast(sc.nextInt());
			}
			
			System.out.println("\nCreated Linked list is:"); 
			linkList.printList(); 

		    int N = sc.nextInt(); 
		    int value = linkList.swapKthNodeFromBeginAndEnd(N, nodeSize); 
		    if (1==value)
		    {
		    	System.out.println("\nLinked-List after swap by position: :"+N); 
		    	linkList.printList();
			}
		    else
		    {
		    	System.out.println("No change in nodes");
		    }
			testNo--;
		}
	}
	
	class Node
	{
		int data;
		Node next;
		Node(int value)
		{
			data = value;
			next  = null;
		}
	}
	
	public void addToTheLast(int value)
	{
		Node newNode = new Node(value);
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
	
	void printList()
	{
		if(null == head)
			System.out.println("Empty node");
		Node temp = head;
		while(null != temp )
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	int swapKthNodeFromBeginAndEnd(int kthNodePos, int size) 
    { 
		Node first = head;
		Node prev = null;
		
		if(size<kthNodePos)
			return 0;
		
		if (2*kthNodePos - 1 == size) 
            return 0;
		
		for(int i=1; i<kthNodePos ; i++)
		{
			prev = first;
			first = first.next;
		}
		
		Node second = head;
		Node prevSec = null;
		
		for(int i=1; i<size-kthNodePos+1; i++)
		{
			prevSec = second;
			second = second.next;
		}
		
		if (prev != null) 
			prev.next = second; 
  
        // Same thing applies to y_prev 
        if (prevSec != null) 
        	prevSec.next = first; 
		
		
		Node temp = first.next;
		first.next = second.next;
		second.next=temp;
		
		if (kthNodePos == 1) 
            head = second; 
  
        if (kthNodePos == size) 
            head = first; 
		
		return 1;
    }
}
