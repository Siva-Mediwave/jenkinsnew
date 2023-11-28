package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trustadmin_page {
	
   public WebDriver driver;
   
   @FindBy(xpath = "(//input[@id='email'])[1]")
   private WebElement email;
   
   @FindBy(xpath = "//input[@id='password']")
   private WebElement password;
   
   @FindBy(xpath = "//button[normalize-space()='LOG IN']")
   private WebElement login;
   
   @FindBy(xpath = "//a[normalize-space()='User management']")
   private WebElement usermanage;
   
   @FindBy(xpath = "//span[@class='acces-btn btn-secondary focusto']")
   private WebElement adduser;
   
   @FindBy(xpath = "//input[@id='name']")
   private WebElement name;
   
   @FindBy(xpath = "//input[@id='email']")
   private WebElement email1;
   
   @FindBy(xpath = "//input[@id='contentCreator_popup']")
   private WebElement creator;
   
   @FindBy(xpath = "//input[@id='contentApprover_popup']")
   private WebElement approver;
   
   @FindBy(xpath = "//button[normalize-space()='CREATE USER']")
   private WebElement create;
   
   @FindBy(xpath = "//a[normalize-space()='Trustsiva']")
   private WebElement Acc;
   
   @FindBy(xpath = "//a[normalize-space()='Logout']")
   private WebElement logout;
   
   
	public Trustadmin_page(WebDriver Tlog) {
		this.driver = Tlog;

		PageFactory.initElements(driver, this);

	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}


	public WebElement getUsermanage() {
		return usermanage;
	}


	public WebElement getAdduser() {
		return adduser;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getEmail1() {
		return email1;
	}


	public WebElement getCreator() {
		return creator;
	}


	public WebElement getApprover() {
		return approver;
	}


	public WebElement getCreate() {
		return create;
	}


	public WebElement getAcc() {
		return Acc;
	}


	public WebElement getLogout() {
		return logout;
	}
   
	
   
   
   
   
	
	

}
