package com.akshay.leetcode;

public class isPalindromeIgnoreSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	    public boolean isPalindrome(String s) {
	        
	        if(s.length()==1) return true;
	        if(s.length()==2 && isValidChar(s.charAt(0)) && isValidChar(s.charAt(1)))
	            return Character.toLowerCase(s.charAt(0))!=Character.toLowerCase(s.charAt(1)) ? false : true;
	        
	        int i=0,j=s.length()-1;        
	        
	        while(i<=j && i<s.length() && j>=0){
	            Character ati=s.charAt(i), atj=s.charAt(j);
	            
	            if(!isValidChar(ati) && i<j ) i++;
	            else if (!isValidChar(atj) && j>i) j--;
	            else {
	                if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) 
	                    return false;
	                 i++;j--;
	            }                       
	        }
	        return true;
	    }
	    
	    public boolean isValidChar(char c){
	        //int intChar= (int) c;        
	        //return ((intChar <= 90 && intChar >=65) || (intChar <= 122 && intChar >=97 )) ? true : false;
	        return Character.isLetterOrDigit(c);
	    }

}
