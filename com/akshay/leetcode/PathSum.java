package com.akshay.leetcode;

import com.akshay.leetcode.BalancedBST.TreeNode;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)
            return false;
        if (root.left == null && root.right ==null)
            return root.val==sum ? true : false; 
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);        
    }

}
