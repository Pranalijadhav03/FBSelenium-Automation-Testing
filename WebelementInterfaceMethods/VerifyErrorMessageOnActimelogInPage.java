package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyErrorMessageOnActimelogInPage {
	@Test
	public void verifyErrorMessageOnActimelogInPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).click();
		WebElement errMsg = driver.findElement(By.xpath("//div[contains(@class,'_9ay7')]"));
		String errtext = errMsg.getText();
		System.out.println("error message is :" + errtext);
		Thread.sleep(2000);
		driver.close();
	}
}
