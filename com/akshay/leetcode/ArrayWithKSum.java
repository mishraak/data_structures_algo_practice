package com.akshay.leetcode;

public class ArrayWithKSum {

	public static void main(String[] args) {
		System.out.println(ksum(new int[] {2,3,4,9,12}, 13));
	}

	private static int ksum(int[] nums, int k) {
		if(nums.length==0 || k==0) return -1;
		int sum=0;		
		for(int start=0, end=0; start<=end && end<nums.length; ) {
			sum+=nums[end];
			if(sum==k) return start;
			else if(sum<k) { 	
					sum+=nums[end++];
					if(sum==k) return start;
				}
			else {
				sum-=nums[start++];
				if(sum==k) return start;
			}
		}		
		return -1;			
	}
}
