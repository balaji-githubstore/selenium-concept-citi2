package com.citi.advance;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Demo11Fluent2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://www.google.com");
		
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
//		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(Exception.class);
		wait.withTimeout(Duration.ofSeconds(10));
		
		
//		String title= wait.until(x->x.getTitle());
		
//		WebElement ele= wait.until(x->x.findElement(By.xpath("")));
		
		 wait.until(x->x.findElement(By.xpath("//a"))).click();
		 
		 wait.until(x->x.findElement(By.xpath("//a"))).click();
	}

}



