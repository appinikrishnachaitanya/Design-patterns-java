package com.pattern.revision;

public class Test {

	public static void main(String[] args) {
		
		PayManager p = new PayManager(new DebitCard());
		p.doPayment();

	}

}
