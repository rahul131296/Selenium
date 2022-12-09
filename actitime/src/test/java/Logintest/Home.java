package Logintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Home {
	public static void main(String[] args) throws IOException {
   
		//in this line we fetch the data from the file where we store the information about the home page url and id password.
		//this is because in real time we change the user name and id many time and we have many text script.
		//so we put this information in one place so we put that information there and easily we fetch that data.
		FileInputStream fis = new FileInputStream("./testdata/propertydata2.properties");
		Properties property = new Properties();
		//this line is used to loading the value key of the property file.
		property.load(fis);
		//this method is used to calling the value of the property file.
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password= property.getProperty("password");
		//now we fetch the data from the excle file.
		
		FileInputStream fis1 = new FileInputStream("./testdata/excleData1.xlsx");
	    Workbook workbook = WorkbookFactory.create(fis1);

}
}
