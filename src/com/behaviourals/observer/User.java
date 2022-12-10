package com.behaviourals.observer;

public class User implements Observer {
  
	 private String location ;
	 
	@Override
	public void changeLocation(String location) {
		
		this.location = location;
		this.printLocation();

	}
	
	public void printLocation()
	{
		System.out.println(this.location);
	}

}
