package com.bridgelabz.HANDLING_POP_UP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Promptpopup {
	@Test
	public void alert_Promptpopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Enter the url
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		// find this button : "Say my name"
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		// Switch to alert pop up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		// print the text present on the alert pop up
		System.out.println(alert.getText());
		Thread.sleep(2000);
		// enter your name in the text box present on the alert pop up
		alert.sendKeys("Pranali");
		Thread.sleep(2000);
		// click on OK button
		alert.accept();
		Thread.sleep(2000);
		// print the text present on the second alert pop up
		System.out.println(alert.getText());
		// click on Cancel button
		alert.dismiss();
		driver.close();
	}
}
