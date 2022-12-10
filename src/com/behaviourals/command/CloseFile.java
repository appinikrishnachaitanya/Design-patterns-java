package com.behaviourals.command;

public class CloseFile implements Command {
	
 private FileSystem filesystem;
	 
	 public CloseFile(FileSystem file) {
		
		 this.filesystem = file;
	}
	 
	 @Override
	public void execute() {
		 
		 filesystem.CloseFile();
		
	}

}
