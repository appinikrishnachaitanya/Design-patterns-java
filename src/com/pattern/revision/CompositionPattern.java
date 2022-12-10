package com.pattern.revision;

import java.io.File;

public class CompositionPattern {
	
	
	public static void getAlltheFiles(String pathName)
	{
		File f = new File(pathName);
		
		File[] dirFiles = f.listFiles();
		
		for(int i=0; dirFiles!=null&i<dirFiles.length; i++)
		{
			if(dirFiles[i].isFile())
			{
				System.out.println(dirFiles[i]);
			}
			else if(dirFiles[i].isDirectory())
			{
				getAlltheFiles(dirFiles[i].getAbsolutePath());
			}
		}
	}

	public static void main(String[] args) {
		
		 getAlltheFiles("D:\\files");

	}

}
