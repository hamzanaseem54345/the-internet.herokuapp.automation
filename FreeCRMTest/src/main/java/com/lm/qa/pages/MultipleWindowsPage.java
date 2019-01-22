package com.lm.qa.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lm.qa.base.TestBase;
import com.lm.qa.utility.TestUtil;

public class MultipleWindowsPage extends DriverClass  {

	// OR //a[text()='Multiple Windows']
	

	/*@FindBy(xpath = "//a[text()='Multiple Windows']")
	WebElement multiplewindow;

	@FindBy(xpath = "//a[text()='Click Here']")
	WebElement newwindowclick;

	@FindBy(xpath = "/html/body/div/h3")
	WebElement newwindowtext;*/
	

	public void clickheretodirecttowindow(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement element = driver.findElement(By.linkText("Multiple Windows"));
		/*JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		 * 
		executor.executeScript("arguments[0].click();", element);*/
		element.click();
		
	}

	public void verifynewwindow(WebDriver driver) throws InterruptedException, IOException {
		String parentwindow = driver.getWindowHandle();
		Set <String> allwindows=driver.getWindowHandles();
        for(String child:allwindows)
        {
        	if(!parentwindow.equalsIgnoreCase(child))
        		driver.switchTo().window(child);
        	
        	TestUtil tutil = new TestUtil();
    		tutil.takeScreenShot( driver, "newwindow");
    		//String temp = newwindowtext.getText();
    		
    		//Assert.assertEquals("New Window", temp);	
        }
        String childwindow=driver.getWindowHandle();
        System.out.println("Verified we have switched to child window: "+childwindow);
        driver.close();
        
		driver.switchTo().window(parentwindow);
		System.out.println("This is now a parent window: "+parentwindow);
		

	}

	public void clickheretodirecttonewwindow(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.xpath("//a[text()='Click Here']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	
		
	}


