package com.ds.practice.searching;

public class FibonacciSearch {

	public static int min(int x, int y) {
		return (x <= y) ? x : y;
	}

	/* Returns index of x if present, else returns -1 */
	public static int fibMonaccianSearch(int arr[], int x, int n) {

		/* Initialize fibonacci numbers */
		int fibMMm2 = 0; // (m-2)'th Fibonacci No.
		int fibMMm1 = 1; // (m-1)'th Fibonacci No.
		int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci

		/*
		 * fibM is going to store the smallest Fibonacci Number greater than or equal to
		 * n
		 */
		while (fibM < n) {
			fibMMm2 = fibMMm1;
			fibMMm1 = fibM;
			fibM = fibMMm2 + fibMMm1;
		}

		// Marks the eliminated range from front
		int offset = -1;
		
		int count =1;

		/*
		 * while there are elements to be inspected. Note that we compare arr[fibMm2]
		 * with x. When fibM becomes 1, fibMm2 becomes 0
		 */
		while (fibM > 1) {
			// Check if fibMm2 is a valid location
			int i = min(offset + fibMMm2, n - 1);
			
			System.out.println("No of time execution: "+ count++);

			/*
			 * If x is greater than the value at index fibMm2, cut the subarray array from
			 * offset to i
			 */
			if (arr[i] < x) {
				fibM = fibMMm1;
				fibMMm1 = fibMMm2;
				fibMMm2 = fibM - fibMMm1;
				offset = i;
			}
			else if (arr[i] > x)   // If x is less than the value at index fibMm2, cut the subarray after i+1
			{
				fibM = fibMMm2;
				fibMMm1 = fibMMm1 - fibMMm2;
				fibMMm2 = fibM - fibMMm1;
			}
			else /* element found. return index */
				return i;
		}

		/* comparing the last element with x */
		if (fibMMm1 == 1 && arr[offset + 1] == x)
			return offset + 1;

		/* element not found. return -1 */
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 10, 12, 16, 19, 25, 30, 38, 45, 50,55,67,68,78,79,80,82,83,84,85,86,87,88 };
		int x = 38;
		System.out.print("Found at index: " + fibMonaccianSearch(arr, x, arr.length));

	}

}
