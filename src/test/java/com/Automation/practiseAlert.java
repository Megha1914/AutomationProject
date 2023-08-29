package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		WebElement ele =driver.findElement(By.id("name"));
		ele.sendKeys("Megha");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("country"));
		ele1.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("city"));
		ele2.sendKeys("Mathura");
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("card"));
		ele3.sendKeys("1234-5678-9012-3456");
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("month"));
		ele4.sendKeys("September");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.id("year"));
		ele5.sendKeys("2029");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}
