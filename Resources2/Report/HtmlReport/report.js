$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("publish.feature");
formatter.feature({
  "line": 2,
  "name": "publish login",
  "description": "",
  "id": "publish-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@publish"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "publish Login",
  "description": "",
  "id": "publish-login;publish-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user Launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the Email Address in text box Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the Password in text box Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click the Login Button and It Navigates to Current New Resources page",
  "keyword": "Then "
});
formatter.match({
  "location": "publish_def.user_Launch_the_URL()"
});
formatter.result({
  "duration": 7607567300,
  "status": "passed"
});
formatter.match({
  "location": "publish_def.user_enter_the_Email_Address_in_text_box_Field()"
});
formatter.result({
  "duration": 203642000,
  "status": "passed"
});
formatter.match({
  "location": "publish_def.user_Enter_the_Password_in_text_box_Field()"
});
formatter.result({
  "duration": 78868900,
  "status": "passed"
});
formatter.match({
  "location": "publish_def.user_Click_the_Login_Button_and_It_Navigates_to_Current_New_Resources_page()"
});
formatter.result({
  "duration": 4069858800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "create new resources",
  "description": "",
  "id": "publish-login;create-new-resources",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user click the Create new resources button",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user select the resources type and enter the resource title",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user select the Topic and age group",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user select the Upload Documents and click the Upload Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user view list of Current Tags and select the Tags",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Enter the Tags and Add the tags",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select the Publish Radio button and Approver button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click Submit for Approval and success message pop up",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user click the account and Logout button and Logout successfully",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user login as approver by using email and password and click login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click the Recently Added notification button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user click the Approve button and Success message pops up",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user click logout button and logging out from approver",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user login as Content creator by using email and password",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click my notification button and select the recently added resources",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click the publish button and click okay button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user click the unpublish button and click okay button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user click the logout button in the dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "publish_def.user_click_the_Create_new_resources_button()"
});
formatter.result({
  "duration": 6108095300,
  "status": "passed"
});
formatter.match({
  "location": "publish_def.user_select_the_resources_type_and_enter_the_resource_title()"
});
formatter.result({
  "duration": 3265374000,
  "status": "passed"
});
formatter.match({
  "location": "publish_def.user_select_the_Topic_and_age_group()"
});
formatter.result({
  "duration": 7041274200,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MW-LAPTOP-002\u0027, ip: \u0027192.168.43.122\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\MEDIWA~2\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53449}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f245d985890c1f478f2d00f2456af416\n*** Element info: {Using\u003dxpath, value\u003d(//div[contains(@class,\u0027css-198170r-control\u0027)])[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.Resources.Base_class.clickOnElement(Base_class.java:51)\r\n\tat com.Step_Definitions.publish_def.user_select_the_Topic_and_age_group(publish_def.java:69)\r\n\tat ✽.And user select the Topic and age group(publish.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "publish_def.user_select_the_Upload_Documents_and_click_the_Upload_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_view_list_of_Current_Tags_and_select_the_Tags()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_Enter_the_Tags_and_Add_the_tags()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_Select_the_Publish_Radio_button_and_Approver_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_Submit_for_Approval_and_success_message_pop_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_the_account_and_Logout_button_and_Logout_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_login_as_approver_by_using_email_and_password_and_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_the_Recently_Added_notification_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_the_Approve_button_and_Success_message_pops_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_logout_button_and_logging_out_from_approver()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_login_as_Content_creator_by_using_email_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_my_notification_button_and_select_the_recently_added_resources()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_the_publish_button_and_click_okay_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_the_unpublish_button_and_click_okay_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "publish_def.user_click_the_logout_button_in_the_dashboard()"
});
formatter.result({
  "status": "skipped"
});
});