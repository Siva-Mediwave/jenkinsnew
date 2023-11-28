package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancel_page {

	public WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='My notifications']")
	private WebElement notifications;

	@FindBy(xpath = "(//td[normalize-space()='Resource automation staging'])[1]")
	private WebElement autotest;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement approve;

	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement cancelapp;

	@FindBy(xpath = "//button[normalize-space()='Okay']")
	private WebElement okbutton;

	@FindBy(xpath = "//div[@class='app-sub-header multi-btn']")
	private WebElement javascrpit;

	@FindBy(xpath = "(//td[contains(text(),'review')])[1]")
	private WebElement javascr;

	@FindBy(xpath = "//div[@class='col-12 col-md-6 secondary-text fw-bold cursor-pointer onkeyup']")
	private WebElement javasc;
	
	@FindBy(xpath = "//a[@id='my-account-button']")
	private WebElement accou;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logo;
	
	@FindBy(xpath = "//div[@class='header-img']//*[name()='svg']")
	private WebElement jascript;

	public cancel_page(WebDriver Clog) {
		this.driver = Clog;

		PageFactory.initElements(driver, this);

	}

	public WebElement getNotifications() {
		return notifications;
	}

	public WebElement getApprove() {
		return approve;
	}

	public WebElement getAutotest() {
		return autotest;
	}

	public WebElement getCancelapp() {
		return cancelapp;
	}

	public WebElement getOkbutton() {
		return okbutton;
	}

	public WebElement getJavascrpit() {
		return javascrpit;
	}

	public WebElement getJavascr() {
		return javascr;
	}

	public WebElement getJavasc() {
		return javasc;
	}

	public WebElement getAccou() {
		return accou;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getJascript() {
		return jascript;
	}

	
	
	
	
}
