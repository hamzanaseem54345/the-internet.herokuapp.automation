package com.lm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lm.qa.base.TestBase;

public class DropDownPage extends TestBase {

	@FindBy(xpath="//a[text()='Dropdown']")
	WebElement dropdown;
	
	@FindBy(xpath = "//select[@id='dropdown']")
	WebElement dropdownlist1;

public DropDownPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

public void dropdownlinkclick()
{
	dropdown.click();
}

public void dropdwonselection()
{
	Select dropdownlist = new Select(dropdownlist1);
    dropdownlist.selectByIndex(1);
    //dropdownlist.selectByVisibleText("Option 1");
    dropdownlist.selectByIndex(2);
    //List<WebElement> list= new ArrayList<WebElement>();
    //dropdownlist.getAllSelectedOptions();
    //System.out.println(list);
}



}
