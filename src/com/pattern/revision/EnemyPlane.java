package com.pattern.revision;

public class EnemyPlane extends Sprite {

	@Override
	void getLocation() {
		
		System.out.println("The enenmy plane is located at the " + this.getX() + "-" + this.getY());

	}

}
