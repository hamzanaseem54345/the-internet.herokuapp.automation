package com.lm.qa.pages;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lm.qa.base.TestBase;

public class MouseHovering extends TestBase {
	@FindBy(xpath = "//a[text()='Multiple Windows']")
	WebElement multiplewindow;

	@FindBy(xpath = "//a[text()='Click Here']")
	WebElement newwindowclick;

	@FindBy(xpath = "/html/body/div/h3")
	WebElement newwindowtext;
	
	@FindBy(xpath="//div[contains(@class, 'figure')]/child::img[@src='/img/avatar-blank.jpg']")
	WebElement img1element;
	
	@FindBy(xpath="(//div[contains(@class, 'figure')]/child::img[@src='/img/avatar-blank.jpg'])[1]")
	WebElement img1element1;
	
	@FindBy(xpath = "//a[contains(@href,'/users/1')]")
	WebElement image1link;
	
	public MouseHovering() {
	PageFactory.initElements(getDriver(), this);
	}
	public void clickTheHoverLink() throws InterruptedException {
		
		WebElement element = getDriver().findElement(By.linkText("Hovers"));
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		
	}
public void hoverTheMouseOverElements() throws InterruptedException {
		List <WebElement> eList=getDriver().findElements(By.xpath("//div[contains(@class, 'figure')]/child::img[@src='/img/avatar-blank.jpg']"));
		WebElement img1elements=eList.get(0);
		Actions action= new Actions(getDriver());
		action.moveToElement(img1elements).build().perform();
		Thread.sleep(2000);
		//image1link.click();
		
	}

public void clickTheLinkWithImage1()
{
	
	String text1=image1link.getTagName();
	String text2=image1link.getText();
	Point text3=image1link.getLocation();
	System.out.println(text1+" "+text2+" "+text3);
	image1link.click();
	
}
}
