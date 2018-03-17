package com.akshay.leetcode;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		
		ListNode one=new ListNode(1);
		ListNode two=new ListNode(2);
		one.next=two;
		ListNode three=new ListNode(3);
		two.next=three;
		ListNode four=new ListNode(4);
		three.next=four;
		ListNode five=new ListNode(5);
		four.next=five;
		ListNode six=new ListNode(6);
		five.next=six;
		ListNode seven=new ListNode(7);
		six.next=seven;
		ListNode eight=new ListNode(8);
		seven.next=eight;
		
		ListNode l = oddEvenList(one);
		while(l != null) System.out.println(l.val);
	}
	
	public static ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null) return head; 
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode eh = even;
        while( odd != null && odd.next !=null){                        
            odd.next = odd.next.next;
            odd = odd.next;  
            
            if( odd.next == null)  {
                odd.next=even;
            }
        }               
        
        while( even != null && even.next !=null){             
            even.next = even.next.next;
            even = even.next;            
        }
                                
        return head;
    }

}
