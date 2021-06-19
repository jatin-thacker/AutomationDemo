package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	static By unameLocator = By.id("text");
	static By pwdLocator = By.id("password");
	static By submitLocator = By.id("login-button");
	
	public static void setUsername(WebDriver driver, String uname) {
		driver.findElement(unameLocator).sendKeys(uname);
	}
	
	public static void setPwd(WebDriver driver, String pwd) {
		driver.findElement(pwdLocator).sendKeys(pwd);
	}
	
	public static WebElement getSubmitButton(WebDriver driver) {
		WebElement button = driver.findElement(submitLocator); 
		return button;
	}
}
