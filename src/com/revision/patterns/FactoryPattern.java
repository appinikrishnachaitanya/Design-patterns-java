package com.revision.patterns;

public class FactoryPattern {
	
	private static Pizza p;
	
	public static Pizza getPizza(String type)
	{
		if(type.equals("Cheesepizza"))
		{
		   p = new CheesePizza();    	
		}
		else if(type.equals("Chickenpizza"))
		{
		    p= new ChickenPizza();	
		}
		
		return p;
			


	}

}
