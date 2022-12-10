package com.revision.patterns;

public class XmlDaoFactory extends DaoProducerAbs {
	
	private  DaoSave dao;
	
	

	@Override
	DaoSave createDao(String type) {
		// TODO Auto-generated method stub
		if(type.equals("emp"))
		{
		   dao = new XmlDaoEmp();	
		}
		else if(type.equals("dept"))
		{
		   dao = new XmlDaoDept();	
		}
		
		return dao;
	}

	

}
