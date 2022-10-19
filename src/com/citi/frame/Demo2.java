package com.citi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//switch to frame using index
public class Demo2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		//click on continue
		//driver.findElement(By.linkText("CONTINUE")).click();
		
		
		//come out of frame // come to main html
		driver.switchTo().defaultContent();
		
		

	}
}
