package com.lm.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Priority;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lm.qa.base.TestBase;
import com.lm.qa.pages.HomePage;
import com.lm.qa.pages.IndexPage;
import com.lm.qa.pages.LoginPage;

public class LoginTest extends TestBase{
    IndexPage indexpage;
	LoginPage loginPage;
	HomePage homePage;
	String title;
	
	public LoginTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		
	}
	
	@Test(priority=3)
	public void loginsucess() throws InterruptedException, IOException {
		loginPage = new LoginPage();
		//indexpage= new IndexPage();
		loginPage.screenPic();
		//String screentext1=title1.getText();
		//Assert.assertEquals(title, "http://the-internet.herokuapp.com/");
		//System.out.println(text);
		Thread.sleep(3000);
	}
    @Test(priority=0)
	
	public void loginWithUrl() throws InterruptedException {
    	loginPage = new LoginPage();
		indexpage= new IndexPage();
		loginPage.HandleAuth();
		//System.out.println(screentext1);
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void loginPageTitleTest(){
		loginPage = new LoginPage();
		indexpage= new IndexPage();
		title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "The Internet");
		
	}
	
	/*@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}*/
	
	/*@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}*/
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}