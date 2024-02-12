package seleniumHWK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.nopcommerce.com/");

		Thread.sleep(2000);

		WebElement registerBtn = driver.findElement(By.linkText("Register"));
		registerBtn.click();

		Thread.sleep(2000);

		String pgTitle = driver.getTitle();
		if (pgTitle.equals("nopCommerce demo store. Register")) {
			System.out.println("Page Title: " + pgTitle);
		} else {
			System.out.println("Page title is not what we expect");
		}

		WebElement genderF = driver.findElement(By.id("gender-female"));
		genderF.click();

		WebElement fName = driver.findElement(By.id("FirstName"));
		fName.sendKeys("Looney");

		Thread.sleep(2000);

		WebElement lName = driver.findElement(By.id("LastName"));
		lName.sendKeys("Tunes");

		Thread.sleep(2000);

		WebElement dAy = driver.findElement(By.name("DateOfBirthDay"));
		Select selectObj = new Select(dAy);
		selectObj.selectByValue("1");

		Thread.sleep(2000);

		WebElement monthDrop = driver.findElement(By.name("DateOfBirthMonth"));
		Select monthObj = new Select(monthDrop);
		monthObj.selectByValue("2");

		WebElement yearDrop = driver.findElement(By.name("DateOfBirthYear"));
		Select yearObj = new Select(yearDrop);
		yearObj.selectByValue("1988");

		Thread.sleep(2000);

		WebElement eMail = driver.findElement(By.id("Email"));
		eMail.sendKeys("selenium120@gmail.com");

		WebElement compName = driver.findElement(By.id("Company"));
		compName.sendKeys("NoorTeck");

		Thread.sleep(2000);

		WebElement newsCheck = driver.findElement(By.id("Newsletter"));
		newsCheck.click();

		Thread.sleep(2000);

		WebElement passWd = driver.findElement(By.id("Password"));
		passWd.sendKeys("123456");

		// Requirement#16. There is no Username field.
		// there is however a confirm password field to continue with registration

		WebElement confPass = driver.findElement(By.id("ConfirmPassword"));
		confPass.sendKeys("123456");

		Thread.sleep(2000);

		WebElement regisBtn = driver.findElement(By.id("register-button"));
		regisBtn.click();

		Thread.sleep(2000);

		WebElement registerMssg = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]"));
		String message = registerMssg.getText();

		if (message.equals("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		
		//Pull to Github
		driver.quit();

		tearDown();

	}

}
