package Windowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//String windowId = driver.getWindowHandle();
		//System.out.println("Current window id is: " +windowId);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(2000);
		
		Set<String> windoId = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windoId);
		
		String parentWindow = windowList.get(0);
		System.out.println("Id of Parent window: " +parentWindow);
		
		String childWindow = windowList.get(1);
		System.out.println("Id of Child window: " +childWindow);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000);
	
		driver.switchTo().window(childWindow);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.name("password"));
		element1.sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Browser closes!!");
		

	}

}
