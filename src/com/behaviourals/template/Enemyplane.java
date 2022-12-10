package com.behaviourals.template;

public class Enemyplane extends Sprite {

	public Enemyplane(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void draw() {
		
		System.out.println ( "Fighter:"  + "X :" + this.getX() + "Y :" +  this.getY() );
		
	}
	

}
