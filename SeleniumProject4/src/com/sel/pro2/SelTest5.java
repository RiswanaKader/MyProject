package com.sel.pro2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SelTest5 {
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject4\\driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		WebElement men = driver.findElement(By.xpath("//a[text()='MEN']"));
		Actions m=new Actions(driver);
		m.contextClick(men).build().perform();	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement home = driver.findElement(By.xpath("//a[contains(text(), 'HOME' )]"));
		m.contextClick(home).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
		
		

	}
}
