package org.CreateLead.Pages;

import org.CreateLead.base.ProjSpec;

public class Leads extends ProjSpec
{
public CreateLead ClickLeads()
{
	driver.findElementByLinkText("Create Lead").click();
	return new CreateLead();
	
}
}
