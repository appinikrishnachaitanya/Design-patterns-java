package com.structural.flyweight;

public class Developer implements Employee {
	
	private String skill;
	
	public Developer()
	{
		
	}
	
	
	
	

	@Override
	public void job() {
		
		System.out.println("Hey I am Developer !!" + "Skill :" +this.skill);
		

	}

	@Override
	public String changeSkill(String skill) {
		this.skill = skill;
		return this.skill ;
	}

}
