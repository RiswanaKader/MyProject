package com.Nykaa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaSell.BaseClass;

public class FirstTab extends BaseClass {

	public FirstTab(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="(//a[@class='css-qlopj4'])[1]")
	private WebElement hima;
	public WebElement getHima() {
		return hima;
	}
	
}
