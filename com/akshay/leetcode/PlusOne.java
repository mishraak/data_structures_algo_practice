package com.akshay.leetcode;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = new int[]{9,1,2,3};
		for(int j : plusOne(digits)){
			System.out.print(j);
		}
	}
	
	public static int[] plusOne(int[] digits) {    
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;	    
	    return newNumber;
	}
	
}
