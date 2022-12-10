package com.behaviourals.strategy;

public class Paypal implements Pay {

	@Override
	public void doPayment() {
		
		System.out.println("IT IS FROM PAYPAL");
		
	}

}
