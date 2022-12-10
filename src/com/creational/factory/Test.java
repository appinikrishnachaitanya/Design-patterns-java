package com.creational.factory;

public class Test {

	public static void main(String[] args) {
		
		
		 FactoryPattern p = new FactoryPattern();
		 Pizza pizza = p.getPizza("VEG");
		 pizza.prepare();

	}

}
