package com.tnsif.daytwelve;

public class ChildThreadOne extends Thread {
	public ChildThreadOne()
	{}
	public ChildThreadOne(String name)
	{
		setName(name);
	}
	public void run()
	{
		try {
			MyTask.sayHello(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
