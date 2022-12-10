package com.behaviourals.visitor;

public class ShoppingVisitorImpl implements IshoppingVisitor  {

	@Override
	public int visit(Computer computer) {
		
		int cost = computer.getCost();
		
		if(cost >= 15000)
		{
			cost-=500;
		}
		
		return cost;
	}



}
