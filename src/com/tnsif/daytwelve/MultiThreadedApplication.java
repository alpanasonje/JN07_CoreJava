package com.tnsif.daytwelve;

public class MultiThreadedApplication {

	
	public static void main(String[] args) {
		System.out.println("--------in main function() -------"+Thread.currentThread());
		ChildThreadOne t1=new ChildThreadOne("FirstSayHelloThread");
				
		ChildThreadTwo t2=new ChildThreadTwo();
		
		ChildThreadOne t3=new ChildThreadOne("SecondSayHelloThread");
		t1.start(); //run() method called implicitly
		t2.start();
		//t1.start(); //Exception - IllegalThreadStateException
		//t1.run(); //converts into single threaded
		t3.start();
		System.out.println("----End of main-----");
		
		
	}

}
