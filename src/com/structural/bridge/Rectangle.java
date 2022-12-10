package com.structural.bridge;

public class Rectangle extends Shape {
    
	private Colour c;
	
	public Rectangle(Colour c) {
		super(c);
		this.c  = c;
		
	}

	@Override
	public void getShape() {
		// TODO Auto-generated method stub
		
		System.out.println("RECTANGLE");
		c.getShape();

	}

}
