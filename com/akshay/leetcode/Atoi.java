package com.akshay.leetcode;

public class Atoi {

	public static void main(String[] args) {		
		System.out.println(myAtoi("    010"));
	}
	

    public static int myAtoi(String str) {
    	if (str.length()<1)
    		return 0;
   	   
    	str = str.replaceAll(" ", "");
    	
    	if(!str.matches("[-+]?\\d*\\.?\\d+"))
    		return 0;    		        
        
        int len=str.length(), sum=0;        
        boolean sign = false;
        
        if (str.charAt(0) == '+' || str.charAt(0) == '-'){
            if(str.charAt(0) == '-')
                sign=true;            
            return sign==true ? 0-myAtoi(str.substring(1)) : myAtoi(str.substring(1));
        }
        
        
        
        for(int i=0; i<len;i++ ){        	
            sum+=(Integer.parseInt(str.charAt(i) + "") * Math.pow(10, len-i-1));                
        }
        
        return sum;
    }
}


