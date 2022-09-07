package com.bridgelabz.HANDLING_POP_UP;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v102.css.CSS;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownload {
	WebDriver driver;
	File folder;

	@BeforeMethod
	public void FileDownloadInChromeBrowser() {
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();

		// chrome
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> Prefs = new HashMap<String, Object>();
		Prefs.put("profile.default_content_settings.popups", 0);
		Prefs.put("download.default_directory", folder.getAbsolutePath());
		options.setExperimentalOption("prefs", Prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);

	}

	@Test
		
		public void downloadFlieTest() throws InterruptedException {
			driver.get("http://the-internet.herohkuapp.com/dowmload");
			driver.findElement(By.linkText("some-file.txt")).click();
			Thread.sleep(2000);
			File listOfFiles = folder.listFiles();
			Assert.assertEquals(listOfFiles.length, is(not(0)));
			
			for(File file:listOfFiles) {
				Assert.assertEquals(file.length(), is(not(long)0)));
			}
			
		}

	@AfterMethod

	public void tearDemo() {
		driver.quit();
		for (File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();

	}

}
