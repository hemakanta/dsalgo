package com.ds.practice.linkedList;

class NodeSwap{
	int data;
	NodeSwap next;
	public NodeSwap(int val) {
		this.data = val;
		this.next = null;
	}
}

public class SwapNodesWithoutSwappingData {
	
	public NodeSwap push(int data, NodeSwap head)
	{
		NodeSwap newNode = new NodeSwap(data);
		NodeSwap temp = head;
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
	
	public void printNode(NodeSwap head)
	{
		NodeSwap temp = head;
		while(null != temp)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void swapWithLink(int x, int y, NodeSwap head) {
		NodeSwap prev1st=null, curr1st=head, prev2nd = null, curr2nd = head;
		
		while(null != curr1st && curr1st.data != x) {
			prev1st = curr1st;
			curr1st = curr1st.next;
		}
		while(null != curr2nd && curr2nd.data != y) {
			prev2nd = curr2nd;
			curr2nd = curr2nd.next;
		}
		
		prev1st.next = curr2nd;
		prev2nd.next = curr1st;
		
		
		 NodeSwap temp = curr1st.next;
		 curr1st.next = curr2nd.next;
		 curr2nd.next = temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapNodesWithoutSwappingData det = new SwapNodesWithoutSwappingData();
		NodeSwap head = null;
		head = det.push(10, head);
		head = det.push(15, head);
		head = det.push(12, head);
		head = det.push(13, head);
		head = det.push(20, head);
		head = det.push(14, head);
		
		det.printNode(head);
		
		det.swapWithLink(12, 20, head);
		System.out.println("\nAfter Swap: ");
		det.printNode(head);
		
		

	}

}
