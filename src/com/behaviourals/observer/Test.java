package com.behaviourals.observer;

public class Test {

	public static void main(String[] args) {
		
		DeliveryData d = new DeliveryData();
		User u = new User();
		d.register(u);
		d.notifyAllObservers();

	}

}
