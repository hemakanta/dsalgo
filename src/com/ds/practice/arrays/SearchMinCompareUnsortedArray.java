package com.ds.practice.arrays;

public class SearchMinCompareUnsortedArray {

	public static void main(String[] args) 
	{
		
		int[] arr = new int[] {4, 6, 1, 5, 8};
		int key= 6;
		int size = arr.length;
        System.out.println(searchKey(arr, size, key)); 

	}
	
	public static String searchKey(int[] arr, int size, int key)
	{
		if(key==arr[size-1])
			return "Found";
		
		int backUp = arr[size-1];
		arr[size-1] = key;
		
		for (int i = 0; ; i++) 
		{
			if (key==arr[i])
			{
				arr[size-1]=backUp;
				
				if(i<size-1)
				{
					return "Found "+key;
				}
				return "Not Found "+key;
			}
		}
	}

}
