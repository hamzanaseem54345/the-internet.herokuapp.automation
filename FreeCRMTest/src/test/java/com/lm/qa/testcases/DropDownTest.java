package com.lm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lm.qa.base.TestBase;
import com.lm.qa.pages.DropDownPage;
import com.lm.qa.pages.HomePage;
import com.lm.qa.pages.IndexPage;
import com.lm.qa.pages.LoginPage;

public class DropDownTest extends TestBase {
	
	IndexPage indexpage;
	LoginPage loginPage;
	HomePage homePage;
	LoginTest logintest;
	String title;
	
	public DropDownTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		
	}
	
	@Test(priority=0)
	public void previousFunctions() throws InterruptedException, IOException 
	{
		logintest= new LoginTest();
		logintest.loginWithUrl();
		driver.navigate().back();
		
	}
	
	@Test(priority=1)
	public void dropdownactions() throws InterruptedException {
	DropDownPage ddp=new DropDownPage();
	ddp.dropdownlinkclick();
	ddp.dropdwonselection();
	//Thread.sleep(3000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}