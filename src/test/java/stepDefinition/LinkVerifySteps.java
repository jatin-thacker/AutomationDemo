package stepDefinition;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;

import common.BaseClass;
import cucumber.api.java.en.When;
import pages.HomePage;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LinkVerifySteps extends BaseClass {
	//Variables 
	Boolean linksBroken = false;
	List<String> outputList = new ArrayList<String>();
	//Step Definitions start here 
	@Given("^I am present on the home page of the WebDriver$")
	public void i_am_present_on_the_home_page_of_the_WebDriver() {
    	HomePage.open(BaseClass.driver);
	}
	
	@When("^I check all the links$")
	public void i_check_all_the_links() {
		String homePage = "http://webdriveruniversity.com";
    	String url = "";
    	HttpURLConnection huc = null;
	    int respCode = 200;
	    List <WebElement> allLinks = HomePage.getAllLinks(driver);
	    for (WebElement link : allLinks) {
	    	url = link.getAttribute("href");
	    	if ( url == null || url.isEmpty() ) {
	    		outputList.add(link.getAttribute("href")+ "URL is not configured or anchor tag is empty");
	    		continue;
	    	}
	    	if (!url.startsWith(homePage)){
	    		outputList.add(link.getAttribute("href")+ "URL belongs to other domain, skipping it");
	    		continue;
            }
	    	try 
	    	{
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                if(respCode >= 400){
                	outputList.add(link.getAttribute("href") +" is a broken link");
                	linksBroken = true;
                }
                else{
                	outputList.add(link.getAttribute("href") +" is a valid link");
                }
            } 
	    	catch (Exception e) {
	            System.out.println(e.getLocalizedMessage());
	        }        
	    }
	}
	
	@Then("^All the links should return a succcess return code$")
	public void all_the_links_should_return_a_succcess_return_code() {
		for (String message : outputList)
			System.out.println(message);
		BaseClass.driver.quit();
		if(linksBroken)
			Assert.fail("Links invalid");
	}
	// Step Definitions end here 
}
