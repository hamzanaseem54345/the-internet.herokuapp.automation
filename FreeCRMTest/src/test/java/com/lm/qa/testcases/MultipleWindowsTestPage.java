package com.lm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lm.qa.base.TestBase;
//import com.lm.qa.pages.HomePage;
import com.lm.qa.pages.IndexPage;
import com.lm.qa.pages.LoginPage;
import com.lm.qa.pages.MultipleWindowsPage;
import com.lm.qa.utility.TestUtil;

public class MultipleWindowsTestPage extends TestBase {

	IndexPage indexpage = new IndexPage();
	LoginPage loginPage;
	// HomePage homePage;
	LoginTest logintest;
	DropDownTest dptest = new DropDownTest();
	MultipleWindowsPage mwp;
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	String title;
/*@DataProvider(name = "Authentication")
	 
	 public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	  }*/

	public MultipleWindowsTestPage() {
		super();
		
	}

	@BeforeTest
	public void setUp() {
		initialization();

	}
	

	@Test(priority = 0/*,dataProvider="Authentication"*/)
	
	public void previousFunctions() throws InterruptedException, IOException {

		dptest.previousFunctions();
		dptest.dropdownactions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(6000);

	}

	@Test(priority = 1)
	public void windowHandlingAction() throws InterruptedException, IOException {
		mwp = new MultipleWindowsPage();
		mwp.clickheretodirecttowindow();
		Thread.sleep(400);
		mwp.clickheretodirecttonewwindow();
		mwp.verifynewwindow();
		Thread.sleep(5000);
	}

	@AfterTest
	//@Parameters({"sheetNum","rowNum","cellNum"})
	public void tearDown() throws Exception {
		TestUtil tutil = new TestUtil();
		
		System.out.println(tutil.readExcel(0,0,1));
		tutil.writeExcel(0, 1, 1, "PASSED");
		driver.close();
	}

}
