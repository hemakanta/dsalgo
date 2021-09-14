package com.ds.practice.queue;

class CircularQueueNode
{
	CircularQueueNode next;
	int data;
	CircularQueueNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class CircularQueueByLinkedList {
	
	CircularQueueNode front, rear;
	
	public boolean isEmpty()
	{
		return (front == null);
	}
	
	public void enQueue(int item)
	{
		CircularQueueNode tempNode = new CircularQueueNode(item);
		if (isEmpty()) 
		{
			front = rear = tempNode;
			//rear.next = front;
			System.out.println(item+" enque into Queue");
			return;
		}
		
		tempNode.next = front;
		rear.next = tempNode;
		rear = tempNode;
		System.out.println(item+" enque into Queue");
	}
	
	public void deQueue()
	{
		if (isEmpty()) {
			System.out.println("Queue is empty..");
			return;
		}
		
		int data = front.data;
		System.out.println(data+" deque from the Queue..");
		if(front == rear)
		{
			rear = front = null;
		}
		else
		{
			front = front.next;
			rear.next = front;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueueByLinkedList  cque = new CircularQueueByLinkedList();
		cque.deQueue();
		
		cque.enQueue(15);
		cque.deQueue();
		cque.deQueue();
		
		cque.enQueue(15);
		cque.enQueue(16);
		cque.enQueue(18);
		
		cque.deQueue();
		cque.deQueue();
		cque.deQueue();
		cque.deQueue();
		
	}

}
