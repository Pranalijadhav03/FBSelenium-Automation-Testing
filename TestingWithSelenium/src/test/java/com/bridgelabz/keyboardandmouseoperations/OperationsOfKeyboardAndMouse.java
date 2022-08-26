package com.bridgelabz.keyboardandmouseoperations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OperationsOfKeyboardAndMouse {
  @Test
  public void TestingWithSelenium () throws InterruptedException, AWTException {
      System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver webdriver = new ChromeDriver();
      webdriver.navigate().to("https://www.facebook.com/");
      Thread.sleep(5000);
      Robot r = new Robot();
      r.mouseMove(300, 500);
      r.keyPress(KeyEvent.VK_ALT);
      r.keyPress(KeyEvent.VK_F);
      r.keyRelease(KeyEvent.VK_F);
      Thread.sleep(3000);
      r.keyPress(KeyEvent.VK_W);
      r.keyRelease(KeyEvent.VK_W);
      Thread.sleep(3000);
      webdriver.close();
      webdriver.quit();
  }
  }
