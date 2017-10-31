package com.akshay.leetcode;

//Example binary tree 

/*
 		5 --------->|  depth=0 
 	  /	  \         |
     3      7------>|  depth=1
   /  \    / \      |
  2    4  6   8---->|  depth=2
    		    		    		    
*/


import java.util.LinkedList;
import java.util.Queue;

public class QuestionTwo {
		
	 class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public TreeNode(int data, TreeNode left, TreeNode right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	
	public static void main(String[] args){				
		QuestionTwo q = new QuestionTwo();				
		
		//Calling printTree method on the constructed binary tree
		printTree(
            //Constructing the binary tree using its constructor functions				
			q.new TreeNode(
				5,
					q.new TreeNode(
						3,
							q.new TreeNode(2),
							q.new TreeNode(4)
					),
					q.new TreeNode( 
						7,
							q.new TreeNode(6),
							q.new TreeNode(8)														
					)								
			)
		);		
	}
		
	static void printTree(TreeNode root) {
	    Queue<TreeNode> queue = new LinkedList<>();

	    //adding root element to the queue
	    queue.add(root);	 
	    
	    while(!queue.isEmpty()){
	    	//poll method retrieves first element of the binary tree
	    	TreeNode temp = queue.poll();
	        //print the node
	    	System.out.print(temp.data + " ");	    
	        
	    	//below code is used to push same-depth nodes to the queue 
	    	if(temp.left != null)
	            queue.add(temp.left);	        
	        if(temp.right != null)
	            queue.add(temp.right);
	    }	    
	}	
}
