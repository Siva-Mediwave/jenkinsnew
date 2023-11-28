package com.Step_Definitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Configuration_Reader.filereadermanager;
import com.Resources.Base_class;
import com.Runner_class.runner_class;
import com.Singleton_Design_Pattern.sdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class unpublish_def extends Base_class {

	public static WebDriver driver = runner_class.driver;

	public static sdp pom = new sdp(driver);

	@Given("user launch the url")
	public void user_launch_the_url() throws Throwable {
		geturl("https://serverstaging.resource.mindwave.site/");

	}

	@When("user Enter the Email Address in User Field")
	public void user_Enter_the_Email_Address_in_User_Field() throws Throwable {
		String cemail = filereadermanager.getInstanceFRM().getInstanceCR().getcemail();
		Inputvalues(pom.getTrustpage().getEmail(), cemail);

	}

	@When("user Enter the Password in password Field")
	public void user_Enter_the_Password_in_password_Field() throws Throwable {

		String cpass = filereadermanager.getInstanceFRM().getInstanceCR().getcpass();
		Inputvalues(pom.getTrustpage().getPassword(), cpass);

	}

	@Then("user Click the Login Button and It Navigates to current new resources page")
	public void user_Click_the_Login_Button_and_It_Navigates_to_current_new_resources_page() throws Throwable {
		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(3000);
	}

	@Given("user click the create new resources button")
	public void user_click_the_create_new_resources_button() throws Throwable {
		clickOnElement(pom.getUnpublishpage().getNewresource());
		Sleep(6000);
	}

	@When("user select the Resources Type and Enter the resource title")
	public void user_select_the_Resources_Type_and_Enter_the_resource_title() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getJavascript());
		// Sleep(10000);
		// clickOnElement(pom.getUnpublishpage().getType());

		Sleep(3000);
		String title = filereadermanager.getInstanceFRM().getInstanceCR().gettitle();
		Inputvalues(pom.getUnpublishpage().getTitle(), title);
	}

	@When("user select the topic and Age group")
	public void user_select_the_topic_and_Age_group() throws Throwable {
		Sleep(7000);
		clickOnElement(pom.getUnpublishpage().getTopic());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Sleep(7000);

		// clickOnElement(pom.getUnpublishpage().getAge());
		// Robot r1 = new Robot();
		// r1.keyPress(KeyEvent.VK_DOWN);
		// r1.keyRelease(KeyEvent.VK_DOWN);
		// r1.keyPress(KeyEvent.VK_ENTER);
		// r1.keyRelease(KeyEvent.VK_ENTER);

		jsScrollDownElement(pom.getUnpublishpage().getJavaexe());

		Sleep(10000);
		clickOnElement(pom.getUnpublishpage().getType());
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user select the upload documents and click the upload button")
	public void user_select_the_upload_documents_and_click_the_upload_button() throws Throwable {

		jsScrollDownElement(pom.getUnpublishpage().getJavaexecut());
		Sleep(12000);
		clickOnElement(pom.getUnpublishpage().getJavaexecut());
		Sleep(6000);
		clickOnElement(pom.getUnpublishpage().getUploaddocs());
		StringSelection str = new StringSelection("C:\\Users\\Mediwave\\Pictures\\Test.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb = new Robot();
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user view list of current tags and select the tags")
	public void user_view_list_of_current_tags_and_select_the_tags() throws Throwable {
		Sleep(5000);
		jsScrollDownElement(pom.getUnpublishpage().getJavatagss());
		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getViewlist());
		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getSugar());
		
		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getAddtags());
	}

	@When("user enter the tags and add the tags")
	public void user_enter_the_tags_and_add_the_tags() throws Throwable {
		String tags = filereadermanager.getInstanceFRM().getInstanceCR().gettags();
		Inputvalues(pom.getUnpublishpage().getTags(), tags);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("user select the publish radio button and approver button")
	public void user_select_the_publish_radio_button_and_approver_button() throws Throwable {
		clickOnElement(pom.getUnpublishpage().getAlltrust());
		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getApprover());
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Sleep(8000);
	}

	@When("user click submit for approval and success message pop up")
	public void user_click_submit_for_approval_and_success_message_pop_up() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getAppjavas());
		Sleep(8000);
		clickOnElement(pom.getUnpublishpage().getSubmit());
		Sleep(3000);
		Takescreenshot("pic3.PNG");
		Sleep(9000);

	}

	@When("user click the account and logout button and logout successfully")
	public void user_click_the_account_and_logout_button_and_logout_successfully() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getJavanews());
		 Sleep(8000);
		   
	clickOnElement(pom.getUnpublishpage().getAccount());
		
		clickOnElement(pom.getUnpublishpage().getLogoutt());
		Sleep(3000);
	
	}

	
	
	
	
	
}
