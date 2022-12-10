package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> emps;
	
	public Employees()
	{
		this.emps = new ArrayList<String>();
		System.out.println("hi");
	}
	
	public Employees(List<String> emp)
	{
		this.emps = emp;
	}
	
	public void loaddata()
	{
		emps.add("krishna");
		emps.add("sai");
		emps.add("chaitanya");
	}
	
	public List<String> getdata()
	{
		return emps;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		List<String> temps = new ArrayList<String>();
		
		for(String s : emps)
		{
			temps.add(s);
		}
		
		
		return new Employees(temps);
	}
	
	
	

}
