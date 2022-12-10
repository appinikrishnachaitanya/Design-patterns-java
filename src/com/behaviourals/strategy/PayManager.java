package com.behaviourals.strategy;

public class PayManager {
	
	private Pay pay;
	
	public PayManager(Pay p)
	{
	  this.pay = p;	
	}
	
	
	public void doPayments()
	{
		pay.doPayment();
	}

}
