package com.structural.bridge;

public class Triangle extends Shape {
	
	private Colour c;
	public Triangle(Colour c) {
		super(c);
		
		this.c = c;
		
	}
	
	

	@Override
	public void getShape() {
		// TODO Auto-generated method stub
		
		System.out.println("TRANGLE");
		c.getClass();

	}

}
