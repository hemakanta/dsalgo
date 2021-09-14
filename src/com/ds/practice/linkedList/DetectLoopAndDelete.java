package com.ds.practice.linkedList;

class NodeDataChk
{
	NodeDataChk next;
	int data;
	NodeDataChk(int data)
	{
		this.data=data;
		next = null;
	}
}

public class DetectLoopAndDelete {
	
	NodeDataChk head;
	
	public void push(int data)
	{
		NodeDataChk newNode = new NodeDataChk(data);
		NodeDataChk temp = head;
		if(temp == null)
		{
			temp = newNode;
			head = temp;
			return;
		}
		while(null != temp.next)
		{
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void printNode()
	{
		NodeDataChk temp = head;
		while(null != temp)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void findTheLoop()
	{
		NodeDataChk slow=head, fast = head;
		boolean flag=false;
		while(null != slow && null!= fast && null!= fast.next) {
			
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Loop is there..");
			deleteLoop(fast);
		}
		else
			System.out.println("\nLoop is Not there..");
	}
	
	public void deleteLoop(NodeDataChk loopNode) 
	{
		NodeDataChk ptr = head;
		NodeDataChk temp = null;
		while (loopNode != ptr) {
			ptr = ptr.next;
			if (loopNode.next == ptr) {
				temp = loopNode;
			}
			loopNode = loopNode.next;
		}
		if (null != temp) {
			temp.next = null;
		}
		System.out.println("Ptr: "+ ptr.data+" starting loop node: "+ temp.data);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoopAndDelete det = new DetectLoopAndDelete();
		det.push(50);
		det.push(20);
		det.push(15);
		det.push(4);
		det.push(10);
		
		det.printNode();
		det.findTheLoop();
		det.head.next.next.next.next.next = det.head.next.next;
		
		det.findTheLoop();
		//System.out.println("Data ... ");

	}

}
