package com.bridgelabz.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test

	public static void mouseHover() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement AreaOfExpertise = driver
				.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
		action.moveToElement(AreaOfExpertise).perform();
		WebElement cloudApp = driver.findElement(By.linkText("Sign Up"));
		action.moveToElement(cloudApp).click().perform();
		driver.close();
	}

// mouse hover program for actimind webside
	@Test
	public static void mouseHover1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		// movetoElement - used for mouse hover
		// Mouse hover on “AREAS OF EXPERTISE” menu
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		Thread.sleep(2000);
		action.moveToElement(AreaOfExpertise).perform();
		// Click on “AREAS OF EXPERTISE” menu
		WebElement cloudApp = driver.findElement(By.linkText("Cloud Applications"));
		Thread.sleep(2000);
		action.moveToElement(cloudApp).click().perform();
		// composite multiple actions can be achieved using the below statement
		// action.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
		driver.close();

	}
}
