package com.gmailtest.launchgmail;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	  
	  
     @BeforeTest
	  public void launchbrowser() {
    	 System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Resources\\ChromeDriver\\chromedriver.exe");
	 driver= new ChromeDriver(); 
	 driver.navigate().to("https://google.com/");
	 System.out.println("Launchbrowser");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	 }
     
     @Test
	  public void lauchgmail() {
    	 System.out.println("Launchurlbefore"); 
   	  driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
   System.out.println("Launchurl"); 
        }
     
	  @AfterTest
	  public void closebrowser() {
		  driver.close();
	  }
}
