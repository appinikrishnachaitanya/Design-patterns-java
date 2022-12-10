package com.structural.decorator;

public class SportCar extends CarDecorator {
	
	private Car car;
	
	public SportCar(Car c)
	{   
		super(c);
		this.car = c; 
	}

	@Override
	public void assemble() {
		
		super.assemble();
		System.out.println("This is sport Car");
		
	}
	

}
