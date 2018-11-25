package com.lm.qa.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lm.qa.base.TestBase;

public class TestUtil extends TestBase {

	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;
	
	public void takeScreenShot(String screename) throws IOException
	{
		TakesScreenshot ts;
		ts= (TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		File destfile= new File("./Screenshot/"+screename+".jpg");
		FileUtils.copyFile(srcfile, destfile);
		
	}
}
