package com.akshay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {}
	
    public List<List<Integer>> threeSum(int[] nums) {        
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){            

            if(i==0 || (nums[i-1] != nums[i])) {
                int lo=i+1, hi=nums.length-1,sum=0-nums[i];
                while(lo<hi){
                    if(nums[lo] + nums[hi] == sum){
                        list.add(Arrays.asList(nums[i],nums[lo],nums[hi]));                    
                        while( lo<hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo<hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;hi--;
                    }                        
                    else if (nums[lo] + nums[hi] < sum ) 
                        lo++;                    
                    else
                        hi--;                        
                }
            }
        }
        return list;
    }

}
