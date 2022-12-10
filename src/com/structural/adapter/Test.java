package com.structural.adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buggati b= new Buggati();
		
		MovableAdapter m = new MovableAdapterImpl(b);
		
		System.out.println(m.getSpeed());

	}

}
