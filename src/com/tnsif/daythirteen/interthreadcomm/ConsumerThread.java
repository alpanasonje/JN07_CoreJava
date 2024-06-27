package com.tnsif.daythirteen.interthreadcomm;

public class ConsumerThread extends Thread {
	Product p;

	public ConsumerThread(Product p) {
		super();
		this.p = p;
	}

	public void run() {
		while (true) {
			try {
				p.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
