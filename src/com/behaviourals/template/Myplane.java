package com.behaviourals.template;

public class Myplane extends Sprite {
	
	public Myplane(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		
		System.out.println ( "MyPlane:"  + "X :" + this.getX() + "Y :" +  this.getY() );
	}

}
