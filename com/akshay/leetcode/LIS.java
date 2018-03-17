package com.akshay.leetcode;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		lis(new int[] {10, 22, 9, 33, 21, 50, 41, 60, 80});
	}

	private static void lis(int[] nums) {		
		int n=nums.length;	
		
		int dp[] = new int[n];
		int max=1;
		for(int i=0; i<n; i++) dp[i]=1;		
		//System.out.println(Arrays.toString(nums));		
		
		for(int i=1; i<nums.length; i++) {
			for(int j=0; j<=i; j++) {
				if(nums[i] > nums[j]) {
					dp[i]=Math.max(dp[j]+1, dp[i]);
					max=Math.max(dp[i], max);
				}
			}
		}
		
		System.out.println(max);
	}
}
