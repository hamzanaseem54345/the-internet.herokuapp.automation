package com.lm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lm.qa.allPreviousFunctions.PreviousFunctionPage;
import com.lm.qa.base.TestBase;
import com.lm.qa.pages.IndexPage;
import com.lm.qa.pages.LoginPage;
import com.lm.qa.pages.MouseHovering;
import com.lm.qa.utility.TestUtil;

public class MouseHoveringTest  extends TestBase{
	IndexPage indexpage = new IndexPage();
	MultipleWindowsTestPage mwtp= new MultipleWindowsTestPage();
	LoginPage loginPage;
	LoginTest logintest;
	DropDownTest dptest = new DropDownTest();
	MouseHovering mhv;
	TestUtil tutil = new TestUtil();
	
	String title;
/*@DataProvider(name = "Authentication")
	 
	 public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	  }*/

	 public MouseHoveringTest() {
		// TODO Auto-generated constructor stub
		super();	
	}

	@BeforeTest
	public void setUp() throws InterruptedException, IOException {
		initialization();
		
		

	}
	

	//@Test(priority = 0/*,dataProvider="Authentication"*/)
	
	/*@Test(priority=0)
	public void prevoisFunctions() throws InterruptedException, IOException
	{
	pvp.previousFunctions();
	}*/
        
	
	@Test(priority = 1)
	public void mouseHoveringAction() throws InterruptedException, IOException {
		mhv = new MouseHovering();
		mhv.clickTheHoverLink();
		Thread.sleep(400);
		mhv.hoverTheMouseOverElements();
		tutil.takeScreenShot(getDriver(),"MouseHovering");
		mhv.clickTheLinkWithImage1();
		
		Thread.sleep(3000);
	}

	@AfterTest
	//@Parameters({"sheetNum","rowNum","cellNum"})
	
	public void tearDown() throws Exception {
		System.out.println(tutil.readExcel(0,0,1));
		tutil.writeExcel(0, 1, 2, "PASSED");
		getDriver().quit();
	}

}


