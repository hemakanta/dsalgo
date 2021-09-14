package com.ds.practice.arrays;

public class IntermediateArray {

	public IntermediateArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{2,5,10,34,1};
		int size = arr.length;
		int high = 0;
		int low = 0;
		
		for (int i = 0; i < size-1; i++) 
		{
			
			int l = arr[i];
			int m = arr[i+1];
			
			low = l<m ? l : m;
			high = l>m ? l : m;
			System.out.println("Intermediate elements between "
                    + low + " and " + high); 
			for (int j=low; j <= high; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		
		

	}

}
