package com.ds.practice.stack;

public class StackMyDemoClass {
	 public static final int MAX = 2000;
	 int[] stackArray = new int[MAX];
	 int top;
	 public StackMyDemoClass() {
		// TODO Auto-generated constructor stub
		 top = -1;
	}
	 
	 public boolean isEmpty() {
		 return (top < 0);
	 }
	 
	 public boolean isFull() {
		 return (top> MAX-1);
	 }
	 
	 public int push(int data)
	 {
		 if(isFull())
		 {
			 throw new RuntimeException("Stack is full..");
		 }
		 else
			 stackArray[++top]=data;
			 
		 return 1;
	 }
	 
	 public int pop() {
		 if(isEmpty()) {
			 System.out.println("Empty...");
			return 0;
		 }
		 return stackArray[top--];
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
