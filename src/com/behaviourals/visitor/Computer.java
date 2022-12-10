package com.behaviourals.visitor;

public class Computer implements IItem {

	private String modelNumber;
	private int cost;

	public Computer(String modelNumber, int cost) {
		this.modelNumber = modelNumber;
		this.cost = cost;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int accept(IshoppingVisitor visitor) {
         
		  int cost = visitor.visit(this);
		  return cost;
		
	}

}
