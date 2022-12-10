package com.pattern.revision;

public class SingletonPattern implements Cloneable {
	
//	private static SingletonPattern singleton;
	
	
	//eager instalizaiton:
	
	
//	private static SingletonPattern singleton = new SingletonPattern();
	
	private static SingletonPattern singleton;
	//satic eager instalization
	static
	{
	    singleton = new SingletonPattern();	
	}
	
	private SingletonPattern()
	{
		
	}
	
	
	public static synchronized SingletonPattern getSingleton()
	
	{
		if(singleton==null)
		{
			singleton = new SingletonPattern();
		}
		
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

}
