package com.creational.singleton;

public class Singleton {
	
	
	private static Singleton singleton;
	
	static
	{
		singleton = new Singleton();
	}
	private Singleton()
	{
		
	}
	
	
	public static synchronized Singleton getInstance()
	{  
	
		if(singleton==null)
		{
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	
	

}
