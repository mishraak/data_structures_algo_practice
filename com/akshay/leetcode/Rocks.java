package com.akshay.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Rocks {
	
	
	
	public static void main(String[] args) {
		int[] stones = new int[] {5,5,9,19,2,2};
		System.out.println(calculate(stones));
	}

	
	
	private static int calculate(int[] stones) {
		int max=0;
		int[] jamie = stones;
		System.out.println("jamie " + (Arrays.toString(jamie)));
		Arrays.sort(stones);
		int[] ned=stones;
		System.out.println("ned " + (Arrays.toString(ned)));
		int [] geoffrey = new int[ned.length]; 
		
		for(int i=0; i<ned.length; i++) geoffrey[i]=(jamie[i] + ned[i]);
		System.out.println("geoffrey before sorting :" + (Arrays.toString(geoffrey)));
		
		//Arrays.sort(geoffrey);
		//System.out.println("geoffrey after sorting :" + (Arrays.toString(geoffrey)));
		
		for(int i=0; i<geoffrey.length-1; i++) {
			if(geoffrey[i]==geoffrey[i+1]) {
				if(geoffrey[i]>max) max=i; 
			}
		}
		
		
		return max;
		
	}	    
}
