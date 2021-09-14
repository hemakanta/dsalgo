package com.ds.practice.searching;

public class InterpolationSearch {
	
	public int interpolationSearch(int x, int[] arr) 
    { 
        // Find indexes of two corners 
        int lo = 0, hi = (arr.length - 1);
        int count = 1;
       
        // Since array is sorted, an element present 
        // in array must be in range defined by corner 
        while (lo <= hi && x >= arr[lo] && x <= arr[hi]) 
        {      
        	System.out.println("No of time exicute: "+ count++);
  
            if (lo == hi) 
            { 
                if (arr[lo] == x) return lo; 
                return -1; 
            } 
         
            // Probing the position with keeping 
            // uniform distribution in mind. 
              
			int pos = lo + ( ((hi - lo)*(x - arr[lo]))/ (arr[hi] - arr[lo]) );
       
            // Condition of target found 
            if (arr[pos] == x) 
                return pos; 
       
            // If x is larger, x is in upper part 
            if (arr[pos] < x) 
                lo = pos + 1; 
       
            // If x is smaller, x is in the lower part 
            else
                hi = pos - 1; 
        } 
        return -1; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 
                24, 33, 35, 42, 47}; 
		
		InterpolationSearch intSearch = new InterpolationSearch();
		
		int index = intSearch.interpolationSearch(47, arr);
		
		// If element was found 
        if (index != -1) 
              System.out.println("Element found at index " + index); 
           else
              System.out.println("Element not found."); 

	}

}
