package com.ds.practice.stack;

import java.util.Stack;

public class SpecialStackSpaceOptimized extends Stack<Integer> {
	
	Stack<Integer> min = new Stack<>();
	
	public void push(int item) {

		if(isEmpty()){
			super.push(item);
			min.push(item);
		}else {
			super.push(item);
			int y = min.peek();
			if(item < y) {
				min.push(item);
			} /*else {
				min.push(y);
			}*/
		}
	}
	
	public Integer pop() {
		int item = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty !!!");
			return -1;
		}
		 item = super.pop();
		 if(item == min.peek()) {
			 min.pop();
		 }
		return item;
	}
	
	public Integer getMin() {
		int item = 0;
		if(isEmpty())
			return -1;
		item = min.peek();
		return item;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialStackSpaceOptimized stk = new SpecialStackSpaceOptimized();
		stk.push(19);
		stk.push(21);
		stk.push(13);
		stk.push(10);
		stk.push(35);
		stk.push(11);
		stk.push(3);
		
		System.out.println("Mimimum value : "+ stk.getMin());
		
		int item = stk.pop();
		System.out.println(item + " popped from stack...");
		System.out.println("Mimimum value : "+ stk.getMin());
		
		stk.pop();
		stk.pop();
		item = stk.pop();
		System.out.println(item + " popped from stack...");
		System.out.println("Mimimum value : "+ stk.getMin());
		
		item = stk.pop();
		System.out.println(item + " popped from stack...");
		System.out.println("Mimimum value : "+ stk.getMin());
		
	}

}
