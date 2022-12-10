package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
	
	private List<Shape> shapes;
	
	public Composite()
	{
		this.shapes = new ArrayList<Shape>();
	}
	
	public void add(Shape s)
	{
	     shapes.add(s);	
	}
	
	public void remove(Shape s)
	{
		shapes.remove(s);
	}
	
	public void draw(String fillcolour)
	{
		for(Shape sh : shapes)
		{
		      sh.draw(fillcolour);	
		}
			
	}
}
