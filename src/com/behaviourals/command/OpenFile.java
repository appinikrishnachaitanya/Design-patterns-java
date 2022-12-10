package com.behaviourals.command;

public class OpenFile implements Command {

	
	 private FileSystem filesystem;
	 
	 public OpenFile(FileSystem file) {
		
		 this.filesystem = file;
	}
	 
	 @Override
	public void execute() {
		 
		 filesystem.openFile();
		
	}
}
