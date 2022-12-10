package com.pattern.revision;

public class PayManager {
	
	private Payment payment;
	
	public PayManager(Payment payment)
	{
		this.payment = payment;
	}
	
	
	public void doPayment()
	{
		payment.makePayment();
	}

}
