package com.structural.bridge;

public abstract class Shape {
	
	 private Colour color;
	 
	 public Shape(Colour c)
	 {
		this.color = c; 
	 }
   
	public abstract void getShape();
}
