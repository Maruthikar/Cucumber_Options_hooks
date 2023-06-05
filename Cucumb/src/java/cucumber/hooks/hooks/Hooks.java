package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	WebDriver driver; 
	
	
	@Before

	@Given("I Enter The given URL")
	public void i_enter_the_given_url() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String demo = driver.getTitle();
		System.out.println("---Print Title--- :" +demo);
		System.out.println("----Tutorialsninja----");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	}

	@When("I Click on My Account")
	public void i_click_on_my_account() throws InterruptedException {
		
		WebElement account = driver.findElement(By.xpath("//*[.='My Account']"));
		drawbBrowder(account, driver);
		Thread.sleep(2000);
		account.click();
		String My = driver.getTitle();
		System.out.println("--My Account title-- : "+ My);
		Thread.sleep(2000);
		System.out.println("----Tutorialsninja My Account----");
		
	}
	
	
	@Then("I click on login")
	public void i_click_on_login() throws InterruptedException {
		
		WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
		drawbBrowder(login, driver);
		Thread.sleep(2000);
		login.click();
		String logttile =driver.getTitle();
		System.out.println("-----Get Title After Login Is -----" +logttile);
		
	}
	

	@And("It show login details")
	public void it_show_login_details() throws InterruptedException {
	
		Thread.sleep(1000);
	String  log = driver.getTitle();
	System.out.println("----- It show login details -----" +log);
	Thread.sleep(1000);
	}
	

	@Given("I enter valid username \"([^\"]*)\" input feilds")
	public void i_enter_valid_username_input_feilds(String email) {
		
		System.out.println("----- -Before Email Entered--------");
		WebElement us = driver.findElement(By.xpath("//input[@id='input-email']"));
		drawbBrowder(us, driver);
		us.sendKeys(email);
	
	}

	@Then("I enter Valid password \"([^\"]*)\" input feilds")
	public void i_enter_valid_password_input_feilds(String password) {
		
		System.out.println("----- -Before Password Entered--------");
		WebElement pa = driver.findElement(By.id("input-password"));
		drawbBrowder(pa, driver);
		pa.sendKeys(password);
	}
	
	

	@And("I click on Login button")
	public void i_click_on_login_button() {
		WebElement btn = driver.findElement(By.className("btn btn-primary"));
		drawbBrowder(btn, driver);
		btn.click();
		
	}
	
	@After
	public void close() {
		driver.quit();
	}
	
public static void drawbBrowder(WebElement element,WebDriver Driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	
	
}
