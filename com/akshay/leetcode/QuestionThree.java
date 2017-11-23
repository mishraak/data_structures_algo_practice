package com.akshay.leetcode;

import java.math.BigInteger;
public class QuestionThree {	
	public static void main(String[] args) {
		BigInteger waysCount=findWays(610);
		System.out.println(waysCount);
	}
	
	public static BigInteger findWays(int n) {	
		//Define array to store previous results
		//Use BigInteger as even long type would overflow
		BigInteger[] dp = new BigInteger[n+1];
        
		//Initializing every element with 0
		for(int i=0; i<n+1; i++){
			dp[i]=BigInteger.valueOf(0);
		}
		
		//Initial values for first two cases
        dp[0] = dp[1] = BigInteger.valueOf(1);
        
        //Dynamic programming to keep adding prev value to obtain new value 
        for(int i=2; i<=n ; i++){
            for(int j=1; j<=6; j++)
                if(i - j >= 0)
                    dp[i] = dp[i].add(dp[i-j]);
        }
        
        return dp[dp.length-1];
	}	
}
