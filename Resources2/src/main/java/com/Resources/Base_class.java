package com.Resources;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	public static WebDriver driver;
	 
	public static WebDriver get_Driver(String type) {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("use-fake-ui-for-media-stream");
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
         
			driver = new ChromeDriver(options);

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void Inputvalues(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void waitForSeconds(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}

	public static void actionsMethod(WebElement move) {
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();

	}

	public static void frame_Into(WebElement frame) {
		driver.switchTo().frame(frame);

	}

	public static void frame_Out() {

		driver.switchTo().defaultContent();

	}

	public static void Sleep(int a) throws InterruptedException {
		Thread.sleep(a);

	}

	public static void Takescreenshot(String file) throws Exception {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File(System.getProperty("user.dir") + "\\Screenshot\\" + file);
		FileUtils.copyFile(sou, Des);

	}

	public static void scroll_Down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 500)", " ");

	}

	public void actionsClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public static void jsclick(WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", webElement);
	}

	public static void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void dropdownSelectByVisibleText(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByVisibleText(a);
	}

	
	public WebDriver initWebDriver1() {
	     ChromeOptions options = new ChromeOptions();
	     @SuppressWarnings("unused")
		HashMap<String, Integer> contentsettings = new HashMap<String, Integer>();
	     @SuppressWarnings("unused")
		HashMap<String, Object> profile = new HashMap<String, Object>();
	     HashMap<String , Object> prefs = new HashMap<String, Object>();
	     options.addArguments("use-fake-device-for-media-stream");
	     options.addArguments("use-fake-ui-for-media-stream");
	     prefs = new HashMap<String, Object>();
	     prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
	     prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
	     prefs.put("profile.default_content_setting_values.geolocation", 1);
	     prefs.put("profile.default_content_setting_values.notifications", 1);
	     options.setExperimentalOption("prefs", prefs);
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Mediwave\\eclipse-workspace\\Hereworcs\\Driver\\chromedriver.exe");
	     return new ChromeDriver(options);
	 }

	public static void Webdriverwait(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void windowhandles(String title1) throws IOException {
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!parent.equals(string)) {
				String title = driver.getTitle();
				if (title.equalsIgnoreCase(title1)){
					driver.switchTo().window(string);
				}
				
			}
	}
	
	
	
	
	
	
	}
	
	

}
