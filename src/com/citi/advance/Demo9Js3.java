package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9Js3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.youtube.com/watch?v=5FUdrBq-WFo");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;

		
		String res=js.executeScript("return document.querySelectorAll(\"[class='video-stream html5-main-video']\")[0].duration").toString();
		System.out.println(res);
	}

}



