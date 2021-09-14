package com.ds.practice.stack;

class StackArr
{
	static final int MAX=1000;
	int top;
	
	int[] stk = new int[MAX];
	
	StackArr()
	{
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top <0);
	}
	
	boolean push(int data)
	{
		if (top>=MAX-1) 
		{
			System.out.println("Stack is overflow");
			return false;
		}
		else
		{
			stk[++top]=data;
			System.out.println(data+ " pushed to stack." );
			return true;
		}
	}
	
	int pop()
	{
		if (top<0) {
			System.out.println("Stack is under flow.");
			return 0;
			
		}
		else
		{
			return stk[top--];
		}
	}
	
	int peek()
	{
		if (top<0) {
			System.out.println("Stack is underflow.");
			return 0;
			
		}
		else
		{
			int x = stk[top];
			return x;
		}
	}
}

public class ArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArr stk = new StackArr();
		stk.push(21);
		stk.push(34);
		stk.push(56);
		stk.push(367);
		
		System.out.println(stk.pop() + " poped from Stack.");
		
		System.out.println(stk.peek() + " peek data in Stack.");

	}

}
