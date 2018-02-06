package com.akshay.leetcode;

public class HammingDistance {
	
	public static int hammingDistance(int x, int y) {		
		int i=0;				
		while(x > 0) {					
			if ((x & 1) > 0) i++;			
			x = x >>> 1;
		}			
		
		return Math.abs(i);
    }

	public static void main(String[] args) {
		System.out.println(hammingDistance(1,5));
	}
}
