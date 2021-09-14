package com.ds.practice.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {

	Queue<Integer> queue = new LinkedList<Integer>();
	
	boolean isEmpty()  
    { 
        return queue.isEmpty(); 
    }
	
	void push(int val)  
    { 
        // Add current element 
        queue.add(val);
        
        // Pop (or Dequeue) all previous 
        // elements and put them after current 
        // element 
        
        //queue.forEach(element->queue.add(element));
        for (int i = 0; i < queue.size(); i++)  
        { 
            int x = queue.peek();
            if(val != x) {
            	int y = queue.remove();
            	queue.add(y); 
            }
        }
        System.out.println(val +" pushed in to stack");
    }
	
	public int pop()  
    { 
        if (queue.isEmpty())  
        { 
            System.out.println("No elements in stack"); 
            return -1; 
        } 
        int x = queue.remove();
        System.out.println(x + " poped from stack");
        return x; 
    }
	
	int top()  
    { 
        if (queue.isEmpty()) 
            return -1; 
        int x = queue.peek();
        System.out.println(x + " top element in stack");
        return x; 
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackByQueue stack = new StackByQueue();
		stack.pop();
		
		stack.push(23);
		stack.push(34);
		stack.push(56);
		stack.push(67);
		
		stack.top();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		

	}

}
