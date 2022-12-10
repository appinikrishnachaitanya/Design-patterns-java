package com.behaviourals.command;

public class WindowSystem implements FileSystem {

	@Override
	public void openFile() {
	
		System.out.println("its window system");
		
	}

	@Override
	public void CloseFile() {
		System.out.println("its window system");
		
	}

	@Override
	public void writeFile() {
		
		System.out.println("its window system");
		
	}

}
