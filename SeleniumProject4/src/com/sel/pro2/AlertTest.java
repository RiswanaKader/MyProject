package com.sel.pro2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("Incognito");
	WebDriver driver=new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();
	
	Alert alert1 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert1.accept();
	Thread.sleep(2000);
	
	WebElement confirm = driver.findElement(By.id("confirmButton"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",confirm);
	confirm.click();
	
	Alert alert3 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert3.dismiss();
	Thread.sleep(2000);
	
	driver.findElement(By.id("promtButton")).click();
	
	Alert alert4 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert4.sendKeys("asdfg");
	Thread.sleep(2000);
	
	System.out.println(alert4.getText());
	alert4.accept();
	Thread.sleep(2000);
	
	driver.close();
	Thread.sleep(2000);
	
	
	
	
 }
}
