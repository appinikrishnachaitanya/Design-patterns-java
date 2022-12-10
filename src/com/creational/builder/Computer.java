package com.creational.builder;

public class Computer {
	
	
	private String ram;
	private boolean graphiccard;
	
	
	public String ram()
	{
		return this.ram;
	}
	
	public boolean isgraphiccard()
	{
		return this.graphiccard;
	}
	
	private Computer(ComputerBuilder cb)
	{
	    this.ram = cb.ram;
	    this.graphiccard= cb.graphiccard;
	}
	
	
	public static class ComputerBuilder 
	{
		private String ram;
		private boolean graphiccard;
		
		
		public ComputerBuilder(String ram)
		{
			this.ram = ram;
		}
		
		public ComputerBuilder setGraphicCard(boolean b)
		{
			this.graphiccard=b;
			return this;
		}
		
		public Computer computerbuilder()
		{
			return new Computer(this);
		}
		
	}
	
	

}
