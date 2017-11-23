package com.akshay.leetcode;

public class BalancedBST {

	public static void main(String[] args) {
		

	}
	
	
	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 

	    public static boolean isBalanced(TreeNode root) {
	        if(root == null) return true;
	        
	        TreeNode temp=root;  
	        
	        if( Math.abs(height(temp.left)-height(temp.right) ) > 1)        
	            return false;
	        
	        return isBalanced(temp.left) && isBalanced(temp.right);
	    }
	    
	    public static int height(TreeNode node){
	        if(node==null)
	            return 0;
	        return 1 + Math.max(height(node.left), height(node.right));
	    }
	    

}
