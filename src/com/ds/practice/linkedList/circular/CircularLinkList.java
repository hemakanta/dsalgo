package com.ds.practice.linkedList.circular;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	Node(int value)
	{
		data = value;
		next= null;
	}
}

public class CircularLinkList
{
	Node head;
	void push(int data)
	{
		Node newDataNode =  new Node(data);
		Node temp = head;
		newDataNode.next = head;
		
		if(null != head)
		{
			while(temp.next != head)
				temp = temp.next;
			
			temp.next = newDataNode;
		}
		else
		{
			newDataNode.next = newDataNode;
			head = newDataNode;
		}
	}
	
	void printLinkList()
	{
		Node temp = head;
		if (null != head) 
		{
			do 
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			while(temp != head);
		}
		else
		{
			System.out.println("No data");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkList cLinkList = new CircularLinkList();
		System.out.println("Eenter the test case and data");
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase>0)
		{
			int size = sc.nextInt();
			for (int i = 0; i < size; i++) 
			{
				cLinkList.push(sc.nextInt());
			}
			
			testCase --;
		}
		
		cLinkList.printLinkList();

	}

}
