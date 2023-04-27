package com.NykaaSell;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
     protected static WebDriver driver;
  //   static Actions a=new Actions(driver);
	public static void launchUrl(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	public static boolean elementDisplayed(WebElement element)
	{
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public static boolean elementEnabled(WebElement element)
	{
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public static void clickOnElement(WebElement element)
	{
		if(elementDisplayed(element))
		{
			if(elementEnabled(element))
			{
				element.click();
			}
		}
	}
	public static void input(WebElement element,String value)
	{
		if(elementDisplayed(element))
		{
			if(elementEnabled(element))
			{
				element.sendKeys(value);
			}
		}
	}
	public static void javaScript(int width,int height) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+width+","+height+");");
	}
	public static void screenShot(String fileName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\NykaaSell\\Screenshots\\im.png");
		FileHandler.copy(src, dest);
	}
	public static void confirmAlert(String condition)
	{
		Alert confirm_alert = driver.switchTo().alert();
		if(condition.equalsIgnoreCase("accept"))
{
		confirm_alert.accept();
		
	}
	else if(condition.equalsIgnoreCase("dismiss"))
	{
	 confirm_alert.dismiss();
	}
	}
	public static void mouseHover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public static void rightClick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void main(WebElement src,WebElement dest)
	{
		Actions a=new Actions(driver);
	    a.dragAndDrop(src, dest).build().perform();
	}
	public static void selectFromDropdown(WebElement element,String option,String value)
	{
		Select s=new Select(element);
		if(option.equalsIgnoreCase("index"))
		{
			s.selectByIndex(Integer.parseInt(value));
		}
		else if(option.equalsIgnoreCase("value"))
		{
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("visibleText"))
		{
			s.selectByVisibleText(value);
		}
	}
public static void frameUsingIndex(int index)
{
	driver.switchTo().frame(index);
}
public static void frameUsingIdOrName(String value)
{
	driver.switchTo().frame(value);
}
	
public static void frameUsingElement(WebElement element)
	{
		driver.switchTo().frame(element);
	}
public static void switchToWindow()
{
String id = driver.getWindowHandle();
Set<String> all_id = driver.getWindowHandles();
for(String newId:all_id)
{
	if(!newId.equalsIgnoreCase(id))
	{
		driver.switchTo().window(newId);
		
	}
}
}
public static void implicitWait()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public static void explicitWait(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(element));
}
}
