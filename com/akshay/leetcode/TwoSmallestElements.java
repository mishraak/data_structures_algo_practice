package com.akshay.leetcode;

public class TwoSmallestElements {
	public static void main(String[] args) {				
		int[] smallOnes = new int[] {-3,2,5,6,8};
		for (int each : findTwoSmallest(smallOnes) ) System.out.println(each); 			
	}

	private static int[] findTwoSmallest(int[] is) {
		int sm1=is[0],sm2=is[1];
		for(int i=0; i<is.length; i++) if(is[i]<sm1) sm1=is[i];
		for(int i=0; i<is.length; i++) if(is[i]<sm2) if(is[i]>sm1) sm2=is[i];							
		return new int[] {sm1,sm2};
	}
	
	
	

}
