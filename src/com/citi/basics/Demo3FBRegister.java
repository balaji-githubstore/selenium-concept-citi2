package com.citi.basics;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//enter firstname as john 
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Dec");
		
		//select year as 2000
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByValue("2000");
		
		//click on radio button custom 
		driver.findElement(By.xpath("//input[@value='-1']")).click();

		//click on sign up
		driver.findElement(By.name("websubmit")).click();
	}

}
