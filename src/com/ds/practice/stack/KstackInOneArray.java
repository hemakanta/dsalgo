package com.ds.practice.stack;

import java.util.Arrays;

public class KstackInOneArray {
	
	int[] arr;
	int arrSize, noOfStack, avlPntr;
	int[] stkTop;
	int[] arrLink;
	
	public KstackInOneArray(int size, int kstk) {
		arr = new int[size];
		arrLink = new int[size];
		stkTop = new int[kstk];
		
		for(int i = 0; i<kstk; i++) {
			stkTop[i] = -1;
		}
		for(int i = 0; i<size-1; i++) {
			arrLink[i] = i+1;
		}
		arrLink[size-1] = -1;
		avlPntr = 0;
	}
	
	public void pop(int stkNum) {
		int top = stkTop[stkNum-1];
		int val = arr[top];
		arr[top] = -0;
		System.out.println("\nValue "+val+" removed from stack-"+stkNum);
		arrLink[top] = avlPntr;
		avlPntr = top;
		
		System.out.print("\n After removed items as--");
		Arrays.stream(arr).forEach(ele -> System.out.print(" "+ele));
	}
	
	public void push(int element, int stkNum) {
		if(avlPntr == -1) {
			System.out.println("\nStack overflow!!!!");
			return;
		}
		
		int freAvl = avlPntr;
		avlPntr = arrLink[freAvl];
		
		int top = stkTop[stkNum-1];
		arr[freAvl] = element;
		
		int link =  arrLink[freAvl];
		arrLink[freAvl] = top;
		top = freAvl;
		stkTop[stkNum-1] = top;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KstackInOneArray kstk =  new KstackInOneArray(10, 3);
		
		kstk.push(10, 1);
		kstk.push(11, 1);
		kstk.push(12, 1);
		
		Arrays.stream(kstk.arr).forEach(ele -> System.out.print(" "+ele));
		kstk.push(14, 2);
		kstk.push(15, 2);
		kstk.push(16, 2);
		kstk.push(17, 2);
		
		System.out.print("\n");
		Arrays.stream(kstk.arr).forEach(ele -> System.out.print(" "+ele));
		kstk.pop(1);
		
		kstk.push(18, 3);
		kstk.push(19, 3);
		kstk.push(20, 3);
		kstk.push(21, 3);
		
		System.out.print("\n");
		Arrays.stream(kstk.arr).forEach(ele -> System.out.print(" "+ele));
		kstk.push(22, 3);
	}

}
