package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Systemadmin_page {

	public WebDriver driver;

	@FindBy(xpath = "(//span[@class='blue-link'][normalize-space()='Deactivate'])[1]")
	private WebElement deactivate;

	@FindBy(xpath = "(//button[normalize-space()='YES'])[1]")
	private WebElement yesbutton;

	@FindBy(xpath = "(//a[normalize-space()='Current resource list'])[1]")
	private WebElement list;

	@FindBy(xpath = "(//a[normalize-space()='Trust management'])[1]")
	private WebElement trustmanage;

	@FindBy(xpath = "(//span[@class='blue-link'][normalize-space()='Activate'])[1]")
	private WebElement activate;

	@FindBy(xpath = "(//a[normalize-space()='Testadmin'])[1]")
	private WebElement acc1;
	
	@FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
	private WebElement logoutt;
	
	@FindBy(xpath = "(//td[@class='cursor-pointer onkeyup'])[6]")
	private WebElement javascrp;
	
	   
		public Systemadmin_page(WebDriver syslog) {
			this.driver = syslog;

			PageFactory.initElements(driver, this);

		}


		public WebElement getDeactivate() {
			return deactivate;
		}


		public WebElement getYesbutton() {
			return yesbutton;
		}


		public WebElement getList() {
			return list;
		}


		public WebElement getTrustmanage() {
			return trustmanage;
		}


		public WebElement getActivate() {
			return activate;
		}


		public WebElement getAcc1() {
			return acc1;
		}


		public WebElement getLogoutt() {
			return logoutt;
		}


		public WebElement getJavascrp() {
			return javascrp;
		}
	
	
	
	
}
