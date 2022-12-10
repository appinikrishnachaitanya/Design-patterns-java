package com.creational.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emp = new Employees();
		emp.loaddata();
		System.out.println(emp.getdata());
		
		Employees e1 = (Employees) emp.clone();
		e1.getdata();

	}

}
