package com.akshay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		boolean categoriseInput=false;
	    List<List<Character>> grid = new ArrayList();
	    List<String> words = new ArrayList();
	    Scanner in = new Scanner(System.in);
	    String read = in.nextLine();
	    while(read !=null){
	        String s = read;
	        //System.out.println("---->"+read +"<--");
	        //System.out.println(read instanceOf String);
	        
	        if(read.trim().isEmpty()){
	            categoriseInput = true;
	        }
	        
	        List<Character> g = new ArrayList();
	        if(!categoriseInput){
	            for(char c: s.toCharArray()){
	                g.add(c);
	            }
	            grid.add(g);
	        }
	        else{
	            if(!read.trim().isEmpty())
	                words.add(s);
	        }
	        
	        if(in.hasNextLine())
	            read = in.nextLine();
	        else
	            read = null;
	        
	    }
	    System.out.println(grid);
	    System.out.println(words);

    }

}
