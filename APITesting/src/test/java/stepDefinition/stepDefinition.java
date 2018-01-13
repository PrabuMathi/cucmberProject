package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinition {

	@Given("^I am in gmail homepage$")
	public void i_am_in_gmail_homepage() throws Throwable {
System.out.println("1");
}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
		System.out.println("2");
	}

	@Then("^I click on signin$")
	public void i_click_on_signin() throws Throwable {
		System.out.println("3");
	}

	@Then("^Application should navigate to my account homepage$")
	public void application_should_navigate_to_my_account_homepage() throws Throwable {
		System.out.println("4");
	}
}
