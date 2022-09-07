package com.bridgelabz.HANDLING_POP_UP;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseALLChildbrowsersONLY {
	@Test
	public void closeALLChildbrowsersONLY() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		// get the window handle id of the parent browser window
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			/*
			 * compare the window id of all the browsers with the Parent browser window id,
			 * if it is not equal, then only close the browser windows.
			 */
			if (!windowHandle.equals(parentWindowhandleID)) {
				driver.close();
				System.out.println("Child Browser window with title -->" + title + " --> is closed");
			}
		}driver.close();
	}
}
