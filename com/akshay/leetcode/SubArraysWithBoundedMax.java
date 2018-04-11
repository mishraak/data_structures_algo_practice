package com.akshay.leetcode;

public class SubArraysWithBoundedMax {	
	private static int countSub(int[] nums, int l, int u) {
		int count=0;
		int currentMax=Integer.MIN_VALUE;
		
		for (int st=0,end=0; end<nums.length && st<nums.length;){
			currentMax=Math.max(currentMax, nums[end]);
			//System.out.println("nums[end] :" + nums[end]);
			//System.out.println("Current Max :" + currentMax);
			if(currentMax<=u && currentMax>=l) {
				count++; 
				//System.out.println("count incremented to :" + count);
				end++;
				//System.out.println("end incremented to :" + end);
				//System.out.println("start is :" + st);
			}
			else if(currentMax<l || currentMax>u) {
				st++; 
				//System.out.println("start incremented to : " + st);
				end=st;
				//System.out.println("end updated to : " + end);
				currentMax=nums[end];
				//System.out.println("Current Max :" + currentMax);
			}			
		}		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countSub(new int[] {2,1,4,3}, 2,3));
	}
}
