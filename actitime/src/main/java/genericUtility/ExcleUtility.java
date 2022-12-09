package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcleUtility {

public String fetchDataFromExcleSheets(String sheetName, int row , int cell) throws EncryptedDocumentException, IOException{
	FileInputStream fis1 = new FileInputStream("./testdata/excleData1.xlsx");
    Workbook workbook = WorkbookFactory.create(fis1);
	
	
	return workbook.getSheet("Sheet2").getRow(1).getCell(0).toString();



}
}
