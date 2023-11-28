package com.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.Configuration_Reader.filereadermanager;
import com.Resources.Base_class;
import com.Runner_class.runner_class;
import com.Singleton_Design_Pattern.sdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trust_def extends Base_class {

	public static WebDriver driver = runner_class.driver;

	public static sdp pom = new sdp(driver);

	@Given("user Launch the app")
	public void user_Launch_the_app() throws Throwable {
		geturl("https://serverstaging.resource.mindwave.site/");

	}

	@When("user enter the email address in user field")
	public void user_enter_the_email_address_in_user_field() throws Throwable {
		String email = filereadermanager.getInstanceFRM().getInstanceCR().getemail();
		Inputvalues(pom.getTrustpage().getEmail(), email);

	}

	@When("user enter the password in password field")
	public void user_enter_the_password_in_password_field() throws Throwable {
		String pass = filereadermanager.getInstanceFRM().getInstanceCR().getpassword();
		Inputvalues(pom.getTrustpage().getPassword(), pass);

	}

	@Then("user click the login Button and it navigates to current resource list page")
	public void user_click_the_login_Button_and_it_navigates_to_current_resource_list_page() throws Throwable {
		clickOnElement(pom.getTrustpage().getLogin());
		Sleep(3000);
	}

	@Given("user click the usermanagement button and naviagtes to user management page")
	public void user_click_the_usermanagement_button_and_naviagtes_to_user_management_page() throws Throwable {
		clickOnElement(pom.getTrustpage().getUsermanage());
	}

	@When("user click add user button and add a new user popups")
	public void user_click_add_user_button_and_add_a_new_user_popups() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getTrustpage().getAdduser());

	}

	@When("user enter the name and email address and click the creator button")
	public void user_enter_the_name_and_email_address_and_click_the_creator_button() throws Throwable {
		String userc = filereadermanager.getInstanceFRM().getInstanceCR().getuserc();
		Inputvalues(pom.getTrustpage().getName(), userc);
		Sleep(3000);
		String email1 = filereadermanager.getInstanceFRM().getInstanceCR().getemail1();
		Inputvalues(pom.getTrustpage().getEmail1(), email1);
		clickOnElement(pom.getTrustpage().getCreator());
		waitForSeconds(20);
		Takescreenshot("pic.PNG");

	}

	@When("user click the create user button and success message pops up")
	public void user_click_the_create_user_button_and_success_message_pops_up() throws Throwable {
		clickOnElement(pom.getTrustpage().getCreate());
		Sleep(3000);
	}

	@When("user click the Add user button and add a new User popups")
	public void user_click_the_Add_user_button_and_add_a_new_User_popups() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getTrustpage().getAdduser());
	}

	@When("user enter the Name and Email address and Click the approver button")
	public void user_enter_the_Name_and_Email_address_and_Click_the_approver_button() throws Throwable {
		String usera = filereadermanager.getInstanceFRM().getInstanceCR().getusera();
		Inputvalues(pom.getTrustpage().getName(), usera);
		Sleep(3000);
		String email2 = filereadermanager.getInstanceFRM().getInstanceCR().getemail2();
		Inputvalues(pom.getTrustpage().getEmail1(), email2);
		clickOnElement(pom.getTrustpage().getApprover());
		Sleep(3000);
	}

	@When("user click the create User button and Success message pops up")
	public void user_click_the_create_User_button_and_Success_message_pops_up() throws Throwable {
		clickOnElement(pom.getTrustpage().getCreate());
		waitForSeconds(20);
		Takescreenshot("pic1.PNG");
	}
	
	@Then("user click the logout button and naviagtes to login page")
	public void user_click_the_logout_button_and_naviagtes_to_login_page() throws Throwable {
	 //  clickOnElement(pom.getTrustpage().getAcc());
	 //  Sleep(3000);
	//   clickOnElement(pom.getTrustpage().getLogout());
	}

}
