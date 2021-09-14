package com.ds.practice.arrays;

import java.util.Arrays;
import java.util.List;

class ArrayDemo 
{

	public static void main(String[] args) 
	{
		/*Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while (test-- > 0) {
			
		}*/
		
		/*int[] arr = new int[]{12, 23, 57};
		int[] arr2 = {34, 56, 9};
		//arr = new int[3];
		char[] arch = {'s','d','e'};
		char[] cher = new char[] {'s','d','e'};
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}*/
		
		String[] cher = { "Karl", "Peter", "Lucas" };
		System.out.println("1st value: "+ cher[0]);
		
		List<String> dhf = Arrays.asList(cher);
		dhf.set(0, "Jublli");
		System.out.println("Val1: "+ dhf);
		
		String[] arrStr = dhf.toArray(new String[0]);
		System.out.println("Val2: "+ arrStr);
		
		for (String t : arrStr) {
            System.out.println(t);
        }
	}
}
