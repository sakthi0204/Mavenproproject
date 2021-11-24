package com.helpers;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFrm() {
		FileReaderManager reader= new FileReaderManager();
		return reader;
	}
	
	public Configuration_Reader getinstanceCR() throws Throwable {
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}

}
