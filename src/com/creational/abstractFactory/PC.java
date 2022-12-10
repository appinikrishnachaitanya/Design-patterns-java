package com.creational.abstractFactory;

public class PC extends Computer {
	
	private String ram;
	
	public PC(String ram)
	{
		this.ram = ram;
	}
	
	@Override
	public void getRAM() {
		
		System.out.println("PC-RAM" + " " +this.ram);
		
	}

}
