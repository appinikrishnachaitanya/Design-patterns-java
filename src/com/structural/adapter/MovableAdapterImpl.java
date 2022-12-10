package com.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {
   
	 private Movable car;
	 
	 public MovableAdapterImpl(Movable b)
	 {
		 this.car = b;
	 }
	 
	@Override
	public double getSpeed() {
		
		return getSpeedInKPH();
	}
	
	public double getSpeedInKPH()
	{
		 return car.getSpeed() * 1.60934;
	}

}
