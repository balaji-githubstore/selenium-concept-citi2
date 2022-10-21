package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8Js2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();

		//14/04/2010
//		driver.findElement(By.id("bill-date-long")).sendKeys("14/04/2010");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		WebElement ele= driver.findElement(By.xpath("//input[@name='DOB']"));
		
		js.executeScript("arguments[0].value='14/04/2000'",ele);
		
		
		WebElement ele1= driver.findElement(By.xpath("//input[@name='agree']"));
		js.executeScript("arguments[0].click()",ele1);
		
		
		String res=js.executeScript("return document.querySelectorAll(\"[class='video-stream html5-main-video']\")[0].duration").toString();
	}

}



