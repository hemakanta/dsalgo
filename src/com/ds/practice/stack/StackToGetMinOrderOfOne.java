package com.ds.practice.stack;

import java.util.Stack;

public class StackToGetMinOrderOfOne {
	
	Stack<Integer> stk = new Stack<>();
	int minValue = 0;
	
	public void push(int item) {

		if(stk.isEmpty()){
			stk.push(item);
			minValue = item;
		}else {
			if(item < minValue) {
				int temp = 2*item - minValue;
				stk.push(temp);
				minValue = item;
			}else
				stk.push(item);
		}
		System.out.println(item+" pushed to stack..");
	}
	public Integer pop() {
		int item = 0;
		if(stk.isEmpty()) {
			System.out.println("Stack is empty !!!");
			return -1;
		}
		 item = stk.pop();
		 if(item < minValue) {
			 int temp = 2*minValue - item;  // 2*x - minValue = y // minValue = 2*x - y;
			 item = minValue;
			 minValue = temp;
		 }
		 System.out.println(item+" popped from stack.");
		 System.out.println(getMin()+" is the minimum value..\n");
		return item;
	}
	
	public int getMin() {
		return minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackToGetMinOrderOfOne stkcl = new StackToGetMinOrderOfOne();
		stkcl.push(18);
		stkcl.push(19);
		stkcl.push(29);
		stkcl.push(15);
		stkcl.push(16);
		
		System.out.println(stkcl.getMin()+" is the minimum value..\n");
		
		stkcl.pop();
		
		stkcl.pop();
		stkcl.pop();
		stkcl.pop();
		System.out.println(stkcl.getMin()+" is the minimum value..");
		stkcl.pop();
		stkcl.pop();
	}

}
