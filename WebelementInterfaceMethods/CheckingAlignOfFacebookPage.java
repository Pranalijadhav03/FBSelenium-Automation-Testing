package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckingAlignOfFacebookPage {
	@Test
	public void verifyFB_UNandPWDfieldsAreAligned_intheSameRow() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB = driver.findElement(By.id("email"));
		// get the y-coordinate of username field
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		WebElement pwdTB = driver.findElement(By.name("pass"));
		// get the y-coordinate of password field
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		// check whether the Y-coordinate of username and password field are same
		if (username_Ycordinate == password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		} else {
			System.out.println("username and password fields are NOT aligned in the same row");
		}
		driver.close();
	}

	// -------------------------------------2nd-------------------------

	@Test
	public static void verifyUNandPWDalignment() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB = driver.findElement(By.id("email"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		WebElement pwTB = driver.findElement(By.name("pass"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		if (un_x == pw_x && un_width == pw_width && un_height == pw_height) {
		System.out.println("Email and password text box are aligned");
		
		} else {
			System.out.println("Username and password text box are NOT aligned");
			System.out.println(un_width);
			System.out.println(un_height);
			System.out.println(pw_width);
			System.out.println(pw_height);
		}
		
		driver.close();
	}
}
