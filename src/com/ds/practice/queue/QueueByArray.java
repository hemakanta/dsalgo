package com.ds.practice.queue;

public class QueueByArray {
	
	int front, rear;
	static final int MAX_CAPACITY = 3;
	int[] queueArray;
	
	public QueueByArray()
	{
		queueArray = new int[MAX_CAPACITY];
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty()
	{
		return (rear < 0 || front > rear);
	}
	
	public boolean isFull()
	{
		return (rear >= MAX_CAPACITY-1);
	}
	
	public boolean enqueue(int data)
	{
		if (isFull()) {
			System.out.println("Queue is Full..");
			return false;
		}
		
		queueArray[++rear] = data;
		System.out.println(data +" enqueue into Queue.");
		
		return true;
		
	}
	
	public boolean dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty..");
			return false;
		}
		int data = queueArray[front++];
		System.out.println(data + " deque from queue");
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueByArray queue = new QueueByArray();
		
		queue.dequeue();
		
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(56);
		queue.enqueue(34);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		

	}

}
