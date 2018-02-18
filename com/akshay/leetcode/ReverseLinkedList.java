package com.akshay.leetcode;

public class ReverseLinkedList {			
	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		ListNode h1 = new ListNode(2);
		h.next=h1;
		ListNode h2 = new ListNode(3);
		h1.next=h2;
		ListNode h3 = new ListNode(4);
		h2.next=h3;
		ListNode h4 = new ListNode(5);
		h3.next=h4;
		
		/*
		ListNode hItr = reverseIterative(h); 
		while(hItr != null) {
			System.out.print(hItr.val); if(hItr.next != null) System.out.print(" -> ");
			hItr=hItr.next;			
		}			
		System.out.println("\n");
		*/		
		
		ListNode hRcr = reverseRecursive(h); 
		while(hRcr != null) {
			System.out.print(hRcr.val); if(hRcr.next != null) System.out.print(" -> ");
			hRcr=hRcr.next;
		}
							
	}

	private static ListNode reverseRecursive(ListNode h) {
		return reverseLinkedListRecursive(h, null);
	}

	private static ListNode reverseLinkedListRecursive(ListNode h, ListNode newHead) {
		if(h==null) 
			return newHead;		
		ListNode next = h.next;
		h.next=newHead;
		return reverseLinkedListRecursive(next,h);		
	}

	private static ListNode reverseIterative(ListNode h) {
		if(h==null || h.next==null) return h;	
		ListNode newHead = null;
		while(h != null) {
			ListNode next = h.next;
			h.next=newHead;
			newHead=h;
			h=next;			
		}
		return newHead;
		
	}
}
