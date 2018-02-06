package com.akshay.leetcode;

public class MedianOfSortedArrays {
				
	public static double findMedian(int[] a, int a_start, int a_end, int[] b, int b_start, int b_end) {
		
		if(a_end-a_start+1==2 && b_end-b_start+1==2)
			return (Math.max(a[a_start], b[b_start]) + Math.min(a[a_end], b[b_end]))/2;
		
		double median_a = getMedian(a, a_start, a_end);
		double median_b = getMedian(b, b_start, b_end);
		
		int a_mid=(a_start+a_end)/2;
		int b_mid=(b_start+b_end)/2;
		
		if(median_a > median_b) 
			return findMedian(a, a_start, a_mid, b, b_mid, b_end);
		else 
			return findMedian(a, a_mid, a_end, b, b_start, b_mid);				
	}
		
	
	private static double getMedian(int[] a, int a_start, int a_end) {
		int size = a_end-a_start+1;
		
		if(size%2==0) {
			return (a[a_start + size/2] + a[a_start + (size-1)/2])/2;
		}
		else {
			return a[a_start + (size-1)/2];
		}		
	}


	public static void main(String[] args) {		
		System.out.println(findMedian(new int[] {2,6,9,10,11}, 0, 4, new int[] {1,5,7,12,15}, 0, 4));
	}
}
