package sheetData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class ExcelSheetData {
	

   public void excelSheetDataMethod() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
//	   FileInputStream file =new FileInputStream("D:\\Eclipse_rohit\\CMSWFH(1.3)MASTER\\src\\main\\java\\com\\csm\\qa\\testdata\\PO_Screen_Data.xlsx");
//	   Sheet sh= WorkbookFactory.create(file).getSheet("Sheet");
//	   String shipNo=sh.getRow(1).getCell(1).getStringCellValue();
//	    //driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(shipNo);
//	   System.out.println(shipNo);
//	   System.out.println("Excel sheet ship no");
	   
	 //Path of the excel file
	  // FileInputStream fs = new FileInputStream("C:\\ExcelSheet\\PO_Screen_Data.xlsx");
	  // ("user.dir")+"/test-output/FinalTestRport.html"
	   
	  
	   try {
		   
		   FileInputStream fs = new FileInputStream("C:\\ExcelSheet\\PO_Screen_Data.xlsx");
		   //Creating a workbook
		   XSSFWorkbook workbook = new XSSFWorkbook(fs);
		   XSSFSheet sheet = workbook.getSheetAt(0);
		   Row row = sheet.getRow(1);
		   Cell cell = row.getCell(1);
		   System.out.println(sheet.getRow(1).getCell(1));
	   }
	   catch(FileNotFoundException e){
		   
		System.out.println("catched FiledNotFoundException in catch block");
	   }
	   System.out.println("try catch ended");
	   
	  }
}
