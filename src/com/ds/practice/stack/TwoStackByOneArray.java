package com.ds.practice.stack;

public class TwoStackByOneArray {
	 int top1, top2, capacity;
	 int[] arr;
	 
	 public TwoStackByOneArray(int size) {
		 top1 = -1;
		 top2= capacity=size;
		 arr = new int[size];
	 }
	 
	 public void push1(int element){
		 if(top1 < top2-1) {
			 top1++;
			 arr[top1] = element;
			 System.out.println(element+ " pushed to stack-1");
		 }else {
			 System.out.println("Stack overflow !!!!");
		 }
	 }
	 
	 public void push2(int element){
		 
		 if(top2-1 > top1) {
			 top2--;
			 arr[top2] = element;
			 System.out.println(element+ " pushed to stack-2");
		 }else {
			 System.out.println("Stack overflow !!!!");
		 }
	 }
	 
	public void pop1() {
		if (top1 >= 0) {
			int x = arr[top1--];
			System.out.println(x+", popped from stack-1");
		} else {
			System.out.println("Stack-1 is empty...");
		}
	}
	 
	 public void pop2() {
		 if (top2 <= capacity-1) {
			 int x = arr[top2++];
			 System.out.println(x+", popped from stack-2");
		} else {
			System.out.println("Stack-2 is empty...");
		}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoStackByOneArray tstk = new TwoStackByOneArray(4);
		tstk.push1(1);
		tstk.push2(10);
		tstk.push1(2);
		tstk.push2(11);
		tstk.push1(3);
		tstk.push2(12);
		
		tstk.pop1();
		tstk.pop1();
		tstk.pop1();
		tstk.pop2();

	}

}
