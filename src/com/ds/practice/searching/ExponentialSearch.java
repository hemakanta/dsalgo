package com.ds.practice.searching;

import java.util.Arrays;

public class ExponentialSearch {

	public int exponentialSearch(int arr[], int n, int x)
	{
		// If x is present at firt location itself
		if (arr[0] == x)
			return 0;

		// Find range for binary search by
		// repeated doubling
		int i = 1;
		while (i < n && arr[i] <= x)
		{
			if(arr[i]==x)
			{
				return i;
			}
			i = i * 2;
		}

		// Call binary search for the found range.
		return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExponentialSearch exp = new ExponentialSearch();
		
		int arr[] = {3, 12, 23, 45, 48, 51, 55}; 
        int x = 48; 
        int result = exp.exponentialSearch(arr, arr.length, x); 
          
        System.out.println((result < 0) ?  
                            "Element is not present in array" : 
                            "Element is present at index " +  
                             result); 

	}

}
