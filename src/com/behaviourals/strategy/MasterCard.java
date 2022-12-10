package com.behaviourals.strategy;

public class MasterCard implements Pay {

	@Override
	public void doPayment() {
		
		System.out.println("it is mastercard");

	}

}
