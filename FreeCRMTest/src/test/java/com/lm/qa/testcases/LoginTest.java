package com.lm.qa.testcases;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lm.qa.base.TestBase;
import com.lm.qa.pages.IndexPage;
import com.lm.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	IndexPage indexpage;
	LoginPage loginPage;

	String title;

	public LoginTest() {
		super();
	}

	
	@BeforeTest
	public void setUp() {
		initialization();

	}

	//@Test(priority = 3)
	public void loginsucess() throws InterruptedException, IOException {
		loginPage = new LoginPage(getDriver());
		loginPage.screenPic();
		
		Thread.sleep(3000);
	}

	@Test(priority = 0)

	public void loginWithUrl() throws InterruptedException {
		loginPage = new LoginPage(getDriver());
		loginPage.HandleAuth();
		// System.out.println(screentext1);
		Thread.sleep(5000);
	}

	//@Test(priority = 2)
	public void loginPageTitleTest() {
		loginPage = new LoginPage(getDriver());
		indexpage = new IndexPage();
		title = loginPage.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "The Internet");

	}

	
	
	@AfterTest
	public void tearDown() {
		getDriver().quit();
	}

}