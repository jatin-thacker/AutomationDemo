package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
	
	static By firstNameLocator = By.xpath("//input[@name='first_name']");
	static By lastNameLocator = By.xpath("//input[@name='last_name']");
	static By emailLocator = By.xpath("//input[@name='email']");
	static By messageLocator = By.xpath("//textarea[@name='message']");
	static By submitButtonLocator = By.xpath("//input[@value='SUBMIT']");
	
	
	public static void setFirstName(WebDriver driver, String firstName) {
		WebElement firstNameInput = driver.findElement(firstNameLocator);
		firstNameInput.sendKeys(firstName);
	}
	
	public static void setLastName(WebDriver driver, String lastName) {
		WebElement lastNameInput = driver.findElement(lastNameLocator);
		lastNameInput.sendKeys(lastName);
	}

	public static void setEmail(WebDriver driver, String email) {
		WebElement emailInput = driver.findElement(emailLocator);
		emailInput.sendKeys(email);
	}
	public static void setMessage(WebDriver driver, String message) {
		WebElement messageInput = driver.findElement(messageLocator);
		messageInput.sendKeys(message);
	}

	public static WebElement submitButton(WebDriver driver) {
		WebElement button = driver.findElement(submitButtonLocator);
		return button;
	}
}
