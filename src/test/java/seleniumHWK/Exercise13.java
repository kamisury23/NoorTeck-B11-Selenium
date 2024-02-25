package seleniumHWK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;

public class Exercise13 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actions = new Actions(driver);
		
		//capitals
		WebElement oslo =driver.findElement(By.id("box1"));
		WebElement stockholm =driver.findElement(By.id("box2"));
		WebElement washington =driver.findElement(By.id("box3"));
		WebElement copenhagen =driver.findElement(By.id("box4"));
		WebElement seoul =driver.findElement(By.id("box5"));
		WebElement madrid =driver.findElement(By.id("box7"));
		WebElement rome =driver.findElement(By.id("box6"));
		
		//countries
		WebElement italy= driver.findElement(By.id("box106"));
		WebElement spain= driver.findElement(By.id("box107"));
		WebElement norway= driver.findElement(By.id("box101"));
		WebElement denmark= driver.findElement(By.id("box104"));
		WebElement southKo= driver.findElement(By.id("box105"));
		WebElement sweden= driver.findElement(By.id("box102"));
		WebElement unitedStates= driver.findElement(By.id("box103"));
	
		
		//drag & drop 
		actions.clickAndHold(rome).moveToElement(italy).release().build().perform();
		actions.clickAndHold(madrid).moveToElement(spain).release().build().perform();
		actions.clickAndHold(seoul).moveToElement(southKo).release().build().perform();
		actions.clickAndHold(copenhagen).moveToElement(denmark).release().build().perform();
		actions.clickAndHold(washington).moveToElement(unitedStates).release().build().perform();
		actions.clickAndHold(stockholm).moveToElement(sweden).release().build().perform();
		actions.clickAndHold(oslo).moveToElement(norway).release().build().perform();
		
		Thread.sleep(2000);//for me to see
		driver.close();
		
		
		tearDown();
		
	}

}
