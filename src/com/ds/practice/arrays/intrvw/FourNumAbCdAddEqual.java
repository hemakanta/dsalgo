package com.ds.practice.arrays.intrvw;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Given an array of distinct integers, 
find if there are two pairs (a, b) and (c, d) 
such that a+b = c+d, and a, b, c and d are distinct elements. 
If there are multiple answers, then print any of them.
Example:
Input:   {3, 4, 7, 1, 2, 9, 8}
Output:  (3, 8) and (4, 7)
Explanation: 3+8 = 4+7

Input:   {3, 4, 7, 1, 12, 9};
Output:  (4, 12) and (7, 9)
Explanation: 4+12 = 7+9

Input:  {65, 30, 7, 90, 1, 9, 8};
Output:  No pairs found

Input:
2
7
3 4 7 1 2 9 8
7
65 30 7 90 1 9 8
Output:
1
0
 */
public class FourNumAbCdAddEqual {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc =new Scanner(System.in);
		int tc= Integer.parseInt(sc.nextLine());
		int ar[]  = null;
		
		while(tc-->0)
		{
			boolean flag =false;
			int size = Integer.parseInt(sc.nextLine());
			Map<Integer, Pair> mapData = new HashMap<>();
			int sum = 0;
			ar = new int[size];
			String str = sc.nextLine();
			String st[] = str.trim().split("\\s+");
			
			for (int i = 0; i < st.length; i++) {
				ar[i]=Integer.parseInt(st[i]);
			}
			
			for (int i = 0; i < size; i++) 
			{
				for (int j = i+1; j < size; j++) 
				{
					sum = ar[i]+ar[j];
					if (!mapData.isEmpty() && mapData.containsKey(sum)) 
					{
						if (mapData.get(sum).firstNum != ar[i] && mapData.get(sum).secondNum!=ar[j]) 
						{
							System.out.println("\n"+ar[i]+", "+ar[j]);
							System.out.println(mapData.get(sum).firstNum+", "+mapData.get(sum).secondNum);;
							flag=true;
							break;
						}
					}
					else
					{
						Pair pair = new Pair(ar[i], ar[j]);
						mapData.put(sum, pair);
					}
				}
				if (flag)
					break;
			}
			System.out.println("\n");
			System.out.print((flag ? 1 : 0));
		}
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println("\n"); 
    } 
	
	public static void findNum(int arr[])
	{
		int sum =0;
		int size = arr.length;
		Map<Integer, Pair> mapData = new HashMap<>();
		boolean flag = false;
		
		for (int i = 0; i < size; i++) 
		{
			for (int j = i+1; j < size; j++) 
			{
				sum = arr[i]+arr[j];
				if (!mapData.isEmpty() && mapData.containsKey(sum))
				{
					if (mapData.get(sum).firstNum != arr[i] && mapData.get(sum).secondNum != arr[j]) 
					{
						flag =true;
						break;
					}
				}
				else
				{
					Pair datePairMatch = new Pair(arr[i], arr[j]);
					mapData.put(sum, datePairMatch);
				}
				
			}
			if (flag)
				break;
		}
		System.out.print((flag ? 1: 0));
		
	}
	
	
	public static class Pair
	{
		int firstNum, secondNum;
		public Pair(int x, int y) 
		{
			// TODO Auto-generated constructor stub
			firstNum = x;
			secondNum = y;
		}
		
	}

}
