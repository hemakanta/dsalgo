package com.ds.practice.dynamicProgram;

public class MaxNumExcludeAdjacent {
	
	public static int maxNum(int[] arr) {

		int size = arr.length;
		int incl = arr[0];
		int excl=0, temp = 0;
		
		for(int i =1; i<size; i++) {
			
			temp = Math.max(incl, excl);
			//temp = excl > incl ? excl : incl;
			incl = excl+arr[i];
			excl = temp;
		}
		
		return Math.max(incl, excl); //(excl > incl ? excl : incl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6, 7, 1, 3, 8, 2, 4};
		System.out.println("Max number with out adjacent: "+ maxNum(arr));

	}

}
