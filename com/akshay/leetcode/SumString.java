package com.akshay.leetcode;
class SumString{
  static String s = "70,8,5,6,1";
  public static void main(String args[] ) {
    int w=0, i=0, sum=0;
    while(i<s.length()) {

      if (s.charAt(i) == ',' || i==s.length()-1) {
        if (i==s.length()-1) {i++;}
        sum+=convertToInt(w,i);
        //System.out.println("loop " + i + " " + s.substring(w,i) + " sum " + sum );
        w = i+1;
      }
      i++;
    }
    System.out.print(sum);
  }

  static int convertToInt(int i, int j) {
    return Integer.parseInt(s.substring(i,j));
  }
}
