package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String fetchFromPropertyFile(String Key) throws IOException{
	FileInputStream fis = new FileInputStream("./testdata/propertydata2.properties");
	Properties property = new Properties();
	//this line is used to loading the value key of the property file.
	property.load(fis);
	//this method is used to calling the value of the property file.
	return property.getProperty(Key);
	
	
	
	
	
	
	
	
	}

}
