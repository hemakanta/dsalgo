package com.ds.practice.linkedList;

import java.util.Scanner;

class NodeData
{
	int data;
	NodeData next;
	NodeData(int data)
	{
		this.data = data;
		next = null;
	}
}

public class CommonTask 
{
	static NodeData head;
	public static void main(String[] args)
	{
		System.out.println("Enter the size if linked list and give data");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i= 0; i<size ; i++)
		{
			addNodeToLinkedList(sc.nextInt());
			printLinkedList();
		}
	}
	
	public static void printLinkedList()
	{
		NodeData temp = head;
		while(null!=temp)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	public static void addNodeToLinkedList(int newData)
	{
		NodeData newNode =  new NodeData(newData);
		
		if(null == head)
		{
			head = newNode;
		}
		else
		{
			NodeData temp = head;
			while(null != temp.next)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

}
