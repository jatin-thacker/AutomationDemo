package stepDefinition;

import org.junit.Assert;

import common.BaseClass;
import common.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.ContactUsPage;
import pages.HomePage;
import cucumber.api.java.en.Then;

public class VerifyContactPage extends common.BaseClass {


	@Given("^I am present on the home page of the WebDriver University$")
	public void i_am_present_on_the_home_page_of_the_WebDriver_University() {
		HomePage.open(BaseClass.driver);
	}

	@When("^I click the Contact Us page$")
	public void i_click_the_Contact_Us_page() {
	    HomePage.getContactUsButton(BaseClass.driver).click();
		//stepDefinition.Hook.eyes.checkWindow("Contact Us Page");
	}
	
	@When("^I switch to the new tab$")
	public void swtich_tabs() {
	    Utilities.switchTabs(BaseClass.driver);
	}

	@When("^Enter the \"([^\"]*)\" as firstname, \"([^\"]*)\" as lastname, \"([^\"]*)\" as email and \"([^\"]*)\" as message$")
	public void enter_the_and(String firstName, String lastName, String email, String message) {
	    try{
			//stepDefinition.Hook.eyes.checkWindow("Contact Us Page before data is filled");
	    	Thread.sleep(1000);
		    ContactUsPage.setFirstName(BaseClass.driver, firstName);
		    Thread.sleep(1000);
		    ContactUsPage.setLastName(BaseClass.driver, lastName);
		    Thread.sleep(1000);
		    ContactUsPage.setEmail(BaseClass.driver, email);
		    Thread.sleep(1000);
		    ContactUsPage.setMessage(BaseClass.driver, message);
		    Thread.sleep(1000);
			//stepDefinition.Hook.eyes.checkWindow("Contact Us Page after data is filled");
		    ContactUsPage.submitButton(BaseClass.driver).click();
	    }   
	    catch(Exception e) {	
	    }
	}

	@Then("^The user should get success message$")
	public void the_user_should_get_success_message() {
	   boolean response;
		//stepDefinition.Hook.eyes.checkWindow("Contact Us Page Response");
	   response = pages.ContactUsResponsePage.verifySuccessMessage(BaseClass.driver);
	   if(response)
		  ;
	   else 
		   Assert.fail("Success message not received");
	}
	
	@Then("^The user should get error message as \"([^\"]*)\"$")
	public void the_user_should_get_error_message_as(String errorMessage) {
	    boolean passed;
	    passed = pages.ContactUsResponsePage.verifyFailureMessage(BaseClass.driver, errorMessage);
	    if(!passed) {
	    	Assert.fail("Error message not found");
	    }
	}
}
