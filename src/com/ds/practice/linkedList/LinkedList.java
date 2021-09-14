package com.ds.practice.linkedList;

import com.ds.practice.linkedList.JavaNodeClass.Node;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaNodeClass linkList =  new JavaNodeClass();
		
		linkList.head = linkList.new Node(132);
		Node node2 = linkList.new Node(45);
		Node node3 = linkList.new Node(456);
		
		linkList.head.next = node2;
		node2.next=node3;
		node3.next= null;
		Node head = linkList.head;
		int i =0;
		while(null != head)
		{
			System.out.println("Node " + ++i + " "+ head.data);
			head = head.next;
			
		}
		
		
	}
	

}
