package com.tnsif.daythirteen.synchronization;

public class AccountThread extends Thread{
	private Account acc;
	private float amt;
	
	public AccountThread(Account acc, float amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}
	
	public void run()
	{
		//synchronized block allowing only one thread to execute it
		//synchronized(acc)
		//{
			acc.withdraw(amt);
				
		//}
		
	}	
}
