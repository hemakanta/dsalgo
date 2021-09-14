package com.ds.practice.arrays;

public class HighestValue {

	public HighestValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrNum = {35, 11, 20, 4, 45};
		int highVal = arrNum[0];
		int size = arrNum.length;
		int highVal2nd = 0;
		int highVal3rd = 0;
		for (int i = 1; i < arrNum.length; i++) 
		{
			if (highVal < arrNum[i]) 
			{
				highVal3rd = highVal2nd;
				highVal2nd = highVal;
				highVal = arrNum[i];
			}
			else if(highVal2nd < arrNum[i])
			{
				highVal3rd = highVal2nd;
				highVal2nd = arrNum[i];
			}
			else if(highVal3rd < arrNum[i])
			{
				highVal3rd = arrNum[i];
			}
		}
		System.out.println("Highest Value: "+ highVal);
		System.out.println("2nd high value: "+ highVal2nd);
		System.out.println("3rd high value: "+ highVal3rd);
		
		

	}

}
