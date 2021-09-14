package com.ds.practice.arrays.intrvw;

import java.util.Arrays;

public class MaxSumSubArray {
	
	public static int maxSumOfSubArray(int[] A)
	{
		// stores maximum sum sub-array found so far
		int maxSoFar = 0;

		// stores maximum sum of sub-array ending at current position
		int maxEndingHere = 0;
		
		
		//--------------- This is for, if all the elements are -ve
		int max= Arrays.stream(A).max().getAsInt();
		if(max<0)
			return max;
		//-------------

		// traverse the given array
		for (int i: A)
		{
			// update maximum sum of sub-array "ending" at index i (by adding
			// current element to maximum sum ending at previous index i-1)
			maxEndingHere = maxEndingHere + i;

			// if maximum sum is negative, set it to 0 (which represents
			// an empty sub-array)
			maxEndingHere = Integer.max(maxEndingHere, 0);

			// update result if current sub-array sum is found to be greater
			maxSoFar = Integer.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}
	
		// Function to print contiguous subarray with the largest sum
		// in given set of integers
		public static void numOfSubArrayWithMaxSum(int[] A)
		{
			// stores maximum sum sub-array found so far
			int maxSoFar = 0;

			// stores maximum sum of sub-array ending at current position
			int maxEndingHere = 0;

			// stores end-points of maximum sum sub-array found so far
			int start = 0, end = 0;

			// stores starting index of a positive sum sequence
			int beg = 0;

			// traverse the given array
			for (int i = 0; i < A.length; i++)
			{
				// update maximum sum of sub-array "ending" at index i
				maxEndingHere = maxEndingHere + A[i];

				// if maximum sum is negative, set it to 0
				if (maxEndingHere < 0)
				{
					maxEndingHere = 0;	// empty sub-array
					beg = i + 1;
				}

				// update result if current sub-array sum is found to be greater
				if (maxSoFar < maxEndingHere)
				{
					maxSoFar = maxEndingHere;
					start = beg;
					end = i;
				}
			}

			System.out.println("The sum of contiguous sub-array with the " +
								"largest sum is " +	maxSoFar);

			System.out.print("The contiguous sub-array with the largest sum is ");
			for (int i = start; i <= end; i++) {
				System.out.print(A[i] + " ");
			}
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println("The sum of contiguous sub-array with the " +
							"largest sum is " + maxSumOfSubArray(A));
		
		//numOfSubArrayWithMaxSum(A);

	}

}
