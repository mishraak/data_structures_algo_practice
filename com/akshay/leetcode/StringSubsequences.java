package com.akshay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequences {
	
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList();		
		getSubsequences(3, 0, list);
		for(List<Integer> each : list) System.out.println(each);
	}

	private static void getSubsequences(int n, int len,  List<List<Integer>> list) {				
		//getSubsequences(prim,sub,id+1,list);
		
	}
}
