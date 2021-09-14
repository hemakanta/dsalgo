package com.ds.practice.sort;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arr[] = 64 25 12 22 11
		//11 12 22 25 64 
		int[] arr = new int[] {64, 25, 12, 22, 11,1,6,456,8986,3};
		System.out.println("Before sort");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		int size = arr.length;
		int temp = 0;
		for(int i=0; i<size;i++)
		{
			temp = arr[i];
			for (int j = i+1; j < size; j++) 
			{
				if (temp>arr[j]) 
				{
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("\n\nAfter sort ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
