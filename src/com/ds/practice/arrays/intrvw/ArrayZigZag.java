package com.ds.practice.arrays.intrvw;

import java.util.Arrays;

public class ArrayZigZag {
	
	static void zigZag(int[] arr) 
    { 
        // Flag true indicates relation "<" is expected, 
        // else ">" is expected.  The first expected relation 
        // is "<" 
        boolean flag = true; 
          
        int temp =0; 
       
        for (int i=0; i<=arr.length-2; i++) 
        { 
            if (flag)  /* "<" relation expected */
            { 
                /* If we have a situation like A > B > C, 
                   we get A > B < C by swapping B and C */
                if (arr[i] > arr[i+1]) 
                { 
                    // swap 
                    temp  = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
                  
            } 
            else /* ">" relation expected */
            { 
                /* If we have a situation like A < B < C, 
                   we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1]) 
                { 
                    // swap 
                    temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
            } 
            flag = !flag; /* flip flag */
        } 
        
        Arrays.stream(arr).forEach(val-> System.out.print(" "+ val));
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
		zigZag(arr); */
		
		int lower = 52;
	    int upper = 56;
	    
	    System.out.println("Value: "+ ((upper-lower)>>1));
	}

}
