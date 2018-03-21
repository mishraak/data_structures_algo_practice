package com.akshay.leetcode;

class AddDigits {
	
	public static void main(String[] args) {
		System.out.println(addDigits(12));
	}
	
    public static int addDigits(int num) {
        if(num<10) return num;        
        int sum=0;
        
        while(num>0){    
            while(num>0){
                sum=sum+(num%10);
                num=num/10;
            }
            if(sum<10) break;
            num=sum;
            sum=0;
        }
                        
        return sum;
    }
}