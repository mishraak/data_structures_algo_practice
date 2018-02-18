package com.akshay.leetcode;

public class LongestPalindromicStringDynamic {

	public static void main(String[] args) { 
		System.out.println(longestPalindrome("babad"));
	}
	
    public static String longestPalindrome(String s) {
        if(s.length()<1) return ""; 
        int len=s.length();
        boolean[][] table = new boolean[len][len];
        int max=0, start=0;        
        //for individual strings
        for(int i=0; i<len; i++) {
            table[i][i]=true;
            max=1;
        }
        
        //for strings of length 2
        for(int i=0; i<len-1; i++){
            if(s.charAt(i+1)==s.charAt(i)){
                table[i][i+1]=true;
                max=2;
                start=i;
            }    
        }
        
        //for strings of length greater than 2 upto k, kmax will be length of string i.e. len
        for(int k=3;k<=len;k++){
            for(int i=0; i<len-k+1; i++){
                int j=i+k-1;
                if(table[i+1][j-1]==true && s.charAt(j)==s.charAt(i)){
                    table[i][j]=true;                                        
                    if(k>max){
                        start=i;
                        max=k;
                    }                    
                }
            }
        }
        //System.out.println("max " + max);
        return s.substring(start, start+max);
    }

}
