package Logintest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaceClass;

public class ToVerifyHomePageTitle extends BaceClass {
@Test

	public void toVerifyHomePage() throws EncryptedDocumentException, IOException {

		  
		   String expectedTitle = eUtils.fetchDataFromExcleSheets("sheet2", 1, 0);
		   String actualTitle = driver.getTitle();
		  
		   Assert.assertEquals(actualTitle, expectedTitle);
	       driver.quit();
	}
		  
		  
}


