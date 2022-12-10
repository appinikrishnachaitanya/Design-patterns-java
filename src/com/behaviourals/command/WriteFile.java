package com.behaviourals.command;

public class WriteFile implements Command {
   
	 private FileSystem filesystem;
	public WriteFile(FileSystem file) {
		this.filesystem = file;
	}

	@Override
	public void execute() {
	filesystem.writeFile();

	}

}
