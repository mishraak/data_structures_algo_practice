package com.akshay.leetcode;

public class QuestionOne {
	public static void main(String[] args) {		
		//Calculating Nth element in the sequence. 
		int result = calculateSeq1(8181);
		System.out.println(result);		
	}
		
	public static int calculateSeq1(int k) {		
		int older=0, 	//used to store previous to previous element i.e (n-2)
			old=1, 		//used to store previous element i.e (n-1)
			sum=1; 		//initialized to 1 considering two defined inputs -> [ f(0)=0, f(1)=1 ]
		
		//iterate using a while loop while starting from i=2 
		//i=0 & i=1 have already been taken into consideration above
		int i=2;
		
		while(i<k){
			sum=older+old; //adding f(n-1) + f(n-2) to calculate f(n)
			older=old;
			old=sum;
			i++;
		}		
		return sum;
	}	
}
