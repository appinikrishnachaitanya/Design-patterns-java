package com.revision.patterns;

public class AdapterFactory {
	
	private static DaoProducerAbs ad = null;
	
	public static DaoProducerAbs produceDao(String type)
	{ 
		
		if(type.equals("xml"))
		{
			ad = new XmlDaoFactory();
		}
		
		
		if(type.equals("db"))
		{
			ad = new DBDaoFactory();
		}
		
		return ad;
	}

}
