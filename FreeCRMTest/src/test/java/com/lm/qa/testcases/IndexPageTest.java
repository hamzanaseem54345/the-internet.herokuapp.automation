package com.lm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lm.qa.base.TestBase;
import com.lm.qa.pages.HomePage;
import com.lm.qa.pages.IndexPage;
import com.lm.qa.pages.LoginPage;

public class IndexPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	String title;
	
	public IndexPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		
	}
	@Test(priority=0)
	
	public void indexsuccess() {
		title= driver.getCurrentUrl();
		Assert.assertEquals(title, "http://the-internet.herokuapp.com/");
		System.out.println(title);
	}
	
	/*@Test(priority=1)
	public void loginPageTitleTest(){
		title =.validateLoginPageTitle();
		Assert.assertEquals(title, "The Internet");
	}*/

	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}


