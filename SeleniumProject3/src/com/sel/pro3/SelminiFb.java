package com.sel.pro3;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SelminiFb {
	
public static void main(String[] args) throws InterruptedException, IOException
{
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject3\\driver\\chromedriver.exe");
 ChromeOptions ch=new ChromeOptions();
 ch.addArguments("Incognito");
 WebDriver driver=new ChromeDriver(ch);
 driver.manage().window().maximize();
 driver.get("https://www.facebook.com/");
 Thread.sleep(5000);
		
 WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
 user.sendKeys("rissweet4@gmail.com");
 Thread.sleep(5000);
 
 WebElement pass = driver.findElement(By.xpath("//input[@name='email']//ancestor::div[@class='_6luv _52jv']//parent::div[@class='_6lux']//following-sibling::div[@class='_6lux']//descendant::input[@name='pass']"));
 pass.sendKeys("dskbhb@d");
 Thread.sleep(5000);
        
 WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
 Actions a=new Actions(driver);
 a.click(login).build().perform();
 Thread.sleep(5000);
        
 WebElement text = driver.findElement(By.xpath("//div[@class='_9ay7']"));
 text.getText();
 Thread.sleep(5000);
        
 if(text.isDisplayed())
 {
  WebElement forget = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
  a.click(forget).build().perform();	
  Thread.sleep(5000);
  }
        
 WebElement enter = driver.findElement(By.xpath("//button[@type='submit']//ancestor::div[@class='mvl ptm uiInterstitial _9np_ uiInterstitialLarge uiBoxWhite']//descendant::input[@name='email']"));
 enter.sendKeys("rissweet4@gmail.com");
 Thread.sleep(5000);
        
 WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
 a.click(search).build().perform();
 Thread.sleep(5000);
        
 TakesScreenshot image= (TakesScreenshot)driver;
 File src=image.getScreenshotAs(OutputType.FILE);
 File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject3\\Screenshot.png");
 FileHandler.copy(src, dest);
 Thread.sleep(5000);
        
 driver.close();
 }
}
