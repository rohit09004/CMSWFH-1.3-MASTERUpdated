package sheetData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

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
		   
		  // System.out.println("try blocked started");
		   File file =new File("C:\\DATA\\POJune2023");
		   FileInputStream fs = new FileInputStream(file);
          //Creating a workbook
		  
		   XSSFWorkbook workbook = new XSSFWorkbook(fs);
		   XSSFSheet sheet = workbook.getSheetAt(0);
		   Row row = sheet.getRow(1);
		   Cell cell = row.getCell(3);
		   System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());
//		   System.out.println("try blocked ended");
//		   System.out.println("try block executed");
	   }
	   
//   catch(FileNotFoundException e){
//		   
//		   System.out.println("catched blocked started");
//		
//		  // File file =new File("C:\\DATA\\POJune2023.xlsx");
//		   
//		   FileSystem fileSystem = FileSystems.getDefault();
//           Path path = fileSystem.getPath("C:\\DATA\\POJune2023.xlsx");
//           System.out.println(path.getFileName().toString());
//           FileInputStream fs = new FileInputStream(path.getFileName().toString());
//		   XSSFWorkbook workbook = new XSSFWorkbook(fs);
//		   XSSFSheet sheet = workbook.getSheetAt(0);
//		   Row row = sheet.getRow(1);
//		   Cell cell = row.getCell(3);
//		   System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());  
//		 //  System.out.println("start print stack trace");
//		//   e.printStackTrace();
//		   System.out.println("catched blocked executed for FiledNotFoundException");
//		   System.out.println("catched blocked eneded");
//	   }
	   
	   
	   catch(FileNotFoundException e){
		   
		   System.out.println("catched blocked started");
		 //  File file =new File($(System.DefaultWorkingDirectory)+"\\POJune2023.xlsx"); 
		  // File file =new File("\\POJune2023.xlsx"); 
		   //Path path = FileSystems.getDefault().getPath("C:\\DATA\\POJune2023.xlsx").toAbsolutePath();
		 //  path.getFileName();
		   //String Path1= path.getFileName().toString();
		  
		   File file =new File("POJune2023.xlsx");
		   System.out.println(file.getAbsolutePath());
           String Path1= file.getAbsolutePath().toString();
		   FileInputStream fs = new FileInputStream(Path1);
		   //FileInputStream fs = new FileInputStream();
		   XSSFWorkbook workbook = new XSSFWorkbook(fs);
		   XSSFSheet sheet = workbook.getSheetAt(0);
		   Row row = sheet.getRow(1);
		   Cell cell = row.getCell(3);
		   System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());  
		 //  System.out.println("start print stack trace");
		//   e.printStackTrace();
//		   System.out.println("catched blocked executed for Filed Not Found Exception");
		   System.out.println("catched blocked eneded");
	   }
//	   System.out.println("try-catch block ended");
	   
	  }
}
