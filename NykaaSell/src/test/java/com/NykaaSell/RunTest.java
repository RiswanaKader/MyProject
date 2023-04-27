package com.NykaaSell;

import java.io.IOException;
import java.util.Scanner;

import com.Nykaa.pom.PageObjectManager;

public class RunTest extends BaseClass {
	
public static void main(String[] args) throws InterruptedException, IOException
{
	PageObjectManager pom=new PageObjectManager(driver);
	launchUrl("https://www.nykaa.com/");
	Thread.sleep(5000);
	
	clickOnElement(pom.getHp().getSign());
	Thread.sleep(5000);
	
	clickOnElement(pom.getHp().getNum());
	Thread.sleep(5000);
	
	implicitWait();
	
	input(pom.getHp().getSend(),"6383376698");
	Thread.sleep(5000);
	
	clickOnElement(pom.getHp().getProceed());
	Thread.sleep(5000);
	
	Scanner s=new Scanner(System.in);
	String n=s.next();
	input(pom.getHp().getOtp(),n);
	Thread.sleep(5000);
	
	clickOnElement(pom.getHp().getVerify());
	Thread.sleep(5000);
	
	mouseHover(pom.getHp().getMom());
	Thread.sleep(5000);
	
	implicitWait();
	
	clickOnElement(pom.getHp().getBaby());
	Thread.sleep(5000);
	
	implicitWait();
	
	switchToWindow();
	
	javaScript(0,500);
	
	implicitWait();
	
	clickOnElement(pom.getFt().getHima());
	Thread.sleep(5000);
	
	switchToWindow();
	Thread.sleep(5000);
	
	selectFromDropdown(pom.getNt().getOpt(), "index", "3");
	Thread.sleep(5000);
	
	clickOnElement(pom.getNt().getAdd());
	Thread.sleep(5000);
	
	clickOnElement(pom.getNt().getCart());
	Thread.sleep(5000);
	
	frameUsingElement(pom.getNt().getFrame());
	Thread.sleep(5000);
	
	implicitWait();
	
	clickOnElement(pom.getNt().getQt());
	Thread.sleep(5000);
	
	implicitWait();
	
	clickOnElement(pom.getNt().getCount());
	Thread.sleep(5000);
	
	implicitWait();
	
	clickOnElement(pom.getNt().getProcee());
	Thread.sleep(5000);
	
	implicitWait();
	
	clickOnElement(pom.getNt().getDeliver());
	Thread.sleep(5000);
	
	explicitWait(pom.getNt().getCre());
	
	String cre=s.next();
	
	input(pom.getNt().getCre(),cre);
	
	explicitWait(pom.getNt().getEx());
	
	String ex=s.next();
	
	input(pom.getNt().getEx(),ex);
	
	explicitWait(pom.getNt().getCvv());
	
	String cvv=s.next();
	
	input(pom.getNt().getCvv(),cvv);
	Thread.sleep(5000);
	
	clickOnElement(pom.getNt().getPay());
	Thread.sleep(5000);
	
	clickOnElement(pom.getNt().getSecure());
	Thread.sleep(5000);
	
	explicitWait(pom.getNt().getPaynow());
	
	clickOnElement(pom.getNt().getPaynow());
	Thread.sleep(5000);
	
	screenShot("nykaa");
	
	Thread.sleep(5000);
	
	clickOnElement(pom.getNt().getClose());
	
	clickOnElement(pom.getNt().getClick1());
	
	clickOnElement(pom.getNt().getEdit());
	
	clickOnElement(pom.getNt().getDel());
	
	clickOnElement(pom.getNt().getRemove());
	
	
	
	
	
	
	

	

	
}
}
