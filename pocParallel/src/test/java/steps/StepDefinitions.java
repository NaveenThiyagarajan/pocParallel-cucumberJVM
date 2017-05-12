package steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	protected WebDriver wd;
//	private String seleniumUrl = "http://127.0.0.1:4444/wd/hub";
//	private DesiredCapabilities chromeCapabilities;
//	private ChromeOptions chromeOptions;
//	
	@Before
	public void before() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThiyagaN\\Downloads\\chromedriver.exe");
		wd = new ChromeDriver();
//		
//        this.chromeCapabilities = DesiredCapabilities.chrome();
//        this.chromeCapabilities.setJavascriptEnabled(true);
//        
//        ChromeOptions options = new ChromeOptions();
//        Map<String, Object> prefs = new HashMap<String, Object>();
//        Map<String, Object> contentSetting = new HashMap<String, Object>();
//
//        contentSetting.put("multiple-automatic-downloads",1);
//
//        prefs.put("download.prompt_for_download", "false");
//        prefs.put("profile.default_content_settings", contentSetting);
//
//        options.setExperimentalOption("prefs", prefs);
//        this.chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        
//        String locale = "de"; // "en"; // "fr";
//        String locales = "de-DE,de"; // "en-US,en"; // "fr-FR,fr";
//        
//        this.chromeOptions = new ChromeOptions();
//        this.chromeOptions.addArguments("--lang="+locale);
//            
//        // Change Chrome language preferences to german
//        this.chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, this.chromeOptions);
//        Map<String, String> chromePrefs = new HashMap<String,String>();
//        chromePrefs.put("settings.language.preferred_languages", locales);
//        chromePrefs.put("intl.accept_languages", locales);
//        this.chromeOptions.setExperimentalOption("prefs", chromePrefs);
//        this.chromeCapabilities.setCapability("chrome.prefs", chromePrefs);
//        
//        //wd = new RemoteWebDriver(new URL(System.getProperty("selenium-url", seleniumUrl)), this.chromeCapabilities, this.chromeCapabilities);
//		wd = new RemoteWebDriver(new URL(System.getProperty("selenium-url", seleniumUrl)), this.chromeCapabilities);
	}
	
	@When("^the page \\[(.*?)\\] is loaded$")
	public void openPage(String url) throws Exception {
		wd.get(url);
		wd.close();
}
		
	@After
	public void after() {
		wd.quit();
	}
	
	@Given("^I am on the Google search page on chrome")
	public void I_am_on_the_google_search_page_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThiyagaN\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Step 1 - getting the Google page and searching for IRCTC
			driver.get("http://www.bing.com/");
			Thread.sleep(5000);
			//driver.findElement(By.id("sb_ifc0")).click();
			driver.findElement(By.id("sb_form_q")).sendKeys("IRCTC");
			driver.findElement(By.xpath("//input[@name='go']")).click();
	}
	
	@Given("^I am on the Google search page on firefox")
	public void I_am_on_the_google_search_page_firefox() throws Throwable {
		 WebDriver driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Step 1 - getting the Google page and searching for IRCTC
			driver.get("http://google.co.in");
			Thread.sleep(5000);
			//driver.findElement(By.id("sb_ifc0")).click();
			driver.findElement(By.id("lst-ib")).sendKeys("IRCTC");
			driver.findElement(By.xpath("//button[@name='btnG']")).click();
	}

	@When("^I search for \"(.+)\"$")
	public void I_search_for(String searchText) throws Throwable {
		System.out.println("Executing this funtion" + searchText);
	}

	@Then("^the site \"(.+)\" should be present in the results$")
	public void the_result_should_contain_url(String searchText) throws Throwable {
		System.out.println("Executing this funtion" + searchText);
	}
}