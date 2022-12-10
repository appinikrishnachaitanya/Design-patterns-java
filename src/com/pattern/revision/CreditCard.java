package com.pattern.revision;

public class CreditCard implements Payment {

	@Override
	public void makePayment() {
		
		System.out.println("CREDIT CARD");
		
	}

}
