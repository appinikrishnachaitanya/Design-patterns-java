package com.creational.abstractFactory;

public class ServerFactory extends ComputerAbstractFactory {
  
	
	private String ram;

	public ServerFactory(String ram) {
		this.ram = ram;
	}

	
	
	@Override
	public Computer createComputer() {
		
		return new Server(ram);
	}
	
	

}
