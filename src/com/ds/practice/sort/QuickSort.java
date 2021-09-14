package com.ds.practice.sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 80, 30, 90, 40, 50, 70};
		 int n = arr.length;
		 System.out.println("Before sort: ");
		 printArray(arr);
		 sort(arr, 0, n-1);
		 
		 System.out.println("Sort array: ");
		 printArray(arr);

	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static void sort(int[] arr, int low, int high)
	{
		if (low<high) 
		{
			//printArray(arr);
			int val = partition(arr, low, high);
			sort(arr, low, val-1);
			//printArray(arr);
			sort(arr, val+1, high);
			//printArray(arr);
		}
	}
	
	public static int partition(int[] arr, int low, int high)
	{
		int i = low-1;
		int pivot = arr[high];
		int temp=0;
		
		for (int j = low; j < high; j++) 
		{
			if (arr[j]<pivot)
			{
				i++;
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		//printArray(arr);
		
		return i+1;
	}
}
