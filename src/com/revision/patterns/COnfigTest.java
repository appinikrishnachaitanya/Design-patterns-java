package com.revision.patterns;

public class COnfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Config c = Config.getInstance();
		System.out.println(c);
		System.out.println(c.getValues("username"));
		Config c1 = Config.getInstance();
		System.out.println(c1);
 
	}

}
