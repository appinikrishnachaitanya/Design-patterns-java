package com.behaviourals.state;

public class MobileContext {
	
	
	private MobileAlert mobilealert;
	
	public MobileContext()
	{
		this.mobilealert  = new Ringing();
	}
	
	public MobileContext(MobileAlert ma)
	{
		this.mobilealert = ma;
	}
	
	public void givealert()
	{
		mobilealert.alert();
	}

}
