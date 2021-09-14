package com.ds.practice.arrays;

public class RotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {12,44,6,9,12,67,4,1};
		int rotate = 3;
		int size = arr.length;
		int[] rotateArray = new int[size];
		int count =rotate;
		int j =0;
		
		System.out.println("Before rotating: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < size; i++) 
		{
			if (i<rotate)
			{
				rotateArray[size-count]=arr[i];
				count--;
			}
			else
			{
				rotateArray[j]=arr[i];
				j++;
			}
		}
		
		System.out.println("\nAfetr rotating: ");
		for (int i = 0; i < rotateArray.length; i++) {
			System.out.print(rotateArray[i]+" ");
		}
		
	
		
		

	}

}
