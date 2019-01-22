package com.lm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lm.qa.base.TestBase;

public class IndexPage extends TestBase {
	
	@FindBy(xpath="//a[text()='Basic Auth']")
	WebElement Auth;

	@FindBy(xpath="//a[text()='Multiple Windows']")
	WebElement mwlink;
	
	public IndexPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	//Actions
	 public LoginPage loginSuccess()
	 {
		 LoginPage lp=new LoginPage();
		  lp.HandleAuth(getDriver());
		 return lp;
	 }
	 
	 public void clickMWLink()
	 {
		 mwlink.click();
	 }
}
