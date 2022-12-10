package com.structural.decorator;

public class LuxuryCar extends CarDecorator {

	private Car car;
	public LuxuryCar(Car c) {
		super(c);
		
		this.car=c;
		
	}
	
	@Override
	public void assemble() {
		
		super.assemble();
		System.out.println("Luxurary Car");
	}
	

}
