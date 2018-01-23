package com.akshay.leetcode;

public class SwapNodesLinkedList {
	public static void main(String[] args) {
		ListNode l4 = new ListNode(4,null);
		ListNode l3 = new ListNode(3,l4);
		ListNode l2 = new ListNode(2,l3);
		ListNode l1 = new ListNode(1,l2);
		
		System.out.println("Before");
		while(l1 != null) {
			System.out.print(l1.val);
			l1=l1.next;
		}
		System.out.println();
		ListNode res=swapNodeinPairsIterative(l1);
		System.out.print(res);
		System.out.println("After");
		while(res != null) {
			System.out.print(res.val);
			res=res.next;
		}
		
	}

	private static ListNode swapNodeinPairsIterative(ListNode head) {
		ListNode ptrPrev=null;
		ListNode baseHead=head;
		
		while(head != null && head.next != null) {
			ListNode ptrOne=head;
			ListNode ptrTwo=head.next;
			ListNode ptrTwoNext=ptrTwo.next;
			
			ptrOne.next=ptrTwoNext;
			
			
			if(ptrPrev != null)
				ptrPrev.next=ptrTwo;
			else
				baseHead=ptrTwo;
						
			
			ptrTwo.next=head;
			
			ptrPrev=ptrOne;
			head=ptrTwoNext;
		}	
		return baseHead;
	}
}
