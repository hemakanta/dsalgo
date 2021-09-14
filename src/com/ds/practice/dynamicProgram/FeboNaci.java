package com.ds.practice.dynamicProgram;

public class FeboNaci {


	int i = 1;int output = 0;
	
	// top down approach
	public int feb(int n, int[] memoz) {
		System.out.println("Step: "+i+", 'n' value: "+ n);
		if(memoz[n] > 0) {
			return memoz[n];
		}
		if(n<=1) {
			i++;
			return n;
		}
		output = feb(n-1, memoz)+feb(n-2, memoz);
		memoz[n] = output;
		System.out.println("output: "+ output);
		return output;
		
	}
	
	// bottom up approach
	public int febBottomUp(int n) {
		//System.out.println("Step: "+i+", 'n' value: "+ n);
		if(n <= 1) {
		return n;
		}
		int[] lst = new int[n+1];
		lst[0] = 0;
		lst[1] = 1;
		for(int i = 2; i<=n; i++) {
			lst[i] = lst[i-1]+lst[i-2];
		}
		return lst[n];
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FeboNaci clsObj = new FeboNaci();
		int size = 4;
		int[] memoz = new int[size+1];
		int val = clsObj.feb(size, memoz);
		int val1 = clsObj.febBottomUp(size);
		System.out.println("Final Output by Top Down: "+ val);
		System.out.println("Final Output Bottom Up: "+ val1);

	}



}
