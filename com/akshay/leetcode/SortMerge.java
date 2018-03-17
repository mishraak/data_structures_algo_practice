package com.akshay.leetcode;

public class SortMerge {

	public static void main(String[] args) {
		int[] arr = new int[] {6,5,4,3,2,1};
		for(int i : mergeSort(arr,0, arr.length-1)) System.out.print(i+" "); System.out.println("\n");		
		//for(int i : merge(new int[] {3,2,1}, new int[] {6,5,4})) System.out.println(i);		
	}

	private static int[] mergeSort(int[] nums, int st, int end) {
		if(st==end) 
			return new int[] {nums[st]};
		else if(end-st==1) {
			int min=Math.min(nums[st], nums[end]);
			int max=Math.max(nums[st], nums[end]);
			return new int[] {min, max};
		}
		else {
			int mid=st+(end-st)/2;
			//before mid
			int[] first = mergeSort(nums, 0, mid); 
			//after mid			
			int[] last = mergeSort(nums,mid+1, end);			
			
			return merge(first, last);
		} 				
	}

	private static int[] merge(int[] first, int[] last) {		
		for(int i : first)  System.out.print(i); System.out.println("\n");
		for(int i : last)  System.out.print(i); System.out.println("\n");
		
		int [] result = new int[first.length + last.length];
		int i=0,j=0,id=0;
		while(i<first.length && j<last.length) {			
			if(first[i]<=last[j]) 
				result[id++]=first[i++];
			else
				result[id++]=last[j++];						
		}
		if(i==first.length) while(j<last.length) result[id++]=last[j++];
		else if(j==last.length) while(i<first.length) result[id++]=first[i++];				
		return result;		
	}
}
