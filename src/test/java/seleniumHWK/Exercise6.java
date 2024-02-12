package seleniumHWK;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Alerts")) {
			System.out.println("Page Title: " + pageTitle);
		} else {
			System.out.println("Page title is not Alerts");
		}

		WebElement alertText = driver.findElement(By.linkText("Alert with Textbox"));
		alertText.click();
		Thread.sleep(2000);

		WebElement promptBox = driver.findElement(By.cssSelector("#Textbox > button"));
		promptBox.click();
		Thread.sleep(2000);

		Alert alertObj = driver.switchTo().alert();
		alertObj.sendKeys("Karina Granadeno");
		Thread.sleep(2000);
		alertObj.accept();

		WebElement message = driver.findElement(By.id("demo1"));
		String messgAfter = message.getText();

		if (messgAfter.contains("How are you today")) {
			System.out.println(messgAfter);
		} else {
			System.out.println("Message is not what we expected");
		}

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(1000);

		WebElement alertOkCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertOkCancel.click();
		Thread.sleep(1000);

		WebElement buttonDisplay = driver.findElement(By.cssSelector("#CancelTab > button"));
		buttonDisplay.click();

		Thread.sleep(2000);

		// requirement B. THERE IS NO TEXT FIELD TO ENTER NAME

		String messgPress = alertObj.getText();
		if (messgPress.contains("Press a Button!")) {
			alertObj.dismiss();
		} else {
			alertObj.accept();
		}

		WebElement displayUnder = driver.findElement(By.id("demo"));
		String mssgUnder = displayUnder.getText();

		if (mssgUnder.contains("You pressed")) {

			System.out.println("It contains: " + mssgUnder);
		} else {
			System.out.println("It does not contain the phrase");
		}
		
		//Testing git

		driver.quit();

		tearDown();

	}

}
