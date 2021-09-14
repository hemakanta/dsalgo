package com.ds.practice.dynamicProgram;

public class NoOfCoins {
	
	public static int numberCoins(int[] coinArr, int change)
	{
		int coinSize = coinArr.length;
		int[] lookUp = new int[change+1];
		
		lookUp[0]=0;
		for (int i = 1; i <= change; i++) 
			lookUp[i] = Integer.MAX_VALUE; 
		
		for(int i=1; i<=change; i++)
		{
			for (int j=0; j<coinSize; j++) {
				if(coinArr[j] <= i) {
					
					int sub = lookUp[i-coinArr[j]];
					if(sub != Integer.MAX_VALUE
							&& sub+1 < lookUp[i]) {
						
						lookUp[i]= sub+1;
					}
					
				}
				
			}
		}
		
		return lookUp[coinSize];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coins[] = {14}; 
        int V =993; 
        int result = numberCoins(coins, V);
        System.out.println ( "Minimum coins required is "+ (result != Integer.MAX_VALUE ? result : -1) ); 

	}

}
