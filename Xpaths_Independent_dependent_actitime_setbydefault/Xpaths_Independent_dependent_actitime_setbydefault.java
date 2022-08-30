package com.bridgelabz.Xpaths_Independent_dependent_actitime_setbydefault;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpaths_Independent_dependent_actitime_setbydefault {
  @Test
  public void XpathsIndependentdependent() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/?sk=welcome");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("email")).sendKeys("jadhav.pranali2403@gmail.com");
	  Thread.sleep(2000);

	  driver.findElement(By.name("pass")).sendKeys("Pranalij@2403");
	  Thread.sleep(2000);
	  
	 //click on login button
	  driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//span[text()='Pranali Jadhav']")).click();
	  
	  driver.close();
	  }
}
