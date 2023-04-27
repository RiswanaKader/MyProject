package com.myntra.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraTask {
	static WebDriver driver;
	static int total;
	static Integer max;
	private static void browserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		System.out.println("Launched");
		
	}
	private static void productsCount()
	{
		List<WebElement> count = driver.findElements(By.xpath("//li[@class='product-base']"));
		System.out.println(count.size());
		for(WebElement total:count)
		{
     	System.out.println(total.getText());
 
		}
		System.out.println("--------------");	
	}
	private static void maximumPrice()
	{
		List<WebElement> allShirts = driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		List<Integer> shirtPrices=new ArrayList<Integer>();
		for(int i=0;i<allShirts.size();i++)
		{
			String priceText=allShirts.get(i).getText().replace("Rs. ", "");
			int value=Integer.parseInt(priceText);
			shirtPrices.add(value);
			
		}
		max=Collections.max(shirtPrices);
		System.out.println("Maximum Priced Shirt:"+max);
		
	    	}	
	private static void getMaximumPrice(Integer max)
	{
		WebElement maxBrandName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+max+"']"
				+ "//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
		String brandName = maxBrandName.getText();
		System.out.println("Maximum Priced Brand:"+brandName);
	}
	private static void getSubBrandName(Integer max)
	{
		WebElement subBrandName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+max+"']"
				+ "//ancestor::div[@class='product-productMetaInfo']//h4[@class='product-product']"));
		String brandName = subBrandName.getText();
		System.out.println("Maximum Priced Sub Brand: "+brandName);
	}
	public static void main(String[] args) 
	{
		browserLaunch();
	    productsCount();
		maximumPrice();
	    getMaximumPrice(max);
	    getSubBrandName(max);
	}

}
