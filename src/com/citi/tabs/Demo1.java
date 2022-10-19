package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//mutliple tabs/windows
public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://db4free.net/");

		// click on phpMyAdmin
		driver.findElement(By.partialLinkText("phpMy")).click();

		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());	
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		
		//enter password as pass123
		driver.findElement(By.id("input_password")).sendKeys("pass");
		
		//click on login 
		driver.findElement(By.id("input_go")).click();
		
		String actualError= driver.findElement(By.id("pma_errors")).getText();
		System.out.println(actualError);
		
		
		
	}

}
