package com.structural.decorator;

public class Test {
	
	
	
	public static void main(String args[])
	{
		Car c = new LuxuryCar(new SportCar(new BasicCar()));
		c.assemble();
	}

}
