package seleniumHWK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise8 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.get("https://demo.automationtesting.in/Frames.html");

		WebElement firstFrame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(firstFrame);
		Thread.sleep(2000);

		WebElement textField = driver.findElement(By.cssSelector("input[type=\"text\"]"));
		textField.sendKeys("Accessing Iframe");
		Thread.sleep(2000);

		driver.switchTo().parentFrame();

		WebElement iFrameTab = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		iFrameTab.click();

		WebElement nestediFrame = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(nestediFrame);
		Thread.sleep(2000);

		WebElement iframeDemo = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")); // [1]
		driver.switchTo().frame(iframeDemo);

		WebElement textField2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		textField2.sendKeys("Iframe is easy");

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("a[href=\"Index.html\"]")).click();
		String pageTitle = driver.getTitle();

		if (pageTitle.equals("Index")) {

			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		System.out.println("Page Title: " + pageTitle);

		driver.close();
		tearDown();

	}

}
