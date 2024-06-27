package com.tnsif.daytwelve;

public class ThreadDemo {

	public static void main(String[] args) {
		MyChildThread m=new MyChildThread();
		/*
		 * Thread t=new Thread(m); t.setName("Child Thread");
		 */
		Thread t=new Thread(m, "Child Thread");
		//t.setPriority(0); IIlegalArgumentException
		t.setPriority(3);
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();

	}

}
