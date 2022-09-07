package com.bridgelabz.ListBox;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HashMapExample_printtheOcuuranceOfPoori {
	@Test
	public void hashMapExample_printtheOcuuranceOfPoori() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:\\C:\\WebTable\\option.html");
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> allElements = s.getOptions();
		HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
		for (WebElement element : allElements) {
			String text = element.getText();
			if (hashMapObj.containsKey(text)) {
				Integer value = hashMapObj.get(text);
				value++;
				hashMapObj.put(text, value);
			} else {
				hashMapObj.put(text, 1);
			}
		}
		Set<String> allKeys = hashMapObj.keySet();
		for (String key : allKeys) {
			Integer value = hashMapObj.get(key);
			System.out.println(key + " -->" + value);
			if (value > 1) {
				System.out.println("Occurance of " + key + " is :" + value);
			}
		}
	}
}
