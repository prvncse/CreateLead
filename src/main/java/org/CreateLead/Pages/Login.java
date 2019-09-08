package org.CreateLead.Pages;

import org.CreateLead.base.ProjSpec;
import org.openqa.selenium.WebElement;


public class Login extends ProjSpec
{

	public Login SendUSerName()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
public Login clickSendPassword()
{
	WebElement passwordid = driver.findElementById("password");
	passwordid.sendKeys("crmsfa");
	return this;
}
public Home ClickButton()
{
	driver.findElementByClassName("decorativeSubmit").click();
	return new Home();
	
}

}
