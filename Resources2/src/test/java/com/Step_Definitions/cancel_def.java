package com.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.Configuration_Reader.filereadermanager;
import com.Resources.Base_class;
import com.Runner_class.runner_class;
import com.Singleton_Design_Pattern.sdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cancel_def extends Base_class {

	public static WebDriver driver = runner_class.driver;

	public static sdp pom = new sdp(driver);

	@Given("user launch the URL")
	public void user_launch_the_URL() throws Throwable {
		geturl("https://serverstaging.resource.mindwave.site/");

	}

	@When("user Enter the Email Address in User text box")
	public void user_Enter_the_Email_Address_in_User_text_box() throws Throwable {
		String aemail = filereadermanager.getInstanceFRM().getInstanceCR().getaemail();
		Inputvalues(pom.getTrustpage().getEmail(), aemail);
	}

	@When("user Enter the Password in password text box")
	public void user_Enter_the_Password_in_password_text_box() throws Throwable {
		String apass = filereadermanager.getInstanceFRM().getInstanceCR().getapass();
		Inputvalues(pom.getTrustpage().getPassword(), apass);
		Sleep(2000);

	}

	@Then("user Click the Login Button and It Navigates to current resource list page")
	public void user_Click_the_Login_Button_and_It_Navigates_to_current_resource_list_page() throws Throwable {
		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(3000);
	}

	@Given("user click the my notification button in dashboard and navigates to my notifiaction")
	public void user_click_the_my_notification_button_in_dashboard_and_navigates_to_my_notifiaction() throws Throwable {
		clickOnElement(pom.getCancelpage().getNotifications());
	}

	@When("user click the recently added notification button")
	public void user_click_the_recently_added_notification_button() throws Throwable {
		Sleep(6000);
		jsScrollDownElement(pom.getCancelpage().getJavascr());
		Sleep(5000);
		clickOnElement(pom.getCancelpage().getAutotest());

	}

	@When("user click the approve button and success message pops up")
	public void user_click_the_approve_button_and_success_message_pops_up() throws Throwable {
		Sleep(5000);
		jsScrollDownElement(pom.getCancelpage().getJavascrpit());
		Sleep(5000);
		clickOnElement(pom.getCancelpage().getApprove());
		Takescreenshot("pic4.PNG");
	}

	@When("user click the approved notification button and navigates to cancel approve page")
	public void user_click_the_approved_notification_button_and_navigates_to_cancel_approve_page() throws Throwable {
		Sleep(5000);
		jsScrollDownElement(pom.getCancelpage().getJavascr());
		Sleep(4000);
		clickOnElement(pom.getCancelpage().getAutotest());
	}

	@When("user click the cancel approve button and select okay button")
	public void user_click_the_cancel_approve_button_and_select_okay_button() throws Throwable {
		Sleep(5000);
		jsScrollDownElement(pom.getCancelpage().getJavasc());
		Sleep(4000);
		clickOnElement(pom.getCancelpage().getCancelapp());
		Sleep(4000);
		clickOnElement(pom.getCancelpage().getOkbutton());
		Sleep(4000);
		jsScrollDownElement(pom.getCancelpage().getJascript());
		
		Sleep(7000);
		clickOnElement(pom.getCancelpage().getAccou());
		
		clickOnElement(pom.getCancelpage().getLogo());

	}

}
