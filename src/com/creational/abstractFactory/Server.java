package com.creational.abstractFactory;

public class Server extends Computer {

	private String ram;

	public Server(String ram) {
		this.ram = ram;
	}

	@Override
	public void getRAM() {

		System.out.println("Server-RAM" + " " + this.ram);

	}

}
