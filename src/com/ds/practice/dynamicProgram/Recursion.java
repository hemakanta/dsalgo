package com.ds.practice.dynamicProgram;

public class Recursion {
	
	int[] lookup;
	int NIL =-1;
	public void initialize(int n)
	{
		lookup = new int[n+1];
		for(int i=0; i<=n; i++)
			lookup[i]=NIL;
	}
	
	public int recursive(int n)
	{
		if(lookup[n] == NIL)
		{
			if(n <= 1)
			{
				lookup[n]=n;
			}
			else
			{
				lookup[n]= recursive(n-1)+recursive(n-2);
			}
		}
		
		return lookup[n];
	}
	
	public int fact(int n, int res)
	{
		if(n==0)
			return res;
		
		res = n*(n-1);
		fact(n-1, res);
		return res;
	}
	
	public static void main(String[] args) {
		
		Recursion f = new Recursion(); 
	    int n = 4;
	    int res = 0;
		/*f.initialize(n); 
		System.out.println("Fibonacci number is" + " " + f.recursive(n)); */
	    System.out.println("Fibonacci number is" + " " + f.fact(n, res));
	    
	}

}
