package com.ds.practice.arrays;

public class RevRotntnByElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int LA[] =  { 1, 2, 3, 4, 5, 6, 7 };
		int size = LA.length, revsize = 4;
		
		int LA2[] = new int[size];
		int i =0;
		System.out.println("Original array:");
		printArray(LA);
		
		reverseAr(LA, 0, revsize-1);
		reverseAr(LA, revsize, size-1);
		reverseAr(LA, 0, size-1);
		

		System.out.println("\nAfter change array:");
		printArray(LA);

	}
	
	public static void reverseAr(int[] arr, int strtSize, int endSize)
	{
		int temp= 0;
		while(strtSize <= endSize)
		{
			temp = arr[strtSize];
			arr[strtSize] = arr[endSize];
			arr[endSize] = temp;
			strtSize++;
			endSize --;
		}
	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
