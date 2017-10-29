package com.akshay.leetcode;

public class AddTwoNumbers {
		
	public static void main(String[] args) {		
		
	}
	
	
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
	 
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode node = new ListNode(0);
	        ListNode ret = node;
	        int sum=0,carry=0;
	        while(l1 != null || l2 != null){
	            sum /= 10;           
	            
	            if (l1 != null ) {
	                sum+=l1.val;
	                l1=l1.next;
	            }  
	            
	            if (l2 != null ) {
	                sum+=l2.val;
	                l2=l2.next;
	            }                
	            
	            ret.next = new ListNode(sum%10);
	            ret = ret.next;                      
	        }
	        
	        if (sum / 10 == 1)
	            ret.next = new ListNode(1);
	        
	        return node.next;
	    }
}
