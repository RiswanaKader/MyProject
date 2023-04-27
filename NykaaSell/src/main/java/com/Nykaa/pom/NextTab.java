package com.Nykaa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaSell.BaseClass;

public class NextTab extends BaseClass {
	
	public NextTab(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//select[@class='css-2t5nwu']")
	private WebElement opt;
	public WebElement getOpt() {
		return opt;
	}
	
@FindBy(xpath="(//span[@class='btn-text'])[1]")
private WebElement add;
public WebElement getAdd() {
	return add;
}

@FindBy(xpath="//button[@class='css-aesrxy']")
private WebElement cart;
public WebElement getCart() {
	return cart;
}

@FindBy(xpath="//iframe[@src='/mobileCartIframe?ptype=customIframeCart']")
private WebElement frame;
public WebElement getFrame() {
	return frame;
}

@FindBy(xpath="//p[@data-test-id='select-quantity']")
private WebElement qt;
public WebElement getQt() {
	return qt;
}

@FindBy(xpath="(//div[@class='css-m37lhi'])[3]")
private WebElement count;
public WebElement getCount() {
	return count;
}

@FindBy(xpath="(//button[@class='css-1j2bj5f e8tshxd0'])[2]")
private WebElement procee;
public WebElement getProcee() {
	return procee;
}

@FindBy(xpath="//div[@class='css-70xe38 e14b3ylv5']")
private WebElement deliver;
public WebElement getDeliver() {
	return deliver;
}

@FindBy(xpath="(//input[@class='input-element  '])[1]")
private WebElement cre;
public WebElement getCre() {
	return cre;
}

@FindBy(xpath="(//input[@type='tel'])[2]")
private WebElement ex;
public WebElement getEx() {
	return ex;
}

@FindBy(xpath="//input[@type='number']")
private WebElement cvv;
public WebElement getCvv() {
	return cvv;
}

@FindBy(xpath="//button[@class='css-v61n2j e8tshxd0']")
private WebElement pay;
public WebElement getPay() {
	return pay;
}

@FindBy(xpath="(//button[@class='css-v61n2j e8tshxd0'])[2]")
private WebElement secure;
public WebElement getSecure() {
	return secure;
}

@FindBy(xpath= "(//button[@id='submit-action'])[2]")                                                      
private WebElement paynow;
public WebElement getPaynow() {
	return paynow;
}

@FindBy(xpath="//button[@class='css-1iwzqhf emgaj5l0']")
private WebElement close;
public WebElement getClose() {
	return close;
}

@FindBy(xpath="//p[@class='css-rxufl7 eoygcm00']")
private WebElement click1;
public WebElement getClick1() {
	return click1;
}

@FindBy(xpath="//p[@class='css-z7wmhp eka6zu20']")
private WebElement edit;
public WebElement getEdit() {
	return edit;
}

@FindBy(xpath="(//span[@class='css-175whwo ehes2bo0'])[2]")
private WebElement del;
public WebElement getDel() {
	return del;
}

@FindBy(xpath="//button[@class='css-110s749 e8tshxd1']")
private WebElement remove;
public WebElement getRemove() {
	return remove;
}















}
