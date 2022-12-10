package com.creational.factory;

public class FactoryPattern {
	
	private Pizza p;
	
	public Pizza getPizza(String type)
	{
		if(type.equals("VEG"))
		{
			p = new VegPizza();
		}
		
		if(type.equals("NONVEG"))
		{
			p = new ChickenPizza();
		}
		
		return p;
	}

}
