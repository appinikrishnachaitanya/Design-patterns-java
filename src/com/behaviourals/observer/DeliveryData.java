package com.behaviourals.observer;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject {
  
	
	private List<Observer> observers;
	
	public DeliveryData()
	{
		this.observers = new ArrayList<Observer>();
	}
	
	
	@Override
	public void register(Observer o) {
	     
		observers.add(o);
	 	
	}

	@Override
	public void deregister(Observer o) {
      
		observers.remove(o);
		
	}

	@Override
	public void notifyAllObservers() {
		
		for(Observer o : observers)
		{
		   o.changeLocation(getLocation());	
		}
		
	}
	
	public String getLocation()
	{
		return "Bangalore";
	}
	


}
