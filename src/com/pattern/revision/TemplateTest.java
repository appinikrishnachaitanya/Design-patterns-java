package com.pattern.revision;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sprite s = new MyPlane();
		s.setX(1);
		s.setY(2);
		
		Sprite s1 = new EnemyPlane();
		s1.setX(3);
		s1.setY(4);
		
		s.getLocation();
		s1.getLocation();
		
		

	}

}
