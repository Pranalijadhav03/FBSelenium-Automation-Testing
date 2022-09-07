package com.bridgelabz.ListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PrintUniqueElementinthelistbox {
  @Test
  public void printUniqueElementinthelistbox() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:\\C:\\WebTable\\option.html");
		Thread.sleep(2000);
	  WebElement listElement = driver.findElement(By.id("mtr"));
	  Select s = new Select(listElement);
	  List<WebElement> allOptions = s.getOptions();
	  int count = allOptions.size();
	  System.out.println(count);
	  System.out.println("-----print the values in the list ----");
	  HashSet<String> allElements = new HashSet<String>();
	  for (WebElement option : allOptions) {
	  String text = option.getText();
	  System.out.println(text);
	  allElements.add(text);
	  }
	  System.out.println(allElements);
	  driver.close();
  }
}
