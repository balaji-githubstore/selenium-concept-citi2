package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://nasscom.in/");
		
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		
		//mouse hover on Become A Member
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Become a member']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

	}

}
