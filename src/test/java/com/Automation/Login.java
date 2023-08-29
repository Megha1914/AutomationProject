package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println("The url of the page is: " +url);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: " +title);
		
		String pagesource = driver.getPageSource();
		System.out.println("pageSource of the current website: " +pagesource);
		
		WebElement ele= driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		String expectedUrl ="https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		
		if (expectedUrl.equals(actualURL)) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
			
		}
		
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	}

	
}
