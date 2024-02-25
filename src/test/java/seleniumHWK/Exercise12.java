package seleniumHWK;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;

public class Exercise12 extends Hooks {

	public static void main(String[] args) {

		setUp();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement doubleBtn = driver.findElement(By.xpath("//button[@ondblclick]"));

		Actions actions = new Actions(driver);
		actions.doubleClick(doubleBtn).build().perform();

		Alert alert = driver.switchTo().alert();
		String message = alert.getText();

		if (message.contains("You double clicked")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		alert.accept();
		driver.close();

		tearDown();

	}

}
