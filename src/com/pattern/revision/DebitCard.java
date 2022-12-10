package com.pattern.revision;

public class DebitCard implements Payment {

	@Override
	public void makePayment() {
		
		System.out.println("DEBIT CARD");
		
	}

}
