package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static By contactUsButton = By.id("contact-us");
	static By loginButton = By.id("login-portal");
	public static void open(WebDriver driver) {
		driver.get("http://webdriveruniversity.com/index.html");
	}

	public static List<WebElement> getAllLinks(WebDriver driver) {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		return links;
	}
	
	public static WebElement getContactUsButton(WebDriver driver) {
		WebElement button = driver.findElement(contactUsButton);
		return button;
	}
	
	public static WebElement getLoginButton(WebDriver driver) {
		WebElement button = driver.findElement(loginButton);
		return button;
	}
}
