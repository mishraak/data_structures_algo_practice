package com.akshay.leetcode;

import java.util.Arrays;

public class LongestSequence {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,1,2}, {7,7,2,5},{6,4,3,4}, {1,2,2,5}};
		System.out.println(longestSnake(matrix));
	}

	private static int longestSnake(int[][] matrix) {
		int max=0;
		int m=matrix.length, n=matrix[0].length;		
		int dp[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				dp[i][j]=1;
			}
		}
		
		for(int i=0; i<m; i++) System.out.println(Arrays.toString(dp[i]));
		System.out.println("--------------------------------------------");
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i!=0 || j!=0) {
					if(i>0 && Math.abs(matrix[i-1][j]-matrix[i][j])==1) {
						dp[i][j]=Math.max(dp[i][j], 1+dp[i-1][j]);						
					}
					if(j>0 && Math.abs(matrix[i][j-1]-matrix[i][j])==1) {
						dp[i][j]=Math.max(dp[i][j], 1+dp[i][j-1]);						
					}					
					max=Math.max(max, dp[i][j]);
				}
			}
		}
		
		for(int i=0; i<m; i++) System.out.println(Arrays.toString(dp[i]));
		System.out.println("--------------------------------------------");
		return max;
	}

}
