package com.lm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lm.qa.base.TestBase;
import com.lm.qa.testcases.ChromeDriverTest;
import com.lm.qa.testcases.ChromeTest;
import com.lm.qa.utility.TestUtil;

public class LoginPage extends TestBase {

	
	private WebDriver driver;
	

	// Page Factory - ObjectRepository(OR)
	  @FindBy(xpath="//a[text()='Basic Auth']")
	  WebElement Auth;
	  
	  @FindBy(xpath="//*[@id=\\\"content\\\"]/div/h3\")")
	  WebElement screentext1;
	 
	  @FindBy(name="password") WebElement password;
	 
	 @FindBy(xpath="//input[@type='submit']") 
	 WebElement login_btn;
	 
	 @FindBy(xpath="//font[@color='red']") 
	 WebElement signup_btn;
	 
	
	

	// CRM Image

	// Initialising the Page Objects
	/*
	 * public LoginPage() { PageFactory.initElements(driver,
	 * this);//PageFactory.initElements(driver, this); }
	 */

	// Actions

	
	public LoginPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		
		this.driver=d;
	}

	public void HandleAuth() { 
	//Auth.click();
		
	String uname = prop.getProperty("username");
	String pass = prop.getProperty("password");
	String url1 = "http://" + uname + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
	driver.get(url1);
	/*Alert alert = driver.switchTo().alert();
	alert.accept();*/
	 }
	 
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}

	

	

	public void screenPic() throws IOException {
		// TODO Auto-generated method stub
		String screename= "LoginPage";
		TestUtil tu= new TestUtil();
		tu.takeScreenShot(screename);
		
	}

	

	

	// validateCRMLogo Method to be added

	/*
	 * public HomePage login(String un, String pwd) { HomePage hp= new HomePage();
	 * username.sendKeys(un); password.sendKeys(pwd); login_btn.click();
	 * 
	 * return hp; }
	 */

}
