package com.lm.qa.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.lm.qa.knowledgebase.KnowledgeBase;

public class ChromeDriverTest extends KnowledgeBase {
	ChromeDriver driver;
    public ChromeDriverTest(ChromeDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	@Test
    public void getdriverTest(){
        KnowledgeBase kb = new KnowledgeBase(getDriver());
        //Rest of your test code
    }

	public ChromeDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
}
