package com.revision.patterns;

public class Singleton implements Cloneable {
	
	private static Singleton singleton;
	
	static
	{
		singleton = new Singleton();
	}
	
	public static synchronized Singleton getInstance()
	{   
		
//		if(singleton == null)
//		{
//		   singleton = new Singleton();	
//		}
//		
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new CloneNotSupportedException();
	}

}
