package com.bridgelabz.ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClickusingActionsClass {
	@Test
	public static void contextClickusingActionsClass() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// enter the url
		driver.get("https://www.facebook.com/");
		// find the ActiTIME Inc. link
		WebElement link = driver.findElement(By.xpath("//button[@name='login']"));
		// right click (context click) on actitime link
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(2000);
		// press 'w' from the keyboard for opening in a new window
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		// quit() method closes all the browsers opened by Selenium
		driver.quit();
	}
}
