package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class VerifyUNtextboxisEnabledinActitime {
	@Test
	public void verifyUNtextboxisEnabledinActitime() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.id("email"));
		if (UN.isEnabled()) {
			System.out.println("Email text box is enabled");
		} else {
			System.out.println("Email text box is disabled");
		}
		
		WebElement UN1 = driver.findElement(By.id("pass"));
		if (UN1.isEnabled()) {
			System.out.println("Password text box is enabled");
		} else {
			System.out.println("Password text box is disabled");
		}
		driver.close();

	}
}
