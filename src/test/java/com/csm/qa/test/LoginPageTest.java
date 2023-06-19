package com.csm.qa.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import com.csm.qa.base.CSMBase;
import com.csm.qa.pages.HomePage;
import com.csm.qa.pages.LoginPage;

//
//public class LoginPageTest extends CSMBase{
//	LoginPage loginPage;
//	HomePage homePage;
//	
////	 @BeforeTest
////       public void excelDataImport() throws EncryptedDocumentException, IOException {
////		
////		FileInputStream file =new FileInputStream("D:\\Eclipse_rohit\\PO_Screen_Data.xlsx");
////		Sheet sh= WorkbookFactory.create(file).getSheet("Sheet");
////		//String shipNo=sh.getRow(1).getCell(1).getStringCellValue();
////	    //driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(shipNo);
////	   // System.out.println(shipNo);  
////	    
////	}
//	
//    @BeforeMethod
//	public void setup() throws InterruptedException
//	{
//		initialize();
//		loginPage= new LoginPage(driver);
//	}
//	
// //Validate Login with Valid Credentials 
//	@Test(priority=1)
//	public void LoginWithValidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		
//		FileInputStream file =new FileInputStream("D:\\Eclipse_rohit\\PO_Screen_Data.xlsx");
//		Sheet sh= WorkbookFactory.create(file).getSheet("Sheet");
//		
//       // homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        //homePage=loginPage.login("Admin", "AdminQA1");
//        loginPage.loginCredentials("Admin", "AdminQA1");
//		Thread.sleep(1000);
//		String homePagetitle= driver.getTitle();
//		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
//		System.out.println("Test 1 passed");
//	
//       // String shipNo=sh.getRow(1).getCell(1).getStringCellValue();
//	    //driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(shipNo);
//	   // System.out.println(shipNo);
//	    
//        driver.quit();
//	}
//	
//	//@Test(priority=2)
//	public void LoginWithInvalidCredentialss() throws InterruptedException
//	{
//		
//       // homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        //homePage=loginPage.login("Admin", "AdminQA1");
//        loginPage.loginCredentials("Admi", "AdminQA1");
//		Thread.sleep(1000);
//		String homePagetitle= driver.getTitle();
//		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
//		System.out.println("Test 1 passed");
//		driver.quit();
//	}
//	
//}





public class LoginPageTest extends CSMBase{
	LoginPage loginPage;
	HomePage homePage;

    @BeforeMethod
	public void setup() throws InterruptedException
	{
		initialize();
		loginPage= new LoginPage(driver);
	}
	
 //Validate Login with Valid Credentials 
	@Test(priority=1)
	public void LoginWithValidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		// homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        //homePage=loginPage.login("Admin", "AdminQA1");
        loginPage.loginCredentials("Admin", "AdminQA1");
		Thread.sleep(1000);
		String homePagetitle= driver.getTitle();
		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
		System.out.println("Test 1 passed");
        driver.quit();
	}
	
	@Test(priority=2)
	public void LoginWithInvalidCredentialss() throws InterruptedException
	{

        loginPage.loginCredentials("Admin", "AdminQA1");
		Thread.sleep(1000);
		String homePagetitle= driver.getTitle();
		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
		System.out.println("Test 1 passed");
		driver.quit();
	}
	
}