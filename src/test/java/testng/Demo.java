package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("in before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("in before class");
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.out.println("in Before method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void login() throws InterruptedException {
		System.out.println("in test method");
		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		System.out.println("in after method");
		Thread.sleep(2000);
		driver.close();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("in after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("in after test");
	}
}
