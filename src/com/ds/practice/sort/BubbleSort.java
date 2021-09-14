package com.ds.practice.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arr[] = 64 25 12 22 11
		// 11 12 22 25 64
		int[] arr = new int[] { 15,51,34,2,8,23,456,1,67,89,87,99 };
		System.out.println("Before sort");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
		// 1. Buuble sort
		bubleSort(arr, arr.length);
		
		// Recursive sort
		//recursiveBubleSort(arr, arr.length);
		//System.out.print("\nrecursive sort");
		//printArray(arr, arr.length);
		
	}
	
	
	public static void bubleSort(int[] arr, int size)
	{
		int n = size;
		System.out.println("\nIteration for size : "+ arr.length);
		boolean flag = true;
		for (int i = 0; i < n - 1; i++)
		{
			flag = true;
			System.out.print(i+" ");
			for (int j = 0; j < n - i - 1; j++)
			{
				
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag =false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		
        printArray(arr, size);
	}
	
	
	public static void recursiveBubleSort(int[] arr, int size)
	{
		// Base case 
        if (size == 1) 
            return; 
        // One pass of bubble sort. After 
        // this pass, the largest element 
        // is moved (or bubbled) to end. 
        for (int i=0; i<size-1; i++) 
            if (arr[i] > arr[i+1]) 
            { 
                // swap arr[i], arr[i+1] 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
       
        // Largest element is fixed, 
        // recur for remaining array 
        recursiveBubleSort(arr, size-1);
        
        //printArray(arr, size);
	}
	
	/* Function to print an array */
	public static void printArray(int arr[], int n) 
	{ 
		System.out.println("\nAfter sort: ");
	    for (int i=0; i < n; i++) 
	    	System.out.print(arr[i] + " "); 
	} 
	

}
