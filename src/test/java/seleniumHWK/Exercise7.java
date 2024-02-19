package seleniumHWK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise7 extends Hooks{
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(1000);
		
		WebElement seleniumOption = driver.findElement(By.xpath("//a[@href=\"org/openqa/selenium/package-summary.html\"]"));
		seleniumOption.click();
		Thread.sleep(2000);
		
	WebElement alertBtn=driver.findElement(By.xpath("//a[@href=\"Alert.html\"]"));
     alertBtn.click();
     Thread.sleep(2000);
	    String message = driver.findElement(By.xpath("//h1[@class=\"title\"]")).getText();
	    System.out.println(message);
	    
        if(message.equals("Interface Alert")) {
        	System.out.println("TESTCASE PASSED");
        } else {        	
        	System.out.println("TESTCASE FAILED");
       }
	     
	     
	     WebElement overviewtab=driver.findElement(By.xpath("//a[@href=\"../../../index.html\"]"));
	     overviewtab.click();
	     Thread.sleep(2000);
   
	     WebElement chromeLink = driver.findElement(By.xpath("//a[@href=\"org/openqa/selenium/chrome/package-summary.html\"]")); 
         chromeLink.click();
         Thread.sleep(2000);
	     
	     WebElement chromeOption= driver.findElement(By.xpath("//a[@href=\"ChromeDriver.html\"][1]"));
	     chromeOption.click();
	     Thread.sleep(2000);
	     String text= driver.findElement(By.cssSelector("h1[title=\"Class ChromeDriver\"]")).getText();
	     System.out.println(text);
    
	    
	     if (text.equals("Class ChromeDriver")) {
	    	 System.out.println("TESTCASE PASSED");
         } else {        	
        	System.out.println("TESTCASE FAILED");
         }
	     
		driver.quit();
		tearDown();
		
		
	}

}
