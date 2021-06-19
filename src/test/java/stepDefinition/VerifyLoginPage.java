package stepDefinition;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import common.BaseClass;
import cucumber.api.java.en.Then;

public class VerifyLoginPage extends BaseClass{
	
	
	@When("I click the login button")
	public void click_the_login_button() {
		HomePage.getLoginButton(BaseClass.driver).click();
	}
	
	@When("Enter the \"([^\"]*)\" as username and \"([^\"]*)\" as password")
	public void enter_the_credentials(String uname, String pwd) {
		LoginPage.setUsername(BaseClass.driver, uname);
		LoginPage.setPwd(BaseClass.driver, pwd);
		LoginPage.getSubmitButton(BaseClass.driver).click();
	}
	
	@Then("The user should get a pop-up")
	public void verify_login() {
		System.out.println(BaseClass.driver.switchTo().alert().getText());
	}
}