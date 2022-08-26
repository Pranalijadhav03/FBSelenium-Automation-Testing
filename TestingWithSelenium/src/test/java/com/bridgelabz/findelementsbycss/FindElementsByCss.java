package com.bridgelabz.findelementsbycss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsByCss {
  @Test
  public void findingElementsByCss() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      driver.findElement(By.linkText("Create New Account")).click();
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#u_0_b_2F")).sendKeys("pranali");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#u_0_d_Rr")).sendKeys("jadhav");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#u_0_g_AB")).sendKeys("jadhavpranali55@gmail.com");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#u_0_j_83")).sendKeys("jadhavpranali55@gmail.com");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Pranali@1234");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#day")).sendKeys("24");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#month")).sendKeys("Mar");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("#year")).sendKeys("1997");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("label[for='u_0_4_RX']")).click();
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("button[name='websubmit']")).click();
      Thread.sleep(2000);
      driver.close();

  }

  @Test
  public void logInCreditionalsByXpath() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();

      driver.findElement(By.cssSelector("input[name='email']")).sendKeys("pranalijadhav55@gmail.com");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("pranali1234");
      Thread.sleep(2000);

      driver.findElement(By.cssSelector("button[name='login']")).click();
      Thread.sleep(2000);
      driver.close();
  }
}
