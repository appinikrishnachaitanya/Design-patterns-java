package com.pattern.revision;

import java.beans.beancontext.BeanContextServiceAvailableEvent;

public class AirplaneFactory {
	
	private static AirplaneCreator airplane;
	
	public static AirplaneCreator createPlane(String s)
	{
		if(s.equals("BA"))
		{
			airplane = new Banshee();
		}
		
		else if(s.equals("B7"))
		{
			airplane = new B747Fly();
		}
		
		return airplane;
	}

}
