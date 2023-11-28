package com.Step_Definitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.Configuration_Reader.filereadermanager;
import com.Resources.Base_class;
import com.Runner_class.runner_class;
import com.Singleton_Design_Pattern.sdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class publish_def extends Base_class {

	public static WebDriver driver = runner_class.driver;

	public static sdp pom = new sdp(driver);

	@Given("user Launch the URL")
	public void user_Launch_the_URL() throws Throwable {
		geturl("https://serverstaging.resource.mindwave.site/");
	}

	@When("user enter the Email Address in text box Field")
	public void user_enter_the_Email_Address_in_text_box_Field() throws Throwable {
		String cemail = filereadermanager.getInstanceFRM().getInstanceCR().getcemail();
		Inputvalues(pom.getTrustpage().getEmail(), cemail);
	}

	@When("user Enter the Password in text box Field")
	public void user_Enter_the_Password_in_text_box_Field() throws Throwable {
		String cpass = filereadermanager.getInstanceFRM().getInstanceCR().getcpass();
		Inputvalues(pom.getTrustpage().getPassword(), cpass);
	}

	@Then("user Click the Login Button and It Navigates to Current New Resources page")
	public void user_Click_the_Login_Button_and_It_Navigates_to_Current_New_Resources_page() throws Throwable {
		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(4000);
	}

	@Given("user click the Create new resources button")
	public void user_click_the_Create_new_resources_button() throws Throwable {
		clickOnElement(pom.getUnpublishpage().getNewresource());
		Sleep(6000);
	}

	@When("user select the resources type and enter the resource title")
	public void user_select_the_resources_type_and_enter_the_resource_title() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getJavascript());
		// Sleep(10000);
		// clickOnElement(pom.getUnpublishpage().getType());

		Sleep(3000);
		String title = filereadermanager.getInstanceFRM().getInstanceCR().gettitle();
		Inputvalues(pom.getUnpublishpage().getTitle(), title);
	}

	@When("user select the Topic and age group")
	public void user_select_the_Topic_and_age_group() throws Throwable {
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

	@When("user select the Upload Documents and click the Upload Button")
	public void user_select_the_Upload_Documents_and_click_the_Upload_Button() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getJavaexecut());
		Sleep(12000);
		clickOnElement(pom.getUnpublishpage().getJavaexecut());
		Sleep(6000);
		clickOnElement(pom.getUnpublishpage().getUploaddocs());
		StringSelection str = new StringSelection("C:\\Users\\Mediwave Digital\\Pictures\\Screenshots\\Screenshot (1).PNG");
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
	
		
		//Sleep(4000);
	//	jsScrollDownElement(pom.getUnpublishpage().getJavalink());
	//	Sleep(8000);
	//	clickOnElement(pom.getUnpublishpage().getInsert());
		
	//	String link = filereadermanager.getInstanceFRM().getInstanceCR().getLink();
	// Inputvalues(pom.getUnpublishpage().getSource(), link);
