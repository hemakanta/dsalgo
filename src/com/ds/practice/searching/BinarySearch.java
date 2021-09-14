package com.ds.practice.searching;

public class BinarySearch {

	int recursiveBinarySearch(int arr[], int l, int r, int x, int count) 
    { 
        if (r >= l && x >= arr[l] && x<=arr[r]) 
        { 
            //int mid = (l + r) / 2; 
            int mid = l+(r-l)/2;
            count++;
            System.out.println("no of exicution: "+ count);
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return recursiveBinarySearch(arr, l, mid - 1, x, count); 
  
            // Else the element can only be present 
            // in right subarray 
            return recursiveBinarySearch(arr, mid + 1, r, x, count); 
        }
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
	
	int iterativeBinarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length-1;
        int m =0;
        int count = 1;
        while (l <= r) 
        {
        	if (x==arr[m]) {
				return m;
			}
        	System.out.println("No of execution: "+ count++);
            m = l + (r - l) / 2; 
  
            // If x greater, ignore left half 
            if (x>arr[m])
            {
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
        }
       
        // Check if x is present at mid 
        if (arr[m] == x) 
            return m; 
  
        // if we reach here, then element was 
        // not present 
        return -1;
        
        
        /*
         * 
         int l = 0, r = arr.length;
         int m =0;
         int count = 1;
        while( r - l > 1 ) 
        { 
        	System.out.println("No of execution: "+ count++);
            m = l + (r-l)/2; 
      
            if( arr[m] <= x) 
                l = m; 
            else
                r = m; 
        } 
      
        if( arr[l] == x) 
            return l; 
        else
            return -1;*/
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch();
        int count = 0;
        int arr[] = {5, 10, 12, 16, 19, 25, 30, 38, 45, 50,55,67,68,78,79,80,82,83,84,85,86,87,88}; 
        	//{1,5,9,13,20,23,30,32,33,36,76,78,79,80,81}; 
        int n = arr.length; 
        int x = 38; 
        //int result = ob.recursiveBinarySearch(arr, 0, n - 1, x, count); 
        
        int result = ob.iterativeBinarySearch(arr,x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result);
    } 

}
