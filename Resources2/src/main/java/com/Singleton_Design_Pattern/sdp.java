package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Publish_page;
import com.Page_Object_Model.Systemadmin_page;
import com.Page_Object_Model.Trustadmin_page;
import com.Page_Object_Model.Unpublish_page;
import com.Page_Object_Model.cancel_page;

public class sdp {

	public WebDriver driver;
	
	private Trustadmin_page trust;
	private Systemadmin_page syso;
	private Unpublish_page unpublish;
	private cancel_page cancel;
	private Publish_page publish;
	
	
	public sdp(WebDriver driver1) {
		this.driver = driver1;
		
		
	}


	public Trustadmin_page getTrustpage() {
		trust = new Trustadmin_page(driver);
		return trust;
	}


	public Systemadmin_page getSysopage() {
		syso = new Systemadmin_page(driver);
		return syso;
	}


	public Unpublish_page getUnpublishpage() {
		unpublish = new Unpublish_page(driver);
		return unpublish;
	}


	public cancel_page getCancelpage() {
		cancel = new cancel_page(driver);
		return cancel;
	}


	public Publish_page getPublishpage() {
		publish = new Publish_page(driver);
		return publish;
	}
	
	
	
	
	
	
	
	
	
	
}
