package com.behaviourals.mediator;

public class MediatorHandle implements Handle {

	private HouseOwner owner1;
	private HouseOwner owner2;
	
	public  MediatorHandle()
	{
		owner1  = new HouseRent();
		owner2 = new HouseSell();
	}
	
	
	@Override
	public void handleaction(String content) {
		
		if(content.equals("RENT"))
		{
			owner1.action();
		}
		
		if(content.equals("PURCHASE"))
		{
			owner2.action();
		}

	}

}
