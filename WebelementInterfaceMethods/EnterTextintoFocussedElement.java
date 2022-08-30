package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextintoFocussedElement {
	@Test
	public void enterTextintoFocussedElement() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("email");
		driver.close();

	}
}
