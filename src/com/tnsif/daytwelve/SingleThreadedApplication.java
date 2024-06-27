package com.tnsif.daytwelve;

public class SingleThreadedApplication {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------in main function() -------"+Thread.currentThread());
		MyTask.sayHello(10); //t1
		MyTask.displayEven();  //t2
		MyTask.sayHello(5); //t3
		System.out.println("----End of main-----");
		
		
	}

}
