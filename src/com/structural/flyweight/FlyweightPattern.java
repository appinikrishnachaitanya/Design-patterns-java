package com.structural.flyweight;

import java.util.HashMap;

public class FlyweightPattern {
	
	
	public static HashMap<String, Employee> m  = new HashMap<String, Employee>();
	
	
	public static Employee getEmployee(String type)
	{ 
		 Employee e = null;
		
		 if(m.get(type)!=null)
		 {
			 e = m.get(type);
		 }
		 
		 else
		 {
			 switch(type)
			 {
			 case "DEV":
				 System.out.println("Developer Created !!");
				 e = new Developer();
				 break;
				 
			 case "TESTER":
				  System.out.println("Tester created !!!");
				  e=new Tester();
				  break;
				  
			 default:
				 System.out.println("NO SUCH EMPLOYEES");
			 }
			 
		     m.put(type, e);	 
		 }
		 
		 return e;
		
	}
	

}
