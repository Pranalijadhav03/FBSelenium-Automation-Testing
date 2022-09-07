package com.bridgelabz.HANDLING_POP_UP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_windowHandle {
  @Test
  public void print_windowHandle() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	//get the window handle id of the browser 
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	driver.close();
  }
}
