package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Publish_page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='My notifications']")
	private WebElement mynotification;
	
	@FindBy(xpath = "(//td[normalize-space()='Resource automation staging'])[1]")
	private WebElement notifione;
	
	@FindBy(xpath = "//div[@class='header fw-bold mb-3']")
	private WebElement javaone;
	
	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement publish;
	
	@FindBy(xpath = "//button[normalize-space()='Okay']")
	private WebElement okaybutton;
	
	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement unpublish;
	
	@FindBy(xpath = "(//td[contains(text(),'publish')])[1]")
	private WebElement javetwoo;
	
	@FindBy(xpath = "//div[@class='header fw-bold mb-3']")
	private WebElement javathree;
	
	public Publish_page(WebDriver plog) {
		this.driver = plog;

		PageFactory.initElements(driver, this);

	}

	public WebElement getMynotification() {
		return mynotification;
	}

	public WebElement getNotifione() {
		return notifione;
	}

	public WebElement getJavaone() {
		return javaone;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getUnpublish() {
		return unpublish;
	}

	public WebElement getOkaybutton() {
		return okaybutton;
	}

	public WebElement getJavetwoo() {
		return javetwoo;
	}

	public WebElement getJavathree() {
		return javathree;
	}
	
	
	

}
