package com.behaviourals.strategy;

public class Test {

	public static void main(String[] args) {
		
		Pay p = new Paypal();
		PayManager pm = new PayManager(p);
		pm.doPayments();

	}

}
