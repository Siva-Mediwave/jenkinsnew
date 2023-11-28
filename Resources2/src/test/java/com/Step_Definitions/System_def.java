package com.Step_Definitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.Configuration_Reader.filereadermanager;
import com.Resources.Base_class;
import com.Runner_class.runner_class;
import com.Singleton_Design_Pattern.sdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class System_def extends Base_class {

	public static WebDriver driver = runner_class.driver;

	public static sdp pom = new sdp(driver);

	@Given("user launch the app")
	public void user_launch_the_app() throws Throwable {
		geturl("https://serverstaging.resource.mindwave.site/");
	}

	@When("user enter the Email Address in text field")
	public void user_enter_the_Email_Address_in_text_field() throws Throwable {

		String sysemail = filereadermanager.getInstanceFRM().getInstanceCR().getsysemail();
		Inputvalues(pom.getTrustpage().getEmail(), sysemail);

	}

	@When("user enter the Password in text field")
	public void user_enter_the_Password_in_text_field() throws Throwable {
		String syspass = filereadermanager.getInstanceFRM().getInstanceCR().getsyspass();
		Inputvalues(pom.getTrustpage().getPassword(), syspass);
		Sleep(2000);

	}

	@Then("user click the Login Button and it navigates to Trust management")
	public void user_click_the_Login_Button_and_it_navigates_to_Trust_management() throws Throwable {
		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(3000);

	}

	@Given("user click the deactivate button and confirm pop up occurs")
	public void user_click_the_deactivate_button_and_confirm_pop_up_occurs() throws Throwable {
		
        jsScrollDownElement(pom.getSysopage().getJavascrp());
        Sleep(7000);
		clickOnElement(pom.getSysopage().getDeactivate());

	}

	@When("user click the yes button and success message pops up")
	public void user_click_the_yes_button_and_success_message_pops_up() throws Throwable {
		clickOnElement(pom.getSysopage().getYesbutton());

	}

	@When("user click the current resources list button and take screenshot")
	public void user_click_the_current_resources_list_button_and_take_screenshot() throws Throwable {
		clickOnElement(pom.getSysopage().getList());
		Takescreenshot("pic2.PNG");
		waitForSeconds(30);
	}

	@When("user click the Trust management button and navigates to trust management page")
	public void user_click_the_Trust_management_button_and_navigates_to_trust_management_page() throws Throwable {
		clickOnElement(pom.getSysopage().getTrustmanage());
		Sleep(3000);
	}

	@When("user click the activate button and confirm pop up occurs")
	public void user_click_the_activate_button_and_confirm_pop_up_occurs() throws Throwable {
		jsScrollDownElement(pom.getSysopage().getJavascrp());
        Sleep(7000);
		clickOnElement(pom.getSysopage().getActivate());
		

	}

	@When("user click Yes Button and success message pop up")
	public void user_click_Yes_Button_and_success_message_pop_up() throws Throwable {
		clickOnElement(pom.getSysopage().getYesbutton());

	}

	@When("user click the Current resources List button and Take screenshot")
	public void user_click_the_Current_resources_List_button_and_Take_screenshot() throws Throwable {
		clickOnElement(pom.getSysopage().getList());
		waitForSeconds(30);
	}

}
