package com.pattern.revision;

public class FactoryTest {

	public static void main(String[] args) {
		
		AirplaneCreator airplane  = AirplaneFactory.createPlane("BA");
		airplane.create();

	}

}
