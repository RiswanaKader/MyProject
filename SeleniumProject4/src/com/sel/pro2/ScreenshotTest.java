package com.sel.pro2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTest {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject4\\driver\\chromedriver.exe")	;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(3000);
	
	WebElement id= driver.findElement(By.xpath("//input[@id='email']"));
	id.sendKeys("rissweet4@gmail.com");
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
	password.sendKeys("123456");
	Thread.sleep(3000);
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	driver.get("https://facebook.com/login/identify/");
	TakesScreenshot image= (TakesScreenshot)driver;
	
	File s=image.getScreenshotAs(OutputType.FILE);
	
	File locator=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject4\\Screenshot\\img.png");
		
	FileHandler.copy(s, locator);
	
	Thread.sleep(3000);
	
	driver.close();
	
	}
	}