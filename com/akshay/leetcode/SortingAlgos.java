package com.akshay.leetcode;

public class SortingAlgos {

	private static int[] insertionSort(int[] nums) {		
		for(int i=1; i<nums.length;i++) {
			for(int j=i; j>0; j--){
				if(nums[j-1]>nums[j]) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
	
	
	private static int[] bubbleSort(int[] nums) {				
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}		
		}
		return nums;
	}
	
	
	private static int[] selectionSort(int[] nums) {				
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}		
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] input = new int[] {8,7,6,5,4,3,2,1};
		
		for(int ele : insertionSort(input)) 	System.out.print(ele + " ");
		System.out.println("\n");
		for(int ele : bubbleSort(input)) 	System.out.print(ele + " ");
		System.out.println("\n");
		/*		
		for(int ele : selectionSort(input)) 	System.out.println(ele);
		for(int ele : megreSort(input)) 		System.out.println(ele);
		for(int ele : quickSort(input)) 		System.out.println(ele);
		*/		
	}

}
