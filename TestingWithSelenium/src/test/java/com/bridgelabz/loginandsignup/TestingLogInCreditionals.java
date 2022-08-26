package com.bridgelabz.loginandsignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingLogInCreditionals {
  @Test
  public void testingSignUpCreditionals() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      driver.findElement(By.linkText("Create New Account")).click();
      Thread.sleep(2000);
     
      driver.findElement(By.name("firstname")).sendKeys("pranali");
      Thread.sleep(2000);

      driver.findElement(By.name("lastname")).sendKeys("jadhav");
      Thread.sleep(2000);

      driver.findElement(By.name("reg_email__")).sendKeys("jadhavpranali55@gmail.com");
      Thread.sleep(2000);

      driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jadhavpranali55@gmail.com");
      Thread.sleep(2000);

      driver.findElement(By.name("reg_passwd__")).sendKeys("Pranali@1234");
      Thread.sleep(2000);

      driver.findElement(By.name("birthday_day")).sendKeys("24");
      Thread.sleep(2000);

      driver.findElement(By.name("birthday_month")).sendKeys("Mar");
      Thread.sleep(2000);

      driver.findElement(By.name("birthday_year")).sendKeys("1997");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
      Thread.sleep(2000);

           
      driver.findElement(By.name("websubmit")).click();
      Thread.sleep(2000);
      driver.close();
  } 
      
      @Test
	    public void testingLogInCreditionals() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();

	        driver.findElement(By.name("email")).sendKeys("pranalijadhav55@gmail.com");
	        Thread.sleep(2000);

	        driver.findElement(By.name("pass")).sendKeys("pranali1234");
	        Thread.sleep(2000);

	        driver.findElement(By.name("login")).click();
	        Thread.sleep(2000);
	        
  }
  
 }
