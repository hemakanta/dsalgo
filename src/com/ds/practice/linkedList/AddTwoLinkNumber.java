package com.ds.practice.linkedList;

class NodeAdd{
	NodeAdd next;
	int data;
	NodeAdd(int data){
		this.data = data;
		next = null;
	}
}


public class AddTwoLinkNumber {
	
	public static NodeAdd addDataToLink(NodeAdd head, int data) {
		
		NodeAdd node = new NodeAdd(data);
		NodeAdd temp = head;
		if(null == head) {
			head = node;
			return head;
		}
		
		while(null != temp.next) {
			temp = temp.next;
			
		}
		temp.next = node;
		
		return head;
	}
	
	public static NodeAdd reverseLink(NodeAdd head) {
		
		NodeAdd curr =head;
		NodeAdd prev = null;
		NodeAdd next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		return head=prev;
	}
	
	public static NodeAdd addTwoLinkNum(NodeAdd L1, NodeAdd L2) {
		
		NodeAdd L3 = null;
		int sum =0, carry = 0, x = 0, y =0, rmdr = 0;
		
		while(null != L1 || null != L2) {
			
			x = null != L1 ? L1.data : 0;
			y = null != L2 ? L2.data : 0;
			
			L1 = null != L1 ? L1.next : null;
			L2 = null != L2 ? L2.next : null;
			
			sum = x+y+carry;
			
			if(null == L1 && null == L2)
			{
				NodeAdd temp = new NodeAdd(sum);
				temp.next = L3;
				L3 = temp;
				return L3;
			}
			
			carry = sum/10;
			rmdr = sum%10;
			NodeAdd temp = new NodeAdd(rmdr);
			
			temp.next = L3;
			L3 = temp;
		}
		 return L3;
	}
	
	public static void printNode(NodeAdd head) {
		
		NodeAdd temp = head;
		while(null != temp)
		{
			System.out.print(" "+ temp.data);
			temp = temp.next;
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9, 9, 1, 8, 9};
		NodeAdd L1 = null;
		for(int val : arr) {
			L1 = addDataToLink(L1, val);
		}
		printNode(L1);
		
		arr =  new int[]{9, 3, 1};
		NodeAdd L2 = null;
		for(int val : arr) {
			L2 = addDataToLink(L2, val);
		}
		printNode(L2);
		
		L1 = reverseLink(L1);
		printNode(L1);
		
		L2 = reverseLink(L2);
		printNode(L2);
		
		/*NodeAdd L3 = addTwoLinkNum(L1, L2);
		printNode(L3);*/

	}

}
