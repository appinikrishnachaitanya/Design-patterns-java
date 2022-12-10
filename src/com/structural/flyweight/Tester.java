package com.structural.flyweight;

public class Tester implements Employee {

	private String skill;
	
	
	public Tester()
	{
		
	}
	
	
	@Override
	public void job() {
         
		 System.out.println("Hey iam the tester !!!!" + "Skill :" + this.skill);
	}

	@Override
	public String changeSkill(String skill) {
		this.skill = skill;
		return this.skill;
	}

}
