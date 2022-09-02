package com.bridgelabz.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterText_intoDisabledTextbox {
	@Test
	public static void enterText_intoDisabledTextbox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/PJ/Desktop/DisabledTextBox_prog.html");
		 driver.manage().window().maximize();
		// Typecast the driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		// enter "admin" in first textbox using javascript
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		// clear the value in second textbox using javascript
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(2000);
		// enter "manager" in second textbox using javascript
		js.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(2000);
		// change the second text box to button type using Javascript
		js.executeScript("document.getElementById('t2').type='button'");
		Thread.sleep(2000);
		driver.close();
	}
}
