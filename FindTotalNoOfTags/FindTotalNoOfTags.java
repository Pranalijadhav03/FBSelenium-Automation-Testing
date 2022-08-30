package com.bridgelabz.FindTotalNoOfTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class FindTotalNoOfTags {
  @Test
  public void findTotalNoOfDivTags() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/?sk=welcome");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	 
	  List<WebElement> allLinks = driver.findElements(By.tagName("div"));
	  
	  //get the total no of link elements
	  int totalLinks = allLinks.size();
	 System.out.println("total number of div resent on the web page is :" +totalLinks);
	 int visibleLinkCount = 0;
	 int hiddenLinkCount = 0;
	 //using forech loop 
	 for(WebElement link : allLinks ) {
		 //if the link is displayed, then print the text of the link
		 if(link.isDisplayed()) {
			 visibleLinkCount++;
			 System.out.println(visibleLinkCount +"----> :" +link.getText()); 
		 }
		 else {
			 hiddenLinkCount++;
		 }
		 System.out.println(" total no of visible links :" + visibleLinkCount); 
		 System.out.println(" total no of hidden links :" + hiddenLinkCount); 
	 
	 }
	 
	 driver.close();
	  
}
  
  //-----------------------------div list -----------------------------------
  @Test
  public void findTotalNoOfSpanTags() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/?sk=welcome");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	 
	  List<WebElement> allLinks = driver.findElements(By.tagName("span"));
	  
	  //get the total no of link elements
	  int totalLinks = allLinks.size();
	 System.out.println("total span of links present on the web page is :" +totalLinks);
	 int visibleLinkCount = 0;
	 int hiddenLinkCount = 0;
	 //using forech loop 
	 for(WebElement link : allLinks ) {
		 //if the link is displayed, then print the text of the link
		 if(link.isDisplayed()) {
			 visibleLinkCount++;
			 System.out.println(visibleLinkCount +"----> :" +link.getText()); 
		 }
		 else {
			 hiddenLinkCount++;
		 }
		 System.out.println(" total no of visible links :" + visibleLinkCount); 
		 System.out.println(" total no of hidden links :" + hiddenLinkCount); 
	 
	 }
	 driver.close();
	  
}
  
//-----------------------------button list -----------------------------------
  @Test
  public void findTotalNoOfButtonTags() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/?sk=welcome");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	 
	  List<WebElement> allLinks = driver.findElements(By.tagName("button"));
	  
	  //get the total no of link elements
	  int totalLinks = allLinks.size();
	 System.out.println("total number of button present on the web page is :" +totalLinks);
	 int visibleLinkCount = 0;
	 int hiddenLinkCount = 0;
	 //using forech loop 
	 for(WebElement link : allLinks ) {
		 //if the link is displayed, then print the text of the link
		 if(link.isDisplayed()) {
			 visibleLinkCount++;
			 System.out.println(visibleLinkCount +"----> :" +link.getText()); 
		 }
		 else {
			 hiddenLinkCount++;
		 }
		 System.out.println(" total no of visible links :" + visibleLinkCount); 
		 System.out.println(" total no of hidden links :" + hiddenLinkCount); 
	 
	 }
	driver.close();  
}
  
 // ----------------------------------------2nd program of find total number of tags-----------------------------------------
  
 @Test
  
  public void findTotalNoOfTags() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();

      driver.findElement(By.name("email")).sendKeys("jadhav.pranali2403@gmail.com");
      Thread.sleep(2000);

      driver.findElement(By.name("pass")).sendKeys("Pranalij@2403");
      Thread.sleep(2000);

      driver.findElement(By.name("login")).click();
      Thread.sleep(2000);
      

      List<WebElement> tag1 = driver.findElements(By.tagName("a"));
      System.out.println("Size of 'a' tag : "+tag1.size());
      List<WebElement> tag2 = driver.findElements(By.tagName("span"));
      System.out.println("Size of 'span' tag : "+tag2.size());
      List<WebElement> tag3 = driver.findElements(By.tagName("div"));
      System.out.println("Size of 'div' tag : "+tag3.size());
      List<WebElement> tag4 = driver.findElements(By.tagName("input"));
      System.out.println("Size of 'input' tag : "+tag4.size());
      List<WebElement> tag5 = driver.findElements(By.tagName("script"));
      System.out.println("Size of 'script' tag : "+tag5.size());
      List<WebElement> tag6 = driver.findElements(By.tagName("link"));
      System.out.println("Size of 'link' tag : "+tag6.size());
      List<WebElement> tag7 = driver.findElements(By.tagName("body"));
      System.out.println("Size of 'body' tag : "+tag7.size());
      List<WebElement> tag8 = driver.findElements(By.tagName("head"));
      System.out.println("Size of 'head' tag : "+tag8.size());
      int totalNoTags = tag1.size()+tag2.size()+tag3.size()+tag4.size()+tag5.size()+tag6.size()+tag7.size();
      System.out.println("Total number of tags : "+totalNoTags);
      driver.close();
  }
}

