package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefination {
	
@Given("^User is on gmail home page$")
	public void home_page()
	{
		System.out.println("code for user is on login page");
	}
@Then ("^Enter username =archana$")	
	public void username()
	{
		System.out.println("code for entering username");
	}
@And("^Enter Password=archana123$")	
public void password()
{
	System.out.println("code for entering password");
}
@And("^Click on signUp$")	
public void signUp()
{
	System.out.println("code for signUp");
}

@But("^Check user is on home page$")	
public void IsHome_page()
{
	System.out.println("code for whether user is on home page");
}

@When ("^user is on home page and signedup sucessfully,close the browser$")	
public void SignesSucess()
{
	System.out.println("code for whether user is signedup sucessfully");
}

}
