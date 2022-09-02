package com.bridgelabz.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownMenu {
	@Test
	public static void dropdownMenu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String xp = "//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]";
		WebElement menu = driver.findElement(By.xpath(xp));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		WebElement submenu = driver.findElement(By.linkText("Sign Up"));
		submenu.click();
		driver.close();
	}

	// --------------dropdown menu program for actimind webside
	@Test
	public static void dropdownMenu1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com/");
		driver.manage().window().maximize();
		// find the menu "About Company"
		String xp = "//a[@class='c-link dropdown-toggle']";
		Thread.sleep(2000);
		WebElement menu = driver.findElement(By.xpath(xp));
		// mouse hover on "About Company" menu
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		// click on submenu "Basic Facts"
		WebElement submenu = driver.findElement(By.linkText("Web Crawling"));
		Thread.sleep(2000);
		submenu.click();
		driver.close();
	}
}
