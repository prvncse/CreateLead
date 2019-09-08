package org.CreateLead.Pages;

import org.CreateLead.base.ProjSpec;

public class Home extends ProjSpec
{
public Leads ClickCrmsfa()
{
	driver.findElementByLinkText("CRM/SFA").click();
	return new Leads();
	
}
}
