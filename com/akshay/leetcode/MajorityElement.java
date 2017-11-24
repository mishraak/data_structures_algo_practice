package com.akshay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap();
        int result=nums[0];
        if(nums.length==1)
            return nums[0];
        
        for(int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
               if (map.get(nums[i]) == (nums.length)/2  ){
                    result= nums[i];
                    break;
               }
               else
                    map.put(nums[i], map.get(nums[i])+1);
            }
            else
                map.put(nums[i], 1);
        }
        
        return result;
    }

}
