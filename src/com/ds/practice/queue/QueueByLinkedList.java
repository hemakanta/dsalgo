package com.ds.practice.queue;


class QueueNode
{
	QueueNode next;
	int data;
	public QueueNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class QueueByLinkedList {
	
	QueueNode front, rear;
	
	boolean isEmpty()
	{
		return (rear == null);
	}
	
	public void enQueue(int item)
	{
		QueueNode newNode = new QueueNode(item);
		if(isEmpty())
		{
			rear = front = newNode;
			System.out.println(item + " enque into Queue..");
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
		System.out.println(item + " enque into Queue..");
	}
	
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty..");
			return;
		}
		int data = front.data;
		System.out.println(data + " deque from queue..");
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueByLinkedList que = new QueueByLinkedList();
		
		que.deQueue();
		que.deQueue();
		
		que.enQueue(19);
		que.enQueue(45);
		que.enQueue(67);
		
		que.deQueue();
		que.deQueue();
		que.deQueue();
		que.deQueue();
		que.deQueue();
		
		

	}

}
