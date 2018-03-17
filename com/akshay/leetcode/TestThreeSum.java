package com.akshay.leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestThreeSum {
	public static void main(String[] args) {
		System.out.println("Printing list of numbers who sum up to 0.\n");
		for(List<Integer> l : threeSum(new int[] {3,2,-1,-2,5,-7,1,2})) {
			System.out.println(l);
		}
	}
		
	
	    public static List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);        
	        List<List<Integer>> result = new ArrayList<>();                
	        if(nums.length<3) return result;
	        int i=0;
	        while(i<nums.length-2){             
	            if(nums[i]>0) break;
	            int j=i+1,k=nums.length-1;                                
	            while(j<k){
	                int sum=nums[i]+nums[j]+nums[k];
	                if(sum==0) result.add(Arrays.asList(nums[i],nums[j],nums[k]));
	                if(sum<=0) while( j<k && nums[j++]==nums[j]); //nums[j]==nums[j++] doesn't work!
	                if(sum>=0) while( k>j && nums[k]==nums[--k]);                                        
	            }
	            while(nums[i]==nums[++i] && i<nums.length-2);
	        }            
	        return result;
	    }
			
}
