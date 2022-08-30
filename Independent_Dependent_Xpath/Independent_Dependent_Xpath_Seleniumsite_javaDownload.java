package com.bridgelabz.Independent_Dependent_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload {
  @Test
  public void  IndependentDependentXpath() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  // enter the url
	   driver.get("https://www.selenium.dev/downloads/");
	   Thread.sleep(3000);
	  // xpath using independent and dependent concept
	   driver.findElement(By.xpath("//a[normalize-space()='4.4.0']")).click();
	   driver.close();
	   }
}
