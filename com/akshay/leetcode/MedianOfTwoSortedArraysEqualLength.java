package com.akshay.leetcode;

public class MedianOfTwoSortedArraysEqualLength {

	public static void main(String[] args) {
		int[] ip1 = new int[] {1,2,3,4};
		int[] ip2 = new int[] {6,7,8,9};
		
		System.out.println(findMedian(ip1,0, ip1.length-1, ip2, 0, ip2.length-1));		
	}
	
	private static float findMedian(int[] ip1, int s1, int e1, int[] ip2, int s2, int e2) {
		if(e1-s1==1 && e2-s2==1) {
			int f1 = Math.max(ip1[s1], ip2[s2]);			
			int f2 = Math.min(ip1[e1], ip2[e2]);
			System.out.print("f1 " + f1 + " f2 " + f2 + "\n");
			return (float) ((f1+f2)/2.0);
		}
			
		int mid1=(s1 + e1)/2, mid2=(s2 + e2)/2;
		
		float median1 = getMedian(ip1, s1,e1);
		System.out.println();
		float median2 = getMedian(ip2, s2,e2);
		
		if(median1>median2) 
			return findMedian(ip1, s1, mid1, ip2, mid2, e2);
		else 
			return findMedian(ip1, mid1, e1, ip2, s2, mid2);		
	}
	
	private static float getMedian(int[] input, int s, int e) {
		int size=e-s+1;
		
		if(size%2==0) return (input[s+(size/2)] + input[s+((size-1)/2)])/2;
		else return input[s + ((size-1)/2)];
		
	}
	
	
	

}
