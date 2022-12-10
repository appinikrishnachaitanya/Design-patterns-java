package com.behaviourals.command;

public class Factory {
	
	
	private static FileSystem filesystem;
	
	 public static FileSystem getFilesystem(String type)
	 {
		 if(type.equals("Win"))
		 {
			 filesystem = new WindowSystem();
		 }
		 
		 
		 else
			 
		 {
			 filesystem = new UnixSystem();
		 }
		 
		 return filesystem;
	 }

}
