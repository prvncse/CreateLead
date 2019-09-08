package org.CreateLead.Pages;

import org.CreateLead.base.ProjSpec;
import org.openqa.selenium.WebElement;

public class CreateLead extends ProjSpec
{
public CreateLead EnterCompanyName()
{
	driver.findElementById("createLeadForm_companyName").sendKeys("medind");
	return this;
	
}
public CreateLead EnterFirstName() 
{
	WebElement firstname = driver.findElementById("createLeadForm_firstName");
	firstname.sendKeys("praveen1");
	return this;
}
public CreateLead EnterLastName() 
{
	driver.findElementById("createLeadForm_lastName").sendKeys("kumar1");
	return this;
}
public ViewLead ClickCreateLead()
{
	driver.findElementByName("submitButton").click();
	return new ViewLead();
}
}