//	Sleep(2000);
//	clickOnElement(pom.getUnpublishpage().getSave());		
	}

	@When("user view list of Current Tags and select the Tags")
	public void user_view_list_of_Current_Tags_and_select_the_Tags() throws Throwable {

		Sleep(5000);
		jsScrollDownElement(pom.getUnpublishpage().getJavatagss());
		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getViewlist());
		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getSugar());

		Sleep(3000);
		clickOnElement(pom.getUnpublishpage().getAddtags());

	}

	@When("user Enter the Tags and Add the tags")
	public void user_Enter_the_Tags_and_Add_the_tags() throws Throwable {
		String tags = filereadermanager.getInstanceFRM().getInstanceCR().gettags();
		Inputvalues(pom.getUnpublishpage().getTags(), tags);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("user Select the Publish Radio button and Approver button")
	public void user_Select_the_Publish_Radio_button_and_Approver_button() throws Throwable {
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

	@When("user click Submit for Approval and success message pop up")
	public void user_click_Submit_for_Approval_and_success_message_pop_up() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getAppjavas());
		Sleep(8000);
		clickOnElement(pom.getUnpublishpage().getSubmit());
		Sleep(3000);
		Takescreenshot("pic3.PNG");
		Sleep(9000);
	}

	@When("user click the account and Logout button and Logout successfully")
	public void user_click_the_account_and_Logout_button_and_Logout_successfully() throws Throwable {
		jsScrollDownElement(pom.getUnpublishpage().getJavanews());
		Sleep(8000);

		clickOnElement(pom.getUnpublishpage().getAccount());

		clickOnElement(pom.getUnpublishpage().getLogoutt());
		Sleep(3000);
	}

	@When("user login as approver by using email and password and click login button")
	public void user_login_as_approver_by_using_email_and_password_and_click_login_button() throws Throwable {
		Sleep(4000);
		String aemail = filereadermanager.getInstanceFRM().getInstanceCR().getaemail();
		Inputvalues(pom.getTrustpage().getEmail(), aemail);

		Sleep(4000);
		String apass = filereadermanager.getInstanceFRM().getInstanceCR().getapass();
		Inputvalues(pom.getTrustpage().getPassword(), apass);
		Sleep(2000);

		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(3000);
	}

	@When("user click the Recently Added notification button")
	public void user_click_the_Recently_Added_notification_button() throws Throwable {
		clickOnElement(pom.getCancelpage().getNotifications());

		Sleep(9000);
		jsScrollDownElement(pom.getCancelpage().getJavascr());
		Sleep(5000);
		clickOnElement(pom.getCancelpage().getAutotest());

	}

	@When("user click the Approve button and Success message pops up")
	public void user_click_the_Approve_button_and_Success_message_pops_up() throws Throwable {
		Sleep(5000);
		jsScrollDownElement(pom.getCancelpage().getJavascrpit());
		Sleep(5000);
		clickOnElement(pom.getCancelpage().getApprove());
		Takescreenshot("pic5.PNG");

	}

	@When("user click logout button and logging out from approver")
	public void user_click_logout_button_and_logging_out_from_approver() throws Throwable {
		Sleep(4000);
		jsScrollDownElement(pom.getCancelpage().getJascript());

		Sleep(7000);
		clickOnElement(pom.getCancelpage().getAccou());

		clickOnElement(pom.getCancelpage().getLogo());
	}

	@When("user login as Content creator by using email and password")
	public void user_login_as_Content_creator_by_using_email_and_password() throws Throwable {
		Sleep(4000);
		String cemail = filereadermanager.getInstanceFRM().getInstanceCR().getcemail();
		Inputvalues(pom.getTrustpage().getEmail(), cemail);

		Sleep(4000);
		String cpass = filereadermanager.getInstanceFRM().getInstanceCR().getcpass();
		Inputvalues(pom.getTrustpage().getPassword(), cpass);

		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(3000);

	}

	@When("user click my notification button and select the recently added resources")
	public void user_click_my_notification_button_and_select_the_recently_added_resources() throws Throwable {
		clickOnElement(pom.getPublishpage().getMynotification());
		Sleep(3000);

		jsScrollDownElement(pom.getPublishpage().getJavetwoo());
		Sleep(4000);
		clickOnElement(pom.getPublishpage().getNotifione());

		Sleep(4000);

	}

	@When("user click the publish button and click okay button")
	public void user_click_the_publish_button_and_click_okay_button() throws Throwable {
		jsScrollDownElement(pom.getPublishpage().getJavathree());
		Sleep(3000);
		clickOnElement(pom.getPublishpage().getPublish());
		Sleep(3000);

		clickOnElement(pom.getPublishpage().getOkaybutton());
	}

	@When("user click the unpublish button and click okay button")
	public void user_click_the_unpublish_button_and_click_okay_button() throws Throwable {

		Sleep(4000);
		clickOnElement(pom.getPublishpage().getNotifione());
		Sleep(3000);
		clickOnElement(pom.getPublishpage().getUnpublish());
		Sleep(3000);
		clickOnElement(pom.getPublishpage().getOkaybutton());

	}

	@When("user click the logout button in the dashboard")
	public void user_click_the_logout_button_in_the_dashboard() throws Throwable {

		jsScrollDownElement(pom.getUnpublishpage().getJavanews());
		Sleep(8000);

		clickOnElement(pom.getUnpublishpage().getAccount());

		clickOnElement(pom.getUnpublishpage().getLogoutt());
		Sleep(3000);

	}

}
