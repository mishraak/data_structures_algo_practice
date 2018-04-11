package com.akshay.leetcode;

public class MergeLinkedListIterative {

	public static void main(String[] args) {
		ListNode n0 = new ListNode(0);
		ListNode n1 = new ListNode(2);
		n0.next=n1;
		ListNode n2 = new ListNode(4);
		n1.next=n2;		
		ListNode n3 = new ListNode(1);
		
		ListNode n4 = new ListNode(3);
		n3.next=n4;
		ListNode n5 = new ListNode(5);
		n4.next=n5;	
		
		ListNode head= mergeTwoLists(n0,n3);
		while(head != null){
			System.out.println(head.val + " -> ");
			head=head.next;
		}
		
	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {                
        if(l1==null && l2==null) return null;
        if(l1==null || l2==null) return (l1==null) ? l2 : l1;
        
        ListNode newHead=new ListNode(99);
        ListNode dummy=new ListNode(-99);;
        newHead.next=dummy;
        
        while(l1 !=null && l2 != null){
            if(l1.val<l2.val){
               dummy.next=l1;
                l1=l1.next;
            }
            else {
                dummy.next=l2; 
                l2=l2.next;
            }
        }
                
        if(l1 != null) dummy.next=l1;
        else dummy.next=l2;
        
        return newHead.next;
    }	
}
