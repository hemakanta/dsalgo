package com.ds.practice.arrays;

public class RotationAryByElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int LA[] =  { 1, 2, 3, 4, 5, 6, 7 };
		int size = LA.length, elmnt = 2;
		
		int LA2[] = new int[size];
		int i =0;
		System.out.println("Original array:");

		printArray(LA);
		/*
		 //1st approach
		int y=0, st =0;
		for (int j = 0; j < size; j++) 
		{
			if (elmnt>y) 
			{
				LA2[size-elmnt] = LA[j];
				elmnt--;
			}
			else
			{
				LA2[st]=LA[j];
				st++;
			}
		}*/
		
		// 2nd Approach
		for (i = 0; i < elmnt; i++)
		{
			int j, temp; 
	        temp = LA[0]; 
	        for (j = 0; j < size - 1; j++) 
	        	LA[j] = LA[j + 1]; 
	        LA[j] = temp; 
		}
			
		
		System.out.println("\nAfter change array:");
		printArray(LA);
		

	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
