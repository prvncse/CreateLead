package org.CreateLead.TestCases;

import org.testng.annotations.Test;
import org.CreateLead.Pages.Login;
import org.CreateLead.base.ProjSpec;
import org.testng.annotations.Test;

public class TC001_CreateLead extends ProjSpec{
	@Test
	public void runTC001( ) 
	{
		new Login().SendUSerName().clickSendPassword().
		ClickButton().ClickCrmsfa().ClickLeads().
		EnterCompanyName().EnterFirstName().
		EnterLastName().ClickCreateLead().verify();
	}

}
