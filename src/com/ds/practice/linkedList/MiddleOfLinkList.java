package com.ds.practice.linkedList;

import com.ds.practice.linkedList.JavaNodeClass.Node;

public class MiddleOfLinkList {
	
	static Node head =null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    /*System.out.println("Enter node size and data");
		Scanner sc = new Scanner(System.in);
		int nodesize = sc.nextInt();
		int[] nodeData = new int[nodesize];
		for (int i = 0; i < nodesize; i++) 
		{
			nodeData[i]=sc.nextInt();
		}*/
		
		int[] nodeData = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
				
		/*JavaNodeClass nodeLink = new JavaNodeClass();
		head = nodeLink.head;*/

		for (int i = nodeData.length-1; i >= 0; i--) 
		{
			push(nodeData[i]);
			//printList();
			//printMiddle();
		}
		
		printList();
		printMiddle();
		
	}
	public static void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
	
	public static void printMiddle()
	{
		Node fastHead =  head;
		Node lowestHead =  head;
		
		if(null != head)
		{
			while(fastHead != null && fastHead.next != null)
			{
				fastHead = fastHead.next.next;
				lowestHead = lowestHead.next;
			}
			System.out.println("The middle element is ["+ lowestHead.data +"] \n");
			
		}
		
	}
	
	public static void push(int new_data) 
    { 
		JavaNodeClass nodeLink = new JavaNodeClass();
        Node new_node = nodeLink.new Node(new_data);
        new_node.next = head; 
        head = new_node; 
    } 
	
}
