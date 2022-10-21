package com.citi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		Dimension dim= driver.findElement(By.id("email")).getSize();
		System.out.println(dim.width);
		System.out.println(dim.height);
		
//		By loc= By.id("email");
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("helo@gmail.com");
		
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("helo@gmail.com");
		
		//driver.findElement(By.id("email")).sendKeys("bala123456@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("test123");
		
		//click on login
		driver.findElement(By.name("login")).click();

	}

}
