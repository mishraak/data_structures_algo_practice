package com.akshay.leetcode;
import java.lang.*; 

public class StringReverse
{
  static StringBuffer str = new StringBuffer("awesome are Java and Ruby");
  public static void main(String[] args)
  {
	int i=0, w=0,j=0;
    
    while(i < str.length()) {
      if (i==0) {w=0;}
      if (str.charAt(i) == ' ' || i==str.length()-1 ) {
      	j=i;
        if (i!=str.length()-1)
          j--;
        swap(w, j);
        w=i+1;
     }
     i++; 
    }
    
    swap(0, str.length()-1);
    System.out.println(str);
 }
  
  static void swap(int a, int b) {
   while(a<b) {
    
    char temp = str.charAt(a);
    //System.out.println(temp);
    str.setCharAt(a, str.charAt(b));
    str.setCharAt(b, temp);
    a++;
    b--;
   }     
 }
}

