package com.akshay.leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		 System.out.println(mySqrt(2147395599));

	}
	   public static int mySqrt(int x) {
	        
	        if(x<=1) return x;
	       
	        long l=0, r=x, m=x/2;
	        
	        while(l<=r) {
	            m=l+(r-l)/2;
	            if (m*m<x){
	                l=m+1;
	            }
	            else if (m*m>x){
	                r=m-1;
	            }
	            else if(m*m==x){
	                return (int) m;
	            }
	        }
			return (int)m;
	   }
	      
}
