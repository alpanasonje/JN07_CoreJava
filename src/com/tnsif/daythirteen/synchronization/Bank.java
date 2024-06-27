package com.tnsif.daythirteen.synchronization;

public interface Bank {
	float MIN_BALANCE=5000; 
	void deposit(float amt);
	void withdraw(float amt);
}
