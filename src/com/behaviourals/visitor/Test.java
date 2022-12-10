package com.behaviourals.visitor;

public class Test {

	public static void main(String[] args) {
		
		
		IItem items[] = {new Computer("111", 1000000) , new Computer("MB111", 10000)};
		
		ShoppingVisitorImpl svi = new ShoppingVisitorImpl();
		
		int sum = 0;
		
		for(IItem i : items)
		{
		   sum = sum+i.accept(svi); 	
		}
		
		System.out.println(sum);

	}

}
