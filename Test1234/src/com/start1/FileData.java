package com.start1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileData {

	
	public String PropertiesgetObj(String Value) throws IOException 
	{
		String paths="C:\\Users\\deepa.vadivel\\eclipse-workspace\\Test1234\\src\\com\\start1\\CommonData.properties";
		Properties ps=new Properties();
		FileInputStream fin=new FileInputStream(paths);
		ps.load(fin);
		return ps.getProperty(Value);
	}
}
