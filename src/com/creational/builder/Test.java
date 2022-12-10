package com.creational.builder;

import com.creational.builder.Computer.ComputerBuilder;

public class Test {

	public static void main(String[] args) {
		
		Computer c  = new Computer.ComputerBuilder("ram").setGraphicCard(true).computerbuilder();

	}

}
