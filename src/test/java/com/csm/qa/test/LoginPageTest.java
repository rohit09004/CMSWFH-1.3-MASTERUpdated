package com.csm.qa.test;
import org.testng.Assert;
import org.testng.annotations.*;
import com.csm.qa.base.CSMBase;
import com.csm.qa.pages.HomePage;
import com.csm.qa.pages.LoginPage;

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
	public void LoginWithValidCredentials() throws InterruptedException
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
	public void LoginWithInvalidCredentials() throws InterruptedException
	{
		
       // homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        //homePage=loginPage.login("Admin", "AdminQA1");
        loginPage.loginCredentials("Admi", "AdminQA1");
		Thread.sleep(1000);
		String homePagetitle= driver.getTitle();
		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
		System.out.println("Test 1 passed");
		driver.quit();
	}
	
}