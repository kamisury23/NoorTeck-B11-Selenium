package seleniumHWK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement nameLogin = driver.findElement(By.name("username"));
		nameLogin.sendKeys("ntk-admin");

		WebElement passwLogin = driver.findElement(By.name("password"));
		passwLogin.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(2000);

		WebElement loginBtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginBtn.click();
		Thread.sleep(1000);

		WebElement dashHeader = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));

		String header = dashHeader.getText();

		if (header.contains("Dashboard")) {
			System.out.println(header);
		} else {
			System.out.println("Header is not Dashboard");
		}
		
		//pushing from local repo

		driver.quit();

		tearDown();

	}

}
