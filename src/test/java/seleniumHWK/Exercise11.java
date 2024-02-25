package seleniumHWK;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;

public class Exercise11 extends Hooks {
public static void main(String[] args) throws InterruptedException {
	
	setUp();

	driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	WebElement rightClickBtn = driver.findElement(By.cssSelector("span[class*='context-menu-one']"));

	Actions actions = new Actions(driver);
	actions.contextClick(rightClickBtn).build().perform();

	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	Thread.sleep(2000);

	Alert alert = driver.switchTo().alert();
	String message = alert.getText();

	if (message.contains("copy")) {
		System.out.println("TESTCASE PASSED");
	} else {
		System.out.println("TESTCASE FAILED");
	}

	alert.accept(); // had to handle the alert to close browser.otherwise driver.close wasn't closing the session. 
	                //driver.quit inside tearDown on its own does close it . 

	driver.close();

	tearDown();

}
}