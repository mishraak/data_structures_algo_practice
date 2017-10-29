package com.akshay.leetcode;
import java.util.Arrays;
class TheStack {
	
	private int top=-1;
	private int size;
	private String[] StackArray;

	TheStack(int s) {
		size=s;
		StackArray = new String[s];
		top=-1;
		Arrays.fill(StackArray, "-1");
	}

	public void push(String i) {
		if (top+1 < size) {
			top++;
			StackArray[top]=i;
			System.out.println(i + " was pushed at position " + top);
		}
		else {
			System.out.println("Stack is full");
		}
	}

	public String pop() {
		if (top >=0) {
			String s = StackArray[top];
			System.out.println(s + " was popped from position " + top);
			top--;
			return s;
		}
		else {
			return "Stack is empty";
		}
	}

	public String peek(){
		if (top>-1) {
			System.out.println("top s " + StackArray[top]);
			return StackArray[top];
		}
		else {
			return "Stack is empty";
		}

	}

	public static void main(String[] args){
		TheStack s = new TheStack(5);
		s.push("A");
		s.peek();
		s.push("B");
		s.peek();
		s.push("C");
		s.peek();
		s.push("D");
		s.peek();
		s.push("E");
		s.peek();
		s.push("F");
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();

	}	
}