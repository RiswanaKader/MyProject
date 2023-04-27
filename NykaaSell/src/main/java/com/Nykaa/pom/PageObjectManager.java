package com.Nykaa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NykaaSell.BaseClass;

public class PageObjectManager extends BaseClass {

	public PageObjectManager(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
}
	private HomePage hp;
	public HomePage getHp() {
		hp=new HomePage(driver);
		return hp;
	}
	
	private FirstTab ft;
	public FirstTab getFt() {
		ft=new FirstTab(driver);
		return ft;
	}
	
	private NextTab nt;
	public NextTab getNt() {
		nt=new NextTab(driver);
		return nt;
	}
	
}

