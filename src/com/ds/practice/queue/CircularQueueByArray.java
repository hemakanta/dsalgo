package com.ds.practice.queue;

public class CircularQueueByArray {
	
	int capacity;
	int rear, front;
	int[] arry;
	
	public CircularQueueByArray(int size) {
		// TODO Auto-generated constructor stub
		capacity = size;
		this.rear = this.front= -1;
		arry = new int[capacity];
	}
	
	boolean isFull()
	{
		if( (rear == capacity-1 && front==0) || (rear == (front-1)%(capacity-1)) )
		{
			//System.out.println("Circular Queue is full..");
			return true;
		}
		else
			return false;
	}
	
	boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
	public void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("Queue is Full.... \n");
			return;
		}
		else if(front == -1)
		{
			rear = front = 0;
			arry[rear] = item;
			//System.out.println(item +" value enetr into Circular Queue");
		}
		else if (rear == capacity-1 && front != 0) 
	    { 
	        rear = 0; 
	        arry[rear] = item;
	    } 
		else
		{
			rear = (rear + 1) % capacity;
			arry[rear] = item;
		}
		System.out.println(item +" value enetr into Circular Queue");
		
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Circular queue is empty..");
			return 0;
		}
		
		int data = arry[front];
		arry[front] = -1;
		if(front == rear)
		{
			front = rear = -1;
		}
		else if(front == capacity-1)
		{
			front = 0;
		}
		else
			front = (front + 1)%capacity;
		
		return data;
			
	}
	
	public int frontValue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty..");
			return 0;
		}
		else
		{
			int value = arry[front];
			return value;
		}
	}
	
	public int rearValue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty..");
			return 0;
		}
		else
		{
			int value = arry[rear];
			return value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueueByArray que = new CircularQueueByArray(4);
		
		System.out.println(que.dequeue()+" value dequeued from Queue \n");
		
		que.enqueue(12);
		que.enqueue(28);
		que.enqueue(45);
		que.enqueue(456);
		que.enqueue(78);
		
		System.out.println(que.dequeue() +  
                " dequeued from queue\n"); 
		System.out.println(que.dequeue() +  
                " dequeued from queue\n"); 
   
		System.out.println("At the end, Front item is " +  
				que.frontValue()); 
      
		System.out.println("At the end, Rear item is " +  
				que.rearValue()); 
	}

}
