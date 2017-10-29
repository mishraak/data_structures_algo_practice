package com.akshay.leetcode;
import java.util.*;
import java.lang.*;

public class UniqueChars
{
  static StringBuffer str = new StringBuffer("ovuvuevuevue enyetuenwuevue ugbemugbem osas");
  public static void main(String[] args)
  {
    Set<Character> s = new HashSet<Character>();
    int i=0,count=0;
    while(i < str.length()) {
      s.add(str.charAt(i));
      i++;
    }

    System.out.println(s.size());
	}
}

