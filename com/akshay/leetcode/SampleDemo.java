package com.akshay.leetcode;

public class SampleDemo implements Runnable {

	private Thread t;
	private String threadName;
	
	SampleDemo(String name){
		threadName=name;
	}
	
	SampleDemo(Thread thread, String name){
		t=thread;
		threadName=name;
	}
	
	public void run() {
		while(true) 
			System.out.print(threadName);
	}
	
	public void start() {
		if(t==null) {
			t=new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main(String[] args) {
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		
		B.start();
		A.start();

	}

}
