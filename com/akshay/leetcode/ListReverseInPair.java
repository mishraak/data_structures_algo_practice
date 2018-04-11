package com.akshay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ListReverseInPair {

	
	public static ListNode rev(ListNode head) {
		if(head==null || head.next==null) return head;
		
		ListNode newHead=head.next;
		
		while(head != null && head.next != null) {
			ListNode three=head.next.next;
			head.next.next=head;
			head.next=three;
			head=three;
		}
		return newHead;			
	}
	
	public static void main(String[] args) {		
		ListNode one= new ListNode(1);
		ListNode two= new ListNode(2);
		one.next=two;
		ListNode three= new ListNode(3);
		two.next=three;
		ListNode four= new ListNode(4);
		three.next=four;
		four.next=null;
		
		ListNode newHead = rev(one);		
		
		while(newHead != null) {
			System.out.println(newHead.val);
			newHead=newHead.next;
		}		
	}

}
