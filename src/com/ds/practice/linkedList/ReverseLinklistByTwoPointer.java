package com.ds.practice.linkedList;


class NodeRev{
	int data;
	NodeRev next;
	public NodeRev(int value) {
		this.data = value;
		this.next = null;
	}
}

public class ReverseLinklistByTwoPointer {
	
	
	public void printNode(NodeRev head)
	{
		NodeRev temp = head;
		while(null != temp)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public NodeRev push(int data, NodeRev head)
	{
		NodeRev newNode = new NodeRev(data);
		NodeRev temp = head;
		if(temp == null)
		{
			temp = newNode;
			head = temp;
			return head;
		}
		while(null != temp.next)
		{
			temp = temp.next;
		}
		temp.next = newNode;
		
		return head;
	}
	
	public NodeRev swapWithTwoPointer(NodeRev head)
	{
		NodeRev curr = head;
		NodeRev prev = null;
		
		while(null != curr) {
			NodeRev next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return head=prev;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinklistByTwoPointer det = new ReverseLinklistByTwoPointer();
		NodeRev head = null;
		head = det.push(1, head);
		head = det.push(2, head);
		head = det.push(3, head);
		head = det.push(4, head);
		head = det.push(5, head);
		//head = det.push(6, head);
		det.printNode(head);
		
		head = det.swapWithTwoPointer(head);
		System.out.println("\n---");
		det.printNode(head);
	}

}
