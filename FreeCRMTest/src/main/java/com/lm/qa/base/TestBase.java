package com.lm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.lm.qa.pages.DriverClass;
import com.lm.qa.pages.LoginPage;
import com.lm.qa.utility.TestUtil;

public class TestBase extends DriverClass{

	
	//public static ChromeDriver driver1;
	
	
	public TestBase() {
		try {
			prop = new Properties();
//FileReader or FileInputStream but FileReader because its the best way to read character files
			FileReader fr = new FileReader(
					"C:\\Users\\Hamza\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\lm\\qa\\config\\config.properties");

			try {
				prop.load(fr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initialization()
	{
		
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:/Drivers-Selenium/chromedriver.exe");
		        setDriver(new ChromeDriver());
		}
		else {
			System.setProperty("webdriver.ie.driver","D:/Drivers-Selenium/IEDriverServer.exe" );
		    setDriver(new InternetExplorerDriver());
	}
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		
	
	}
	
	
}
