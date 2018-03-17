package com.akshay.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class Solution {
	
	public class Tree {
		      int x;
		      public Tree l;
		      Tree r;
		      Tree(int x) { 
		    	  this.x = x;
		    	  this.l=null;
		    	  this.r=null;
		      }
		      Tree(int x, Tree left, Tree right){ 
		    	  this.x=x;
		    	  this.l=left;
		    	  this.r=right;
		      }
		  }
	
	 public int solution(Tree T) {
		    // write your code in Java SE 8
		    if (T == null) {
		      return 0;
		    }

		    if (T.l == null && T.r == null) {
		      return 1;
		    }
		    //return Math.max(findUniqueInSubTree(T.r, new ArrayList<>(), 0), findUniqueInSubTree(T.l, new ArrayList<>(), 0));
		    if(T.l != null && T.r != null) return Math.max(findUniqueInSubTree(T.r, new ArrayList<>(), 0), findUniqueInSubTree(T.l, new ArrayList<>(), 0));
		    
		    return T.l==null ? findUniqueInSubTree(T.r, new ArrayList<>(), 0) : findUniqueInSubTree(T.l, new ArrayList<>(), 0);
		    
		  }

		  int findUniqueInSubTree(Tree element, ArrayList<Integer> visitedNodes, int max) {
		    if (element == null) {	
		      if (visitedNodes.size() > max) {
		        max = visitedNodes.size();
		      }
		      
		      //System.out.println("visitedNodes" + visitedNodes);
		      return max;
		    }

		    visitedNodes.add(element.x);

		    int maxL = findUniqueInSubTree(element.l, visitedNodes, max);
		    int maxR = findUniqueInSubTree(element.r, visitedNodes, max);

		    max = Math.max(maxL, maxR);
		    if (visitedNodes.contains(element.x)) {
		      visitedNodes.remove(element.x);
		    }

		    return max;
		  }

		  Tree createTree() {

		    Tree node = new Tree(4, new Tree (5, new Tree (4, new Tree (5, null, null), null), null), new Tree (6, new Tree (1, null, null), new Tree (6, null, null)));
		    return node;
		  }

		  public static void main(String[] args) {

			  Solution nodes = new Solution();
		    Tree t = nodes.createTree();
		    //DistinctNodes.printNode(t);
		    System.out.println(nodes.solution(t));

		  }
	  }
	




