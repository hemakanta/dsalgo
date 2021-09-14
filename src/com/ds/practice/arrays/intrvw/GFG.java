package com.ds.practice.arrays.intrvw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class GFG
 {
	public static void main (String[] args) throws IOException 
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
        
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine()); 
  
            // Declaring array 
            int arr[] = new int[n]; 
  
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++) 
                arr[i] = Integer.parseInt(strs[i]); 
                
                boolean joy=false;
        HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
                for(int i=0;i<n-1;i++)
                {
                    for(int j=i+1;j<n;j++)
                    {
                        int b=(arr[i]+arr[j]);
                        if(m.containsKey(b))
                        {
                            joy=true;
                            break;
                        }
                        else{
                        m.put(arr[i]+arr[j],b+1);}
                        
                    }
                    if(joy==true)
                    {
                        break;
                    }
                }
                System.out.println((joy?1:0));
        }
	 }
}