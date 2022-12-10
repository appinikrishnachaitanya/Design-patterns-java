package com.structural.bridge;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Colour c  = new RedColour();
		Shape s = new Rectangle(c);
		s.getShape();

	}

}
