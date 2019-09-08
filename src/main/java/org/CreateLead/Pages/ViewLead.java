package org.CreateLead.Pages;

import org.CreateLead.base.ProjSpec;

public class ViewLead extends ProjSpec
{
public ViewLead verify()
{
	
	if(driver.findElementById("viewLead_firstName_sp").getText().contains("praveen"))
	{
		System.out.println("matches");
	}
	else
	{
		System.out.println("not matched");
	}
		
	return this;
	
}
}
