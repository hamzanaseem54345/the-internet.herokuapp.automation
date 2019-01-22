package com.lm.qa.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lm.qa.base.TestBase;
import com.lm.qa.pages.LoginPage;

public class IndexPageTest extends TestBase {

	LoginPage loginPage;
    String title;

	public IndexPageTest() {
		super();
	}

	@BeforeMethod

	public void setUp() {
		initialization();
		/*loginPage = new LoginPage(getDriver());*/

	}

	@Test(priority = 0)

	public void indexsuccess() {
		title = getDriver().getCurrentUrl();
		AssertJUnit.assertEquals(title, "http://the-internet.herokuapp.com/");
		System.out.println(title);
	}

	@AfterMethod

	public void tearDown() {
		getDriver().quit();
	}

}
