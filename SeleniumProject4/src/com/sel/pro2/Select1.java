package com.sel.pro2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject4\\driver\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("Incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/select-menu");
	
//		WebElement car = driver.findElement(By.id("cars"));
//		Select s2=new Select(car);
//		System.out.println(s2.isMultiple());
//		s2.selectByIndex(3);
//		s2.selectByValue("opel");
//		s2.selectByVisibleText("Saab");
//		
//		WebElement first= s2.getFirstSelectedOption();
//		System.out.println(first.getText());
//		System.out.println("***************");
//		List<WebElement> all = s2.getAllSelectedOptions();
//

//		for(WebElement allopt:all)
//			System.out.println(allopt.getText());
//		System.out.println("***************");
//		List<WebElement> opt  = s2.getOptions();
//		
//		for(WebElement op:opt)
//			System.out.println(op.getText());
//		System.out.println("***************");
		
//		Thread.sleep(3000);
//		
//		s2.deselectAll();
//		
//		driver.navigate().to("https://www.amazon.in/");
//		WebElement amaze = driver.findElement(By.name("url"));
//		Select s3=new Select(amaze);
//		System.out.println(s3.isMultiple());
		
//		s3.selectByVisibleText("Alexa Skills");
//		Thread.sleep(3000);
		
//		driver.close();
	    driver.get("https://api.razorpay.com/v1/payments/LYmHmsK13CqZL3/dcc_info#");
	    
	    WebElement inr = driver.findElement(By.xpath("//input[@id='INR']"));
	    Actions a=new Actions(driver);
		a.click(inr).build().perform();
		Thread.sleep(5000);
		
		WebElement sub = driver.findElement(By.xpath("(//button[@id='submit-action'])[2]"));
		a.click(sub).build().perform();
	}

}
