package com.ds.practice.arrays.intrvw;

/*
 * Given an array of numbers, replace each number with the  
 * product of all the numbers in the array except the 
 * number itself *without* using division.
 */

/*
 Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator in O(n) time.
Example :

Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array 
elements except 10 is 180
10 * 5 * 6 * 2 product of other array 
elements except 3 is 600
10 * 3 * 6 * 2 product of other array 
elements except 5 is 360
10 * 3 * 5 * 2 product of other array 
elements except 6 is 300
10 * 3 * 6 * 5 product of other array 
elements except 2 is 900
 */
public class ProductArray {
	
	public static void productArrayValue(int arr[], int n) 
    { 
  
        // Base case 
        if (n == 1) { 
            System.out.print("0"); 
            return; 
        } 
  
        int i, temp = 1; 
  
        /* Allocate memory for the product array */
        int prod[] = new int[n];
        
        //Arrays.fill(prod, 1);
  
        /* Initialize the product array as 1 */
        for (int j = 0; j < n; j++) 
            prod[j] = 1; 
  
        /* In this loop, temp variable contains product of 
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) { 
            prod[i] = temp; 
            temp = temp*arr[i]; 
        } 
  
        /* Initialize temp to 1 for product on right side */
        temp = 1; 
  
        /* In this loop, temp variable contains product of 
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) { 
            prod[i] = prod[i]*temp; 
            temp = temp*arr[i]; 
        } 
  
        /* print the constructed prod array */
        for (i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
  
        return;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = { 10, 3, 5, 6, 2 }; 
        int n = arr.length; 
        System.out.println("The product array is : "); 
        productArrayValue(arr, n);

	}

}
