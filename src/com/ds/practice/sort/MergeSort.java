package com.ds.practice.sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int arr[] = {12, 11, 13, 5, 6, 7}; 
		int arr[] ={38, 27, 43, 3, 9, 82, 10};
		  
        System.out.println("Given Array"); 
        printArray(arr);
  
        sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 

	}
	
	
	static void sort(int[] arr, int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
	}
	
	// Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
	static  void merge(int arr[], int l, int m, int r) 
    { 
		// size of two array
		int n1 = m-l+1;
		int n2 = r-m;
		
		// temp array
		int left[] =new int[n1];
		int rght[] = new int[n2];
		
		// copy data to temp
		for (int i = 0; i < n1; i++)
			left[i]=arr[l+i];
		
		for(int j=0; j<n2; ++j)
			rght[j]=arr[m+1+j];
		
		
		/* Merge the temp arrays */
		  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged sub-array array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (left[i] <= rght[j]) 
            { 
                arr[k] = left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = rght[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = rght[j]; 
            j++; 
            k++; 
        } 
			
		
    }
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}
