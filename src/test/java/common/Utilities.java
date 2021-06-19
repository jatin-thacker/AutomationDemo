package common;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class Utilities {

	public static void switchTabs(WebDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
	}

}
