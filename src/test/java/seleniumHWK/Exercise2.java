package seleniumHWK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);

		WebElement registerBtn = driver.findElement(By.linkText("REGISTER"));
		registerBtn.click();
		Thread.sleep(2000);

		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

		WebElement firstN = driver.findElement(By.name("firstName"));
		firstN.sendKeys("Kari");

		WebElement lastN = driver.findElement(By.name("lastName"));
		lastN.sendKeys("Villa");

		Thread.sleep(2000);

		WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys("617-555-1515");

		WebElement eMail = driver.findElement(By.id("userName"));
		eMail.sendKeys("selenium123@gmail.com");

		Thread.sleep(2000);

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("25 Woodland st.");

		WebElement ciTy = driver.findElement(By.name("city"));
		ciTy.sendKeys("South Boston");

		Thread.sleep(2000);

		WebElement staTe = driver.findElement(By.name("state"));
		staTe.sendKeys("MA");

		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("02127");

		Thread.sleep(2000);

		// Requirement skips the country field.

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("kary");

		WebElement passWd = driver.findElement(By.name("password"));
		passWd.sendKeys("123456");

		WebElement confP = driver.findElement(By.name("confirmPassword"));
		confP.sendKeys("123456");

		Thread.sleep(2000);

		WebElement subBtn = driver.findElement(By.name("submit"));
		subBtn.click();

		Thread.sleep(3000);

		WebElement confirmMssg = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));

		String message = confirmMssg.getText();

		if (message.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		driver.quit();

		tearDown();

		// git push from local
	}

}
