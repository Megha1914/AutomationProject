package DropDownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Select drp = new Select(element);
		drp.selectByValue("Boston");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Select drp1 = new Select(ele1);
		drp1.selectByValue("London");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("inputName"));
		ele2.sendKeys("Megha Khandelwal");
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("address"));
		ele3.sendKeys("H.no 279, Narsipuram Colony");
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("city"));
		ele4.sendKeys("Mathura");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.id("state"));
		ele5.sendKeys("Uttar Pradesh");
		Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.id("zipCode"));
		ele6.sendKeys("281006");
		Thread.sleep(2000);
		
		WebElement ele7 = driver.findElement(By.id("cardType"));
		Select drp2 = new Select(ele7);
		drp2.selectByValue("amex");
		Thread.sleep(2000);
		
		WebElement ele8 =  driver.findElement(By.id("creditCardNumber"));
		ele8.sendKeys("1234-5678-9012-3456");
		Thread.sleep(2000);
		
		WebElement ele9 = driver.findElement(By.id("creditCardMonth"));
		ele9.clear();
		ele9.sendKeys("8");
		Thread.sleep(2000);
		
		WebElement ele10 = driver.findElement(By.id("creditCardYear"));
		ele10.clear();
		ele10.sendKeys("2023");
		Thread.sleep(2000);
		
		WebElement ele11 = driver.findElement(By.id("nameOnCard"));
		ele11.sendKeys("Megha Khandelwal");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		
		}

}
