package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RemoveValueFromTextUsingClearMethod {
	@Test
	public static void removeValueFromTextUsingClearMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("Value present inside the text box is : " + value);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("jadhavpranali55@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		driver.close();
	}
}
