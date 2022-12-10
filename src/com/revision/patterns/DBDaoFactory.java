package com.revision.patterns;

import com.revision.patterns.*;

public class DBDaoFactory extends DaoProducerAbs {
	
     private  DaoSave dao;
	
	

	@Override
	DaoSave createDao(String type) {
		if(type.equals("emp"))
		{
		   dao = new DBDaoEmp();	
		}
		else if(type.equals("dept"))
		{
		   dao = new DBDaoDept();	
		}
		
		return dao;
		
	}


}
