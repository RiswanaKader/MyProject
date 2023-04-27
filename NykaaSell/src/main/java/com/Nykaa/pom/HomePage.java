package com.Nykaa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaSell.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(xpath="//button[@class='css-1gzc5zn']")

private WebElement sign;

public WebElement getSign() {
	return sign;
}

@FindBy(xpath="(//button[@class='css-ejuz3m'])[1]")
 
private WebElement num;

public WebElement getNum() {
	return num;
}
@FindBy(xpath="//input[@name='emailMobile']")

private WebElement send;

public WebElement getSend() {
	return send;
}

@FindBy(xpath="//button[@id='submitVerification']")

private WebElement proceed;

public WebElement getProceed() {
	return proceed;
}

@FindBy(xpath="//input[@name='otpValue']")

private WebElement otp;

public WebElement getOtp() {
	return otp;
}

@FindBy(xpath="//button[@type='submit']")

private WebElement verify;

public WebElement getVerify() {
	return verify;
}

@FindBy(xpath="//a[text()='mom & baby']")

private WebElement mom;

public WebElement getMom() {
	return mom;
}

@FindBy(xpath="//a[text()='Baby Powder']")

private WebElement baby;

public WebElement getBaby() {
	return baby;
}









}
