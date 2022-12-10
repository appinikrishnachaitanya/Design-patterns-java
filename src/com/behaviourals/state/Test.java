package com.behaviourals.state;

public class Test {

	public static void main(String[] args) {
	
		MobileAlert ma = new Vibration();
		
		
		MobileContext m  = new MobileContext(ma);
		
		m.givealert();
		

	}

}
