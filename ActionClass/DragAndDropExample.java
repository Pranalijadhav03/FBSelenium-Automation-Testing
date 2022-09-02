package com.bridgelabz.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropExample {
	@Test
	public void dragAndDropExample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// enter the url
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeKDx57gl9acYmkx_Jk25z72oF6jdNyCsw8mKOxsh0-QnJl7Kv5uKOMhLa_i7FvgPrZCYyarWz89Ivv_E5Ztk59cLCbr-Jn2IG9-uii2uNHLw&smuh=687&lh=Ac-z1F4HacGwxoLmftg");
		String xp1 = "//input[contains(@id,'email')]";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		String xp2 = "//input[contains(@name,'pass')]";
		WebElement block3 = driver.findElement(By.xpath(xp2));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDrop(block1, block3).perform();
		driver.close();

	}
}
