package com.structural.fascade;

import java.sql.Connection;

public class OracleHelper {
	
	public static Connection getOracelConnection()
	{
		return null;
	}
	
	
	public void generateOraclePDFReport(String tablename , Connection con)
	{
		System.out.println("Oracle + PDF");
	}
	
	public void generateOracleHTMLReport(String tablename , Connection con)
	{
		System.out.println("ORacle+HTML");
	}
	
	
	

}
