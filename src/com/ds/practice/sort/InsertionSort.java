package com.ds.practice.sort;
/**
 Another Example:
12, 11, 13, 5, 6

Let us loop for i = 1 (second element of the array) to 4 (last element of the array)

i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
11, 12, 13, 5, 6

i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
11, 12, 13, 5, 6

i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
5, 11, 12, 13, 6

i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
5, 6, 11, 12, 13 
 */
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {12, 11, 13, 5, 6};
		System.out.println("Before sort");
		System.out.println(Arrays.toString(arr));
		/*for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		
		insertSort(arr);
		
		//insortRecursive(arr, arr.length);
		
		System.out.println("\nAfter sort ");
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertSort(int[] arr)
	{
		int size = arr.length;
		int temp = 0;

		for (int i = 1; i < size; ++i) 
		{
			temp = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > temp) 
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		
		/*System.out.println("\n\nAfter sort ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
	}
	
	static void insortRecursive(int[] arr, int n)
	{
		if(n<=1)
			return;
		
		insortRecursive(arr, n-1);
		
		int last = arr[n-1];
		int j=n-2;
		
		while(j>=0 && arr[j]>last)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=last;
		
	}

}
