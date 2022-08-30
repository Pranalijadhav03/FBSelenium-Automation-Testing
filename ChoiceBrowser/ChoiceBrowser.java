package com.bridgelabz.ChoiceBrowser;

import java.util.Scanner;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChoiceBrowser {
	@Test
	public static void AutomationChoiceChromeDriver() throws InterruptedException {
		System.out.println("Welcome to Selenium different browser casting program");
		Scanner sc = new Scanner(System.in);
		System.out.println("for chrome browser press 1");
		System.out.println("for firefox browser press 2");
		System.out.println("Exit 3");
		System.out.println("Enter your choice : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.get("https://www.facebook.com/?sk=welcome");
			driver1.manage().window().maximize();
			driver1.findElement(By.name("email")).sendKeys("jadhav.pranali2403@gmail.com");
			Thread.sleep(2000);
			driver1.findElement(By.name("pass")).sendKeys("Pranalij@2403");
			Thread.sleep(2000);
			driver1.findElement(By.name("login")).click();
			Thread.sleep(2000);
			driver1.close();
			break;

		case 2:
			System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver driver2 = new FirefoxDriver();
			driver2.get("https://www.facebook.com/?sk=welcome");
			driver2.manage().window().maximize();
			driver2.findElement(By.name("email")).sendKeys("jadhav.pranali2403@gmail.com");
			Thread.sleep(2000);
			driver2.findElement(By.name("pass")).sendKeys("Pranalij@2403");
			Thread.sleep(2000);
			driver2.findElement(By.name("login")).click();
			Thread.sleep(2000);
			driver2.close();
			break;
		default:
			System.out.println("Selected number is not valid");
			break;
		}
	}

}
