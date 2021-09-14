package com.ds.practice.dynamicProgram;

public class DiffStaireCase {

	// Function to find the total number of 
    // different staircase that can made 
    // from N boxes 
    static int countStaircases(int N) 
    { 
        // DP table, there are two states. 
        // First describes the number of boxes 
        // and second describes the step 
        int [][] memo=new int[N + 5][N + 5]; 
      
        // Initilize all the elements of 
        // the table to zero 
        for (int i = 0; i <= N; i++) { 
            for (int j = 0; j <= N; j++) { 
                memo[i][j] = 0; 
            } 
        } 
      
        // Base case 
        memo[3][2] = memo[4][2] = 1; 
      
        for (int i = 5; i <= N; i++) { 
            for (int j = 2; j <= i; j++) { 
      
                // When step is equal to 2 
                if (j == 2) { 
                    memo[i][j] = memo[i - j][j] + 1; 
                } 
                // When step is greater than 2 
                else { 
                    memo[i][j] = memo[i - j][j] +  
                                memo[i - j][j - 1]; 
                } 
            } 
        } 
      
        // Count the total staircase 
        // from all the steps 
        int answer = 0; 
        for (int i = 1; i <= N; i++)  
            answer = answer + memo[N][i];  
      
        return answer; 
    } 
      
    // Driver Code 
    public static void main(String [] args) 
    { 
        int N = 5; 
      
        System.out.println("Np of ways: "+countStaircases(N)); 
      
          
    } 

}
