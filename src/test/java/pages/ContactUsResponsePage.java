package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsResponsePage {
	static By successLocator = By.xpath("//*[contains(text(),'Thank You for your Message!')]");
	static By errorMessageLocator;
	public static boolean verifySuccessMessage(WebDriver driver) {
		boolean found = false;
		try {
			driver.findElement(successLocator);
			found = true; 
		}
		catch(Exception E) {
			System.out.println(E.getLocalizedMessage());
		}
		return found;
	}
	public static boolean verifyFailureMessage(WebDriver driver, String message) {
		boolean found = false;
		String actualTitle = driver.getTitle();
		String expectedTitle = "Contact form handler";
		if(!(actualTitle.equals(expectedTitle)))
			return found;
		String content = driver.findElement(By.tagName("body")).getText();
		if (content.contains(message))
			found = true;
		return found;
	}
}
