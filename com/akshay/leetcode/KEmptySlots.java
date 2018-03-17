package com.akshay.leetcode;

import java.util.TreeSet;

public class KEmptySlots {

	public static void main(String[] args) {
			System.out.println(kEmptySlots(new int[] {3,1,5,4,2},1));

	}
	
	
	public static int kEmptySlots(int[] flowers, int k) {
        int n = flowers.length;
        if (n == 0 || k >= n) return -1;
        int[] f = new int[n + 1];
        
        for (int i = 0; i < n; ++i)
            if (IsValid(flowers[i], k, n, f))
                return i + 1;
        
        return -1;
    }
    
    private static boolean IsValid(int x, int k, int n, int[] f) {
        f[x] = 1;
        if (x + k + 1 <= n && f[x + k + 1] == 1) {
            boolean valid = true; 
            for (int i = 1; i <= k; ++i)
                if (f[x + i] == 1) {
                    valid = false;
                    break;
                }
            if (valid) return true;
        }
        if (x - k - 1 > 0 && f[x - k - 1] == 1) {
            for (int i = 1; i <= k; ++i)
                if (f[x - i] == 1) return false;
            return true;
        }
        return false;
    }	

}
