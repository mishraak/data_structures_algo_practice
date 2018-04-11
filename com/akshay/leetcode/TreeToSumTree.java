package com.akshay.leetcode;

public class TreeToSumTree {
	
	public int SumTree(MyNode root){
		if(root!=null){
			int left = SumTree(root.left);//take the left tree sum
			int right = SumTree(root.right);//take the right tree sum
			int retData = root.data+left+right; // return data left+right+root
			root.data = left+right; //update the root with left + right	
			return retData; //return 
		}
		return 0;
	}
	public void display(MyNode root){
		if(root!=null){
			display(root.left);			
			System.out.print(root.data + "  " );
			display(root.right);
		}
	}
	public static void main(String args[]){
		MyNode root = new MyNode(5);
		root.left = new MyNode(-1);
		root.right = new MyNode(3);
		root.left.left = new MyNode(-2);
		root.left.right = new MyNode(4);
		root.right.left = new MyNode(-6);
		root.right.right = new MyNode(10	);
		TreeToSumTree t = new TreeToSumTree();
		System.out.print("Original Tree: ");
		t.display(root);
		System.out.print("\nSum tree: ");
		t.SumTree(root);
		//Print the new tree
		t.display(root);
	}
}
class MyNode{
	int data;
	MyNode left;
	MyNode right;
	public MyNode(int data){
		this.data = data;
	}
}