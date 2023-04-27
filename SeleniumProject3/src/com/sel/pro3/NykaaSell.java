package com.sel.pro3;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class NykaaSell {
		

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject3\\driver\\chromedriver.exe");
			ChromeOptions ch= new ChromeOptions();
			ch.addArguments("Incognito");
			WebDriver driver=new ChromeDriver(ch);
			driver.manage().window().maximize();
			driver.get("https://www.nykaa.com/"); 
			
			Actions a= new Actions(driver);
			WebElement sign = driver.findElement(By.xpath("//button[@class='css-1gzc5zn']"));
			a.click(sign).build().perform();
			Thread.sleep(3000);
		
			WebElement num = driver.findElement(By.xpath("(//button[@class='css-ejuz3m'])[1]"));
			a.click(num).build().perform();
			Thread.sleep(3000);
			
			WebElement send = driver.findElement(By.xpath("//input[@name='emailMobile']"));
			send.sendKeys("6383376698");
			Thread.sleep(3000);
			
			WebElement proceed = driver.findElement(By.xpath("//button[@id='submitVerification']"));
			a.click(proceed).build().perform();
			Thread.sleep(3000);
			
			WebElement otp = driver.findElement(By.xpath("//input[@name='otpValue']"));
			Scanner s=new Scanner(System.in);
			String n=s.next();
			otp.sendKeys(n);
			
			Thread.sleep(3000);
			
			WebElement verify = driver.findElement(By.xpath("//button[@type='submit']"));
			a.click(verify).build().perform();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement mom = driver.findElement(By.xpath("//a[text()='mom & baby']"));
			a.moveToElement(mom).build().perform();
			Thread.sleep(3000);
			
			WebElement powder = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
			a.click(powder).build().perform();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String current = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for(String actual:handles)
			{
				if(!actual.equalsIgnoreCase(current))
				{
					driver.switchTo().window(actual);
					
				}
			}
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500);");
			Thread.sleep(5000);
			WebElement hima = driver.findElement(By.xpath("(//a[@class='css-qlopj4'])[1]"));
			a.click(hima).build().perform();
			Thread.sleep(5000);
			String current1 = driver.getWindowHandle();
			Set<String> now = driver.getWindowHandles();
			for(String new1:now)
			{
				if(!new1.equalsIgnoreCase(current1))
				{
					driver.switchTo().window(new1);
				}
			}
			Thread.sleep(5000);
			WebElement opt = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
			Thread.sleep(5000);
			Select h= new Select(opt);
			System.out.println(h.isMultiple());
			h.selectByIndex(3);
			Thread.sleep(5000);
			
			WebElement add = driver.findElement(By.xpath("(//span[@class='btn-text'])[1]"));
			a.click(add).build().perform();
			Thread.sleep(5000);
			
			WebElement cart = driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
			a.click(cart).build().perform();
			Thread.sleep(5000);
			
			WebElement f = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		    driver.switchTo().frame(f);
	     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     	WebElement qt = driver.findElement(By.xpath("//p[@data-test-id='select-quantity']"));
			a.click(qt).build().perform();
			Thread.sleep(5000);
			
			WebElement count = driver.findElement(By.xpath("(//div[@class='css-m37lhi'])[3]"));
			a.click(count).build().perform();
			Thread.sleep(5000);
			
			WebElement procee = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
			a.click(procee).build().perform();
			Thread.sleep(5000);
			
			WebElement deliver = driver.findElement(By.xpath("//div[@class='css-70xe38 e14b3ylv5']"));
			a.click(deliver).build().perform();
			
			
			WebElement cre = driver.findElement(By.xpath("(//input[@class='input-element  '])[1]"));
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(cre));
            String w=s.next();
            cre.sendKeys(w);
			
				
			WebElement ex = driver.findElement(By.xpath("(//input[@type='tel'])[2]"));
			WebDriverWait wait2=new WebDriverWait(driver,30);
			wait2.until(ExpectedConditions.visibilityOf(ex));
			String e=s.next();
			ex.sendKeys(e);
			
			WebElement cvv = driver.findElement(By.xpath("//input[@type='number']"));
			WebDriverWait wait3=new WebDriverWait(driver,30);
			wait3.until(ExpectedConditions.visibilityOf(cvv));
			String r=s.next();
			cvv.sendKeys(r);
			
			WebElement pay = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
			a.click(pay).build().perform();
			
			WebElement secure = driver.findElement(By.xpath("(//button[@class='css-v61n2j e8tshxd0'])[2]"));
			a.click(secure).build().perform();
			Thread.sleep(5000);
			
			
			WebElement paynow = driver.findElement(By.xpath("(//button[@id='submit-action'])[2]"));
    		WebDriverWait waitfor=new WebDriverWait(driver,30);
			waitfor.until(ExpectedConditions.visibilityOf(paynow));
			a.click(paynow).build().perform();
			
			driver.get("https://www.nykaa.com/payment?ptype=checkout&status=failed");
			TakesScreenshot image= (TakesScreenshot)driver;
			
			File src=image.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject3\\ScreenShot\\n.png");
				
			FileHandler.copy(src,dest);
			
			WebElement close = driver.findElement(By.xpath("//button[@class='css-1iwzqhf emgaj5l0']"));
			a.click(close).build().perform();
			Thread.sleep(5000);
			
			WebElement click1 = driver.findElement(By.xpath("//p[@class='css-rxufl7 eoygcm00']"));
			a.click(click1).build().perform();
			Thread.sleep(5000);
			
			WebElement edit = driver.findElement(By.xpath("//p[@class='css-z7wmhp eka6zu20']"));
			a.click(edit).build().perform();
			Thread.sleep(5000);
			
			WebElement del = driver.findElement(By.xpath("(//span[@class='css-175whwo ehes2bo0'])[2]"));
			a.click(del).build().perform();
			Thread.sleep(5000);
			
            WebElement remove = driver.findElement(By.xpath("//button[@class='css-110s749 e8tshxd1']"));
            a.click(remove).build().perform();
            Thread.sleep(5000);

			
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			
			
			driver.quit();
			
			s.close();
		}			
	}	
				
			
			
			
			
			
			
			
			

