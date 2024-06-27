package com.tnsif.daytwelve;

public class ChildThreadTwo extends Thread{
	public void run()
	{
		MyTask.displayEven();
	}

}
