package com.bridgelabz.HANDLING_POP_UP;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAnySpecifiedBrowser {
	@Test
	public void closeAnySpecifiedBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		// Set the expected title of the browser window which you want to close
		String expected_title = "Tech Mahindra";
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			driver.switchTo().window(windowHandle);
			String actual_title = driver.getTitle();
			// Checks whether the actual title contains the specified expected title
			if (actual_title.contains(expected_title)) {
				driver.close();
				System.out.println("Specified Browser window with title -->" + actual_title + " --> is closed");
			}
		}driver.close();
	}
}