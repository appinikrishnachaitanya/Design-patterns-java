package com.creational.abstractFactory;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory computerfactory)
	{
		return computerfactory.createComputer();
	}

}
