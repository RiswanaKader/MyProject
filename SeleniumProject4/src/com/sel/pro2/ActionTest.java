package com.sel.pro2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject4\\driver\\chromedriver.exe");
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("Incognito");
	WebDriver driver=new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	
	Actions act= new Actions(driver);
	
    WebElement men = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
	act.moveToElement(men).build().perform();
    Thread.sleep(3000);
    WebElement sneaker = driver.findElement(By.xpath("((//span[@class='linkTest'])[6]//ancestor::div[@class='colDataInnerBlk']//following-sibling::span[@class='linkTest'])[7]"));
   
    act.moveToElement(sneaker).build().perform();
    act.contextClick(sneaker).build().perform();
    Thread.sleep(3000);
	WebElement imp = driver.findElement(By.xpath("(//a[text()='Impact@Snapdeal'])[1]"));
	act.click(imp).build().perform();
	Thread.sleep(3000);
 
	 driver.navigate().to("https://demoqa.com/droppable/");
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,200);");
	 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	 Thread.sleep(3000);
	 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	 Thread.sleep(3000);
	 act.dragAndDrop(drag, drop).build().perform();
      
	 driver.close();
 }
}
