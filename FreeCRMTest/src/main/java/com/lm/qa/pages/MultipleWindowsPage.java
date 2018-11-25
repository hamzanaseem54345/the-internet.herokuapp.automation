package com.lm.qa.pages;

import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.lm.qa.base.TestBase;
import com.lm.qa.utility.TestUtil;

public class MultipleWindowsPage extends TestBase {

	// OR //a[text()='Multiple Windows']
	

	@FindBy(xpath = "//a[text()='Multiple Windows']")
	WebElement multiplewindow;

	@FindBy(xpath = "//a[text()='Click Here']")
	WebElement newwindowclick;

	@FindBy(xpath = "/html/body/div/h3")
	WebElement newwindowtext;

	public void clickheretodirecttowindow() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		

	}

	public void verifynewwindow() throws InterruptedException, IOException {
		String parentwindow = driver.getWindowHandle();
		Set <String> allwindows=driver.getWindowHandles();
        for(String child:allwindows)
        {
        	if(!parentwindow.equalsIgnoreCase(child))
        		driver.switchTo().window(child);
        	
        	TestUtil tutil = new TestUtil();
    		tutil.takeScreenShot("newwindow");
    		//String temp = newwindowtext.getText();
    		
    		//Assert.assertEquals("New Window", temp);	
        }
        String childwindow=driver.getWindowHandle();
        System.out.println("Verified we have switched to child window: "+childwindow);
        driver.close();
        
		driver.switchTo().window(parentwindow);
		System.out.println("This is now a parent window: "+parentwindow);
		

	}

	public void clickheretodirecttonewwindow() throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.xpath("//a[text()='Click Here']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

}
