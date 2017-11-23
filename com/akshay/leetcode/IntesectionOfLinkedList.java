package com.akshay.leetcode;

public class IntesectionOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        int la=0,lb=0;
	        ListNode t1=headA, t2=headB;
	        
	        if(t1==null || t2==null) return null;        
	        
	        while(t1 != null){
	            la++;
	            t1=t1.next;
	        }
	        
	        while(t2 != null){
	            lb++;
	            t2=t2.next;
	        }
	        
	        t1=headA; t2=headB;
	        for(int i=0; i<Math.abs(la-lb); i++){
	            if(la>lb)
	                t1=t1.next;            
	            if(la<lb)
	                t2=t2.next;                                    
	        }
	        
	        while(t1 != null && t2 != null){
	                if(t1.val == t2.val)
	                    return t1;
	                t1=t1.next;
	                t2=t2.next;
	        }
	        
	       return null; 
	    }

}
