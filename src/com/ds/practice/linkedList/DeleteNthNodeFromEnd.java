package com.ds.practice.linkedList;

public class DeleteNthNodeFromEnd {
	
	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteNthNodeFromEnd llist = new DeleteNthNodeFromEnd();
		  
		llist.addToTheLast(2); 
	    llist.addToTheLast(3); 
	    llist.addToTheLast(1); 
	    llist.addToTheLast(7); 
	    llist.addToTheLast(74);
	    llist.addToTheLast(37);
	    llist.addToTheLast(76);

	    System.out.println("Created Linked list is:"); 
	    llist.printList(); 

	    int N = 2; 
	    llist.deleteNthNode(N); 

	    System.out.println("\nLinked List after Deletion by node position: :"+N); 
	    llist.printList();

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
		//System.out.println("");
		while(null != temp )
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	void deleteNthNode(int key) 
    { 
		Node firstNode = head;
		Node seconNode = head;
		
		for(int i=0; i<key; i++)
		{
			seconNode = seconNode.next;
			if (null == seconNode)
			{
				if(i==key-1)
				{
					head = head.next;
					return;
				}
				else
				{
					System.out.println("Position vlaue is more the node size");
					return;
				}
			}
			
		}
		
		while(null != seconNode.next)
		{
			seconNode= seconNode.next;
			firstNode = firstNode.next;
		}
		
		firstNode.next = firstNode.next.next;
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
	
	/*
	 * 
	
	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the test cases");
		Scanner sc = new Scanner(System.in);
		int testNo = sc.nextInt();
		while(testNo>0)
		{
			Demo llist = new Demo();
			int nodeSize = sc.nextInt();
			for (int i = 0; i < nodeSize; i++) 
			{
				llist.addToTheLast(sc.nextInt());
			}
			
			System.out.println("\nCreated Linked list is:"); 
		    llist.printList(); 

		    int N = sc.nextInt(); 
		    int value = llist.deleteNthNode(N, nodeSize); 
		    if (1==value)
		    {
		    	System.out.println("\nLinked List after Deletion by node position: :"+N); 
		    	llist.printList();
			}
			testNo--;
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
		//System.out.println("");
		while(null != temp )
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	int deleteNthNode(int key, int nodeSize) 
    { 
		int pos = nodeSize-key;
		Node seconNode = head;
		for(int i=1; i<pos; i++)
		{
			seconNode = seconNode.next;
		}
		if (pos==0)
		{
			head = head.next;
			return 1;
		}
		else if(pos<0)
		{
			System.out.println("Not possible as position not matching");
			return 0;
		}
		else
		{
		   seconNode.next = seconNode.next.next;
		   return 1;
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

	 * 
	 */
}