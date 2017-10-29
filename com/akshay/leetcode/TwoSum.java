package com.akshay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {		
		
	}
	

	    public int[] twoSum(int[] nums, int target) { 
	            
	            int[] arr=new int[2];
	            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	            for(int i=0;i<nums.length;i++){
	                if (map.containsKey(target-nums[i])){
	                    arr[1]=i;
	                    arr[0]=map.get(target-nums[i]);
	                    return arr;
	                }                                    
	                    map.put(nums[i], i);
	            }
	        
	            return arr;
	   }	
}
