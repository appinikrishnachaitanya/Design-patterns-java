package com.behaviourals.command;

public class UnixSystem implements FileSystem {

	@Override
	public void openFile() {
		
		System.out.println("its unix System");
		
	}

	@Override
	public void CloseFile() {
 
		 System.out.println("its unix system");
	}

	@Override
	public void writeFile() {
		System.out.println("its unix system");
		
	}

}
