package com.tnsif.daythirteen.interthreadcomm;

public class Product {
	private int n;
    boolean status=true;
	synchronized void put() throws InterruptedException {
		if (status)
		{
			n++;
			System.out.println("Product produced : " + n);
			notify();
			status=false;
		}
		else
		{
			wait();
			status=true;
		}
			
	}

	synchronized void get() throws InterruptedException {
		if (!status)
		{
			System.out.println("Product consumed : " + n);
			status=true;
			notify();
		}
		else
		{
			wait();
			status=false;
		}
	}
}
