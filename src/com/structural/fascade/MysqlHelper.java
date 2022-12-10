package com.structural.fascade;

import java.sql.Connection;

public class MysqlHelper {
	
	
	public static Connection getMysqlConnection()
	{
		return null;
	}
	
	public void generateMysqlPDFReport(String tablename , Connection con)
	{
		System.out.println("MYSQL + PDF");
	}
	
	public void generateMysqlHTMLReport(String tablename , Connection con)
	{
		System.out.println("MYSQL+HTML");
	}
	
	

}
