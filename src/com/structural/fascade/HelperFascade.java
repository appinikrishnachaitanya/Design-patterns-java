package com.structural.fascade;

import java.sql.Connection;

public class HelperFascade {
	
	
	public static void getgenerateReports(String dbtype , String tablename , String formatName)
	{
		  Connection con ;
		
		switch(dbtype)
		{
		case "MYSQL":
			        
			       con = MysqlHelper.getMysqlConnection();
			       MysqlHelper mysql = new MysqlHelper();
			       if(formatName.equals("HTML"))
			       {
			    	   mysql.generateMysqlHTMLReport(tablename, con);
			       }
			       
			       if(formatName.equals("PDF"))
			       {
			    	   mysql.generateMysqlPDFReport(tablename, con);
			       }
			       
			       break;
			       
		case "ORACLE":
			
			     con = OracleHelper.getOracelConnection();
			     OracleHelper oracle = new OracleHelper();
			     switch(formatName)
			     {
			     case "HTML":
					 oracle.generateOracleHTMLReport(tablename, con);
				 case "PDF":
					 oracle.generateOraclePDFReport(tablename, con);
					 break;
			     
			     }	 
				
				 break;
		        	 
			    
		  
		}
	}
	
	
	

}
