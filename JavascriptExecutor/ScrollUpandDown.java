package com.bridgelabz.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpandDown {
	@Test
	public static void scrollUpandDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Scroll up and down program for selenium page
		driver.get("http://seleniumhq.org/download");
		driver.manage().window().maximize();
		// typecasting driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			// scroll down on the webpage
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(2000);
		}
		for (int i = 1; i < 10; i++) {
			// scroll up on the webpage
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(2000);
		}
		driver.close();
	}

	// ---------- Scroll down program for facebook page---------------------

	@Test
	public static void scrollDownOperationWithFacebook() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//a[contains(@title,'Browse our Watch videos.')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
