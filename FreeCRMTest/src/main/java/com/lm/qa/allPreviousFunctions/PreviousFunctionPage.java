package com.lm.qa.allPreviousFunctions;

import java.io.IOException;

import com.lm.qa.base.TestBase;
import com.lm.qa.testcases.ChromeTest;
import com.lm.qa.testcases.DropDownTest;
import com.lm.qa.testcases.LoginTest;
import com.lm.qa.testcases.MouseHoveringTest;
import com.lm.qa.testcases.MultipleWindowsTestPage;

public class PreviousFunctionPage extends TestBase {
	
	
	LoginTest lt= new LoginTest();
	DropDownTest dpt=new DropDownTest();
	MultipleWindowsTestPage mwt= new MultipleWindowsTestPage();
	MouseHoveringTest mhvt= new MouseHoveringTest();
	ChromeTest ct=new ChromeTest();
	
	public void previousFunctions() throws InterruptedException, IOException {
		lt.loginWithUrl();
		lt.loginPageTitleTest();
		lt.loginsucess();
		getDriver().navigate().back();
		dpt.dropdownactions();
		getDriver().navigate().back();
		mwt.windowHandlingAction();
		getDriver().navigate().back();
		/*mhvt.mouseHoveringAction();
		driver.get(prop.getProperty("url"));*/
	}

}
