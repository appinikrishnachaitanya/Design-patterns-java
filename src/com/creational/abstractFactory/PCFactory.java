package com.creational.abstractFactory;

public class PCFactory extends ComputerAbstractFactory {

	private String ram;

	public PCFactory(String ram) {
		this.ram = ram;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram);
	}

}
