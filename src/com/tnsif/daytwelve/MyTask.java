package com.tnsif.daytwelve;

public class MyTask {
	public static void sayHello(int n) throws InterruptedException {
		for (int i = 0; i < n; i++)
		{
			System.out.println("Hello " + Thread.currentThread());
			Thread.sleep(300);
		}
	}
	
	public static void displayEven()
	{
		for(int i=2;i<=50;i+=2)
		{
			System.out.println(i +" "+ Thread.currentThread());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
