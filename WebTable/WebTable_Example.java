package com.bridgelabz.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable_Example {
	@Test
  public void webTable_Example() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.get("C:\\WebTable\\WebTable.html");
	  Thread.sleep(2000);
	//Count Total number of rows present in the table
	List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
	int totalRows = allRows.size();
	System.out.println("total number of rows present in the table is :"+ totalRows);
	//count total number of columns
	List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
	int totalColumns = allColumns.size();
	System.out.println("Total number of columns in the table is :" + totalColumns);
	//Count number of cells present in the table
	List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
	int totalCells = allCells.size();
	System.out.println("Total number of cells present in the table is :" + totalCells);
	//Print ONLY the numbers
	int countNumberValue = 0;
	int sum=0;
	for (WebElement cell : allCells) {
	String cellValue = cell.getText();
	try{
	int number = Integer.parseInt(cellValue);
	System.out.print("Numbers :"+number);
	countNumberValue++;
	sum = sum+number;
	}catch (Exception e) {
	}
	}
	System.out.println("Total count of numeric values is :"+countNumberValue);
	System.out.println("Total sum of all the numeric values is :"+sum);
	//close the browser
	driver.close();
  }
}
